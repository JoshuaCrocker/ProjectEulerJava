package io.crocker.euler.problem84;

import java.util.ArrayList;

public class Board {
	private ArrayList<BoardSpace> spaces = new ArrayList<BoardSpace>();
	private int currentSpace = 0;
	
	public Board() {
		this.spaces.add(new BoardSpace("GO", "00"));
		this.spaces.add(new BoardSpace("A1", "01"));
		this.spaces.add(new BoardSpace("CC1", "02"));
		this.spaces.add(new BoardSpace("A2", "03"));
		this.spaces.add(new BoardSpace("T1", "04"));
		this.spaces.add(new BoardSpace("R1", "05"));
		this.spaces.add(new BoardSpace("B1", "06"));
		this.spaces.add(new BoardSpace("CH1", "07"));
		this.spaces.add(new BoardSpace("B2", "08"));
		this.spaces.add(new BoardSpace("B3", "09"));
		this.spaces.add(new BoardSpace("JAIL", "10"));
		this.spaces.add(new BoardSpace("C1", "11"));
		this.spaces.add(new BoardSpace("U1", "12"));
		this.spaces.add(new BoardSpace("C2", "13"));
		this.spaces.add(new BoardSpace("C3", "14"));
		this.spaces.add(new BoardSpace("R2", "15"));
		this.spaces.add(new BoardSpace("D1", "16"));
		this.spaces.add(new BoardSpace("CC2", "17"));
		this.spaces.add(new BoardSpace("D2", "18"));
		this.spaces.add(new BoardSpace("D3", "19"));
		this.spaces.add(new BoardSpace("FP", "20"));
		this.spaces.add(new BoardSpace("E1", "21"));
		this.spaces.add(new BoardSpace("CH2", "22"));
		this.spaces.add(new BoardSpace("E2", "23"));
		this.spaces.add(new BoardSpace("E3", "24"));
		this.spaces.add(new BoardSpace("R3", "25"));
		this.spaces.add(new BoardSpace("F1", "26"));
		this.spaces.add(new BoardSpace("F2", "27"));
		this.spaces.add(new BoardSpace("U2", "28"));
		this.spaces.add(new BoardSpace("F3", "29"));
		this.spaces.add(new BoardSpace("G2J", "30"));
		this.spaces.add(new BoardSpace("G1", "31"));
		this.spaces.add(new BoardSpace("G2", "32"));
		this.spaces.add(new BoardSpace("CC3", "33"));
		this.spaces.add(new BoardSpace("G3", "34"));
		this.spaces.add(new BoardSpace("R4", "35"));
		this.spaces.add(new BoardSpace("CH3", "36"));
		this.spaces.add(new BoardSpace("H1", "37"));
		this.spaces.add(new BoardSpace("T2", "38"));
		this.spaces.add(new BoardSpace("H2", "39"));
	}
	
	public void move(int spaces) {
		this.currentSpace = (this.currentSpace + spaces) % 40;
		this.spaces.get(this.currentSpace).incrementLandings();
	}
	
	public void outputProbability() {
		for (BoardSpace sp : this.spaces) {
			System.out.println(sp.getSpaceCode() + " " + sp.getProbabilityFormat());
		}
	}
}
