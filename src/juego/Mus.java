package juego;

import java.util.ArrayList;

import cartas.Carta;
import cartas.Española;

/**
 * 
 * Extiende la clase Juego para jugar al mus.
 * 
 * @author Rubèn Nieto
 *
 */
public class Mus extends Juego {
	private Española baraja = new Española();
	
	/**
	 * Constructor sin parámetros.
	 */
	public Mus() {
		super();
		this.baraja.barajar();
	}
	
	/**
	 * Obtener la baraja actual del juego.
	 * @return la baraja actual.
	 */
	public ArrayList<Carta> getBaraja() {
		return this.baraja.getCartas();
	}
	
}
