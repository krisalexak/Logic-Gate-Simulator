package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import logic.Circuit;

public class SimButton {
	public SimButton(LGSGui lgg){
		JButton sim = new JButton("Simulate");
		sim.setBounds(39, 20, 165, 52);
		lgg.jpanel.add(sim);
		sim.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		LGSGui.myCircuit=new Circuit(LGSGui.myFinalBreadboard,LGSGui.myBreadboard);
		LGSGui.myCircuit.runCircuit();
		 for(int j=0;j<4;j++){
				for(int i=0;i<8;i++){
					if(LGSGui.myFinalBreadboard.pins[i][j]==1){
						PinDisplay.Pin[i][j].setText("true");
						PinDisplay.Pin[i][j].setBackground(Color.green);
	    		}
	            }
	        }
					}
				});
	}

}
