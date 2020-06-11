package gui;

import java.awt.Color;
import java.awt.TextField;

public class PinDisplay {
	public static TextField[][] Pin=new TextField[8][4];
	public PinDisplay(LGSGui lgg){
		
		for(int j=0;j<4;j++){
			   for(int i=0;i<8;i++){
				   
				Pin[i][j] = new TextField(""+i,14);
	   			Pin[i][j].setBounds(130+300*j, 140+71*i, 33, 39);
	   			Pin[i][j].setEditable(false);
	   			if(j==3){
	   				Pin[i][j].setBackground(Color.red);
					   }
				   else{
					   Pin[i][j].setBackground(Color.white);
				   }
	   			lgg.jpanel.add(Pin[i][j]);
			   }}}
}
