package fr.campus.academy.model;

public class Board {

	private Subblock[][] blocks = new Subblock[10][20];

	public Subblock[][] getBlocks() {
		return blocks;
	}

	public void setBlocks(Subblock[][] blocks) {
		this.blocks = blocks;
	}
	
	
}
