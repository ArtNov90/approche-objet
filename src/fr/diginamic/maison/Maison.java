package fr.diginamic.maison;

public abstract class Maison{

	  private Piece[] pieces;
	  
	  public abstract Piece ajouterPiece(Piece piece);

	public Piece[] getPieces() {
		return pieces;
	}

	public void setPieces(Piece[] pieces) {
		this.pieces = pieces;
	}
	
	public abstract double getSuperficieTotale();
	
	public void afficherSuperficieTotale() {
		
		return;
		
	}
	
	public abstract double getSuperficieParEtage();
	
}
