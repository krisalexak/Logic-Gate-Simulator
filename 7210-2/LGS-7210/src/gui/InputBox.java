package gui;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class InputBox {
	public InputBox(LGSGui lgg,int row,int x, int y, int width, int height){
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(x, y, width, height);
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"false", "true"}));
		lgg.jpanel.add(comboBox);
		comboBox.setVisible(true);
		comboBox.addActionListener(new InputBoxHandler(row));
	}

}
