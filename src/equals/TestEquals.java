package equals;

public class TestEquals {

	public static void main(String[] args) {
		Ville ville1 = new Ville("Paris", 2200000);
		Ville ville2 = new Ville("Montpellier", 3000000);

		System.out.println("Les villes sont-elles égales ? " + ville1.equals(ville2));

	}

}
