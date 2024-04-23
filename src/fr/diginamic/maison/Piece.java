package fr.diginamic.maison;

abstract class Piece {
	protected double superficie;
	protected int etage;
	
	public Piece(double superficie, int etage) {
		super();
		this.superficie = superficie;
		this.etage = etage;
	}
}
