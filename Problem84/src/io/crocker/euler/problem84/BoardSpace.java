package io.crocker.euler.problem84;

public class BoardSpace {
	private String spaceCode;
	private String sequenceCode;
	private int landed;
	
	// Calculated
	private float probability;
	
	public BoardSpace(String spaceCode, String sequenceCode) {
		this.spaceCode = spaceCode;
		this.sequenceCode = sequenceCode;
		this.landed = 0;
		
		this.calculateProbability();
	}
	
	private void calculateProbability() {
		this.probability = this.landed / Problem84.ITERATIONS;
	}

	public String getSpaceCode() {
		return spaceCode;
	}

	public void setSpaceCode(String spaceCode) {
		this.spaceCode = spaceCode;
	}

	public String getSequenceCode() {
		return sequenceCode;
	}

	public void setSequenceCode(String sequenceCode) {
		this.sequenceCode = sequenceCode;
	}

	public int getLanded() {
		return landed;
	}

	public void setLanded(int landed) {
		this.landed = landed;
	}

	public float getProbability() {
		return probability;
	}
	
	public float getProbabilityFormat() {
		return ((this.getProbability() * 100));
	}
	
	public void incrementLandings() {
		this.landed++;
		this.calculateProbability();
		
		System.out.println(this.spaceCode);
		System.out.println(this.getLanded());
	}
}
