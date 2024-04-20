package fr.diginamic.banque.entites;

public class Debit extends Operation {
	public Debit(String date, double montant) {
		super(date, montant);
	}
	
	 @Override
	    public void effectuerOperation() {
	        System.out.println("Opération de débit le " + date + " d'un montant de " + montant + " euros");
	    }
	    
	    @Override
	    public String getType() {
	        return "DEBIT";
	    }
	}

