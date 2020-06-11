package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GateButton{

	public GateButton(LGSGui lgg,final String gate,int x, int y, int width, int height ){
		JButton gateButton = new JButton(gate);
		gateButton.setBounds(x, y, width, height);
		lgg.jpanel.add(gateButton);
		gateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				new GateDialog(logic.LGSMain.myLGSGui,gate);
				
			}
		});
	}

}
