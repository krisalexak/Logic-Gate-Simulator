package gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;


public class DrawRight {
	
	
	static int table[][]=new int [100][2];
	static String gateType[]=new String [100];
	static int noLines=1;
		public DrawRight(Graphics g){
			table[noLines-1][0]=GateDialogHandler.gatee.temp_stili;
			table[noLines-1][1]=GateDialogHandler.gatee.temp_y;
			gateType[noLines-1]=GateDialogHandler.gatee.gate;
		 
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(3));
			for(int i=0;i<noLines;i++){
				switch(gateType[i]){
		    	case "AND":
		    		g.setColor(Color.red);
		    		break;
		    	case "NOR":
		    		g.setColor(Color.black);	
		    		break;
		    	case "OR":
		    		g.setColor(Color.cyan);
		    		break;
		    	case "NAND":
		    		g.setColor(Color.white);
		    		break;
		    	case "XOR":
		    		g.setColor(Color.yellow);	
		    		break;
		    	case "NOT":
		    		g.setColor(Color.blue);
		    		break;
		    		 }
				g2.draw(new Line2D.Float(290+(table[i][0]-1)*300,160+table[i][1]*71,435+(table[i][0]-1)*300,160+table[i][1]*71));
			}
			noLines++;
}}
