package fr.diginamic.banque.entites;

public class Credit extends Operation {
    
    public Credit(String date, double montant) {
        super(date, montant);
    }

    @Override
    public void effectuerOperation() {
        System.out.println("Opération de crédit le " + getDate() + " d'un montant de " + getMontant() + " euros");
    }

    @Override
    public String getType() {
        return "CREDIT";
    }
}
