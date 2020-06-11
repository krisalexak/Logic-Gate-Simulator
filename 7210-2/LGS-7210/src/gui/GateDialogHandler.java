package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GateDialogHandler implements ActionListener{
	public static GateDialog gatee;
	LGSGui lgg;
	String gate;
	private String gateJpg;
	public static int flag=0;
	public GateDialogHandler(GateDialog gatee,String gate){
	    this.lgg = gatee.lgg;
	    GateDialogHandler.gatee=gatee;
	    this.gate=gate;
	}
	public void actionPerformed(ActionEvent buttonPress){
		Object src = buttonPress.getActionCommand();
	    if (src.equals("OK")){ 
	    	LGSGui.myBreadboard.addGate(gatee.temp_x1,gatee.temp_x2,gatee.temp_y,gate,gatee.temp_stili);
	       
	    	switch(gate){
	    	case "AND":
	    		gateJpg="and.jpg";
	    		break;
	    	case "NOR":
	    		gateJpg="nor.jpg";	
	    		break;
	    	case "OR":
	    		gateJpg="or.jpg";
	    		break;
	    	case "NAND":
	    		gateJpg="nand.jpg";
	    		break;
	    	case "XOR":
	    		gateJpg="xor.jpg";	
	    		break;
	    	case "NOT":
	    		gateJpg="not.jpg";
	    		break;
	    		 }
	    	
	    	for(int j=0;j<4;j++){
				for(int i=0;i<8;i++){
					if(gatee.temp_stili==j+1){
						if(gatee.temp_y==i){
							ImageIcon image=new ImageIcon(getClass().getResource(gateJpg));
			    			JLabel label=new JLabel(image);
			    			label.setBounds(270+300*j, 140+71*i, 44, 40);
			    			lgg.jpanel.add(label);
			          		label.setVisible(true);
			          		label.repaint();
			          		flag=1;
			          		lgg.jframe.repaint();
			    	    	break;
			          		}
					}
				}
		}
	    	GateDialogHandler.gatee.dispose();
	    	
	    	
	    }
	    if (src.equals("Cancel")){
	    	GateDialogHandler.gatee.dispose();
	    }
	}
	
}