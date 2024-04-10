package fr.diginamic.banque.entites;

abstract class Operation {

	protected String date;
	protected double montant;
	
	public Operation(String date, double montant) {
		super();
		this.date = date;
		this.montant = montant;
	}

	 public abstract void effectuerOperation();
	    
	    public abstract String getType();

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public double getMontant() {
			return montant;
		}

		public void setMontant(double montant) {
			this.montant = montant;
		}
 
}


