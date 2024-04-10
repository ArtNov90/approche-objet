package fr.diginamic.banque.entites;

public class Credit extends Operation{
	public Credit(String date, double montant) {
        super(date, montant);
        
        @Override
        public void effectuerOperation() {
            System.out.println("Opération de crédit le " + date + " d'un montant de " + montant + " euros");
        }
        
        @Override
        public String getType() {
            return "CREDIT";
        }
    
    }
}
