package gui;

import java.awt.Color;
import java.awt.Graphics;
import logic.Breadboard;
import logic.Circuit;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LGSGui extends JFrame {
	public static Breadboard myBreadboard;
	public static Breadboard myFinalBreadboard;
	public static Circuit myCircuit;	
	public JPanel jpanel;
	public JFrame jframe;
	public LGSGui(){
		//breadboard 
		myBreadboard = new Breadboard();
		myFinalBreadboard=new Breadboard();
		
		//frame
		jframe=new JFrame();
		jframe.setTitle("~LGS~");
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setExtendedState(MAXIMIZED_BOTH); 
		jframe.add(jpanel=new JPanel(){
			public void paintComponent(Graphics g){
				super.paintComponent(g);
				g.setColor(new Color(0,180,0));
		        g.fillRect(0,75 ,1400, 1400);
		        if(GateDialogHandler.flag==1){
		        	new DrawRight(g);
		        	new DrawLeft(g);
		        }
	        }
		});
		//panel
		jpanel.setBackground(Color.BLACK);
		jpanel.setLayout(null);
		//--------------------------------------------------------------------------------------------
		
		new SimButton(this);
		
		new GateButton(this,"AND",298, 20, 165, 52);
		new GateButton(this,"OR",475, 20, 165, 52);
		new GateButton(this,"NOT",652, 20, 165, 52);
		new GateButton(this,"NAND",829, 20, 165, 52);
		new GateButton(this,"NOR",1006, 20, 165, 52);
		new GateButton(this,"XOR",1183, 20, 165, 52);
		
		for (int i=0;i<8;i++){
			new InputBox(this,i,30, 140+71*i, 65, 39);
		}
		new PinDisplay(this);
		
		jpanel.setVisible(true);
		jpanel.repaint();
		}
}
