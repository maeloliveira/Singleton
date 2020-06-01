package exercicio_3_2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
	public Deck( ) {
		cartas = new ArrayList<Cartas>( );
		// build the deck
		Suit[] suits = {Suit.ESPADA, Suit.CORAÇAO, Suit.PAUS,

				Suit.OUROS};
		for(Suit suit: suits) {
			for(int i = 2; i <= 14; i++) {
				cartas.add(new Cartas(suit, i));
			}
		}

		// shuffle it!
		Collections.shuffle(cartas, new Random( ));
	}
	public void print( ) {
		for(Cartas Cartas: cartas) {
			Cartas.print( );
		}
	}
	private List<Cartas> cartas;
	private static Deck singletonInstance;

	synchronized static Deck getInstance() {
		if (singletonInstance == null)
			singletonInstance = new Deck();

		return singletonInstance;
	}
}



