package main;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * Clase abstracta Baraja (de ella heredan Francesa y Española).
 * 
 * @author Rubèn Nieto
 *
 */
public abstract class Baraja {
	protected ArrayList<Carta> cartas = new ArrayList<Carta>();
	
	/**
	 * Baraja la baraja de cartas
	 */
	public void barajar() {
		Collections.shuffle(cartas);
	}
	
	/**
	 * Reparte una carta y la quita de la baraja actual.
	 * @return la carta dada al jugador y retirada de la baraja.
	 */
	public Carta repartir() {
		Carta carta = cartas.get(0);
		cartas.remove(0);
		
		return carta;
	}
	
	/**
	 * Reinicia la baraja (clase abstracta: se implementa en cada clase hija).
	 */
	public abstract void reiniciar();
}
