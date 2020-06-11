package gui;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class GateDialog extends JDialog implements ItemListener
{
  LGSGui lgg;
  JComboBox<String> column;
  JComboBox<String> eisodos1;
  JComboBox<String> eisodos2;
  JComboBox<String> eksodos;
  JButton ok;
  JButton cancel;
  JLabel lcolumn;
  JLabel leisodos1;
  JLabel leisodos2;
  JLabel leksodos;
  int temp_stili=1;
  int temp_x1 = 0;
  int temp_x2 = 0;
  int temp_y = 0;
  String gate;
  
  public GateDialog(LGSGui lgg,String gate)
  {
    super(lgg, false);
    this.lgg = lgg;
    this.gate=gate;
    setTitle("GATE Properties");
    setSize(200, 200);
    setLocation(450, 250);
    setResizable(false);
    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints constraints = new GridBagConstraints();
    JComponent pane = (JComponent)getContentPane();
    pane.setLayout(gridbag);
    
    
    this.lcolumn = new JLabel("Column");
    buildConstraints(constraints, 0, 0, 1, 1, 60.0D, 100.0D, 0);
    gridbag.setConstraints(this.lcolumn, constraints);
    pane.add(this.lcolumn);
    
    this.column = new JComboBox<String>();
    this.column.addItem("1");
    this.column.addItem("2");
    this.column.addItem("3");
    this.column.setEditable(false);
    buildConstraints(constraints, 1, 0, 1, 1, 40.0D, 100.0D, 0);
    gridbag.setConstraints(this.column, constraints);
    this.column.addItemListener(this);
    pane.add(this.column);
    
    this.leisodos1 = new JLabel("Input 1");
    buildConstraints(constraints, 0, 1, 1, 1, 60.0D, 100.0D, 0);
    gridbag.setConstraints(this.leisodos1, constraints);
    pane.add(this.leisodos1);
    
    this.eisodos1 = new JComboBox<String>();
    this.eisodos1.addItem("0");
    for (int i = 1; i < 8; i++) {
      this.eisodos1.addItem(" " + i);
    }
    this.eisodos1.setEditable(false);
    buildConstraints(constraints, 1, 1, 1, 1, 40.0D, 100.0D, 0);
    gridbag.setConstraints(this.eisodos1, constraints);
    this.eisodos1.addItemListener(this);
    pane.add(this.eisodos1);
    
    if(gate!="NOT"){
    	this.leisodos2 = new JLabel("Input 2");
    	buildConstraints(constraints, 0, 2, 1, 1, 60.0D, 100.0D, 0);
    	gridbag.setConstraints(this.leisodos2, constraints);
    	pane.add(this.leisodos2);
    
    	this.eisodos2 = new JComboBox<String>();
    	this.eisodos2.addItem("0");
    	for (int i = 1; i < 8; i++) {
    		this.eisodos2.addItem(" " + i);
    		}
    	this.eisodos2.setEditable(false);
    	buildConstraints(constraints, 1, 2, 1, 1, 40.0D, 100.0D, 0);
    	gridbag.setConstraints(this.eisodos2, constraints);
    	this.eisodos2.addItemListener(this);
    	pane.add(this.eisodos2);
    }
    
    this.leksodos = new JLabel("Output");
    buildConstraints(constraints, 0, 3, 1, 1, 60.0D, 100.0D, 0);
    gridbag.setConstraints(this.leksodos, constraints);
    pane.add(this.leksodos);
    
    this.eksodos = new JComboBox<String>();
    this.eksodos.addItem("0");
    for (int i = 1; i < 8; i++) {
      this.eksodos.addItem(" " + i);
    }
    this.eksodos.setEditable(false);
    buildConstraints(constraints, 1, 3, 1, 1, 40.0D, 100.0D, 0);
    gridbag.setConstraints(this.eksodos, constraints);
    this.eksodos.addItemListener(this);
    pane.add(this.eksodos);
    
    this.ok = new JButton("OK");
    buildConstraints(constraints, 0, 4, 1, 1, 60.0D, 100.0D, 0);
    gridbag.setConstraints(this.ok, constraints);
    this.ok.addActionListener(new GateDialogHandler(this,gate));
    pane.add(this.ok);
    
    this.cancel = new JButton("Cancel");
    buildConstraints(constraints, 1, 4, 1, 1, 60.0D, 100.0D, 0);
    gridbag.setConstraints(this.cancel, constraints);
    this.cancel.addActionListener(new GateDialogHandler(this,gate));
    pane.add(this.cancel);
    
    setVisible(true);
  }
  
  public void itemStateChanged(ItemEvent gateProperties)
  {
    Object src = gateProperties.getSource();
    if (src == this.column)
    {
      Object timi_column = gateProperties.getItem();
      Double temp = new Double(timi_column.toString());
      this.temp_stili = temp.intValue();
      
    }
    if (src == this.eisodos1)
    {
      Object timi_eisodos1 = gateProperties.getItem();
      Double temp = new Double(timi_eisodos1.toString());
      this.temp_x1 = temp.intValue();
    }
    if (src == this.eisodos2)
    {
      Object timi_eisodos2 = gateProperties.getItem();
      Double temp = new Double(timi_eisodos2.toString());
      this.temp_x2 = temp.intValue();
    }
    if (src == this.eksodos)
    {
      Object timi_eksodos = gateProperties.getItem();
      Double temp = new Double(timi_eksodos.toString());
      this.temp_y = temp.intValue();
    }
  }
  
  private void buildConstraints(GridBagConstraints gbc, int x, int y, int w, int h, double wx, double wy, int fill)
  {
    gbc.gridx = x;
    gbc.gridy = y;
    gbc.gridwidth = w;
    gbc.gridheight = h;
    gbc.weightx = wx;
    gbc.weighty = wy;
    gbc.fill = fill;
  }
  
  
}

