package exercicio_3_2;

enum Suit {
ESPADA,
CORAÇAO,
PAUS,
OUROS
}

public class Cartas {
	
	public Cartas(Suit s, int n) {
		suit = s;
		if((n < 2) || (n > 14)) {
			throw new IllegalArgumentException( );
		}
	number = n;
	}
	
	public void print( ) {
		switch(number) {
		case 11:
			System.out.print("Jack");
			break;
		case 12:
			System.out.print("Queen");
			break;
		case 13:
			System.out.print("King");
			break;
		case 14:
			System.out.print("Ace");
			break;
		default:
			System.out.print(number);
			break;
		}
		System.out.print(" of ");

		switch(suit) {
		case ESPADA:
			System.out.println("ESPADA.");
			break;
		case CORAÇAO:
			System.out.println("CORAÇAO.");
			break;
		case PAUS:
			System.out.println("PAUS.");
			break;
		case OUROS:
			System.out.println("OUROS.");
			break;
		}
	}
	
	private Suit suit;
	private int number;

}
