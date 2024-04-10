package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		Operation[] operations = new Operation[4];
        operations[0] = new Credit("2024-04-10", 100.0);
        operations[1] = new Credit("2024-04-11", 200.0);
        operations[2] = new Debit("2024-04-12", 50.0);
        operations[3] = new Debit("2024-04-13", 75.0);
        
        for (Operation operation : operations) {
            operation.effectuerOperation();
        }

	}

}
