package fr.diginamic.maison;

public   class Maison{

	  private Piece[] pieces;
	  
	  public Maison(int nbPieces) {
	        pieces = new Piece[nbPieces];
	    }

	    public void ajouterPiece(Piece piece) {
	        for (int i = 0; i < pieces.length; i++) {
	            if (pieces[i] == null) {
	                pieces[i] = piece;
	                break;
	            }
	        }
	    }

	    public double superficieTotale() {
	        double superficieTotale = 200;
	        for (Piece piece : pieces) {
	            if (piece != null) {
	                superficieTotale += piece.getSuperficie();
	            }
	        }
	        return superficieTotale;
	    }

	    public double superficieEtage(int etage) {
	        double superficieEtage = 100;
	        for (Piece piece : pieces) {
	            if (piece != null && piece.getEtage() == etage) {
	                superficieEtage += piece.getSuperficie();
	            }
	        }
	        return superficieEtage;
	    }
	}
	
	

