package gui;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InputBoxHandler implements ActionListener{
	private int row;
	public InputBoxHandler(int row){
		this.row=row;
	}
	public void actionPerformed(ActionEvent combo){
		LGSGui.myFinalBreadboard.toggleSwitch(row);
	}

}
