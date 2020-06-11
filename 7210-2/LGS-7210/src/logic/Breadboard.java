package logic;

import gates.*;

public class Breadboard {

	public static final int rows=8;
	public static final int columns=4;
	public int[][] pins;
	public int numberOfGates;
	public AbstractGate[] gates = new AbstractGate[100]; 
	private int gatePointer = 0;
	
	
	public Breadboard(){ 
		pins = new int[rows][columns];
	}
	
	
	
	public void addGate(int in1, int in2, int out,String type,int column){ 
		switch(type){
		case "AND":
			gates[gatePointer] = new AND(pins[in1][column-1], pins[in2][column-1], pins[out][column]);
			break;
		case "OR":
			gates[gatePointer] = new OR(pins[in1][column-1], pins[in2][column-1], pins[out][column]);
			break; 
		case "NAND":
			gates[gatePointer] = new NAND(pins[in1][column-1], pins[in2][column-1], pins[out][column]);
			break;
		case "NOR":
			gates[gatePointer] = new NOR(pins[in1][column-1], pins[in2][column-1], pins[out][column]);
			break;
		case "XOR":
			gates[gatePointer] = new XOR(pins[in1][column-1], pins[in2][column-1], pins[out][column]);
			break;
		case "NOT":
			gates[gatePointer] = new NOT(pins[in1][column-1], pins[out][column]);
			break;
			}
		pins[out][column] = gates[gatePointer].operate();
		gates[gatePointer].input1=in1;
		gates[gatePointer].input2=in2;
		gates[gatePointer].output=out;
		gates[gatePointer].type=type;
		gates[gatePointer].stili=column;
		numberOfGates=++gatePointer;
	}
	
	public void toggleSwitch(int row){ 
		if (pins[row][0] == 1) {pins[row][0] = 0; }
		else { pins[row][0] = 1; }
	}
	
}
