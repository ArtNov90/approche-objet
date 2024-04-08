package entites;

public class TestAdressePostale {

	public static void main(String[] args) {

		AdressePostale adr1 = new AdressePostale();
		AdressePostale adr2 = new AdressePostale();
		
		adr1.numeroRue = 47;
		adr1.codePostale = 34970;
		adr1.nomRue = "passage des ombrettes";
		adr1.ville = "Montpellier";
		
		
		adr2.numeroRue = 3;
		adr2.codePostale = 34000;
		adr2.nomRue = "rue des genets";
		adr2.ville = "Maurin";
		
		
		

	}

}
