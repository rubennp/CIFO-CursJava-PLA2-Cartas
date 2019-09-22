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
	 * Constructor
	 * @param jugadores son los jugadores del juego.
	 */
	public Mus(ArrayList<Jugador> jugadores) {
		super(jugadores);
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
