package main;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Baraja {
	protected ArrayList<Carta> cartas = new ArrayList<Carta>();
	
	public void barajar() {
		Collections.shuffle(cartas);
	}
	
	public Carta repartir() {
		Carta carta = cartas.get(0);
		cartas.remove(0);
		
		return carta;
	}
	
	public abstract void reiniciar();
}
