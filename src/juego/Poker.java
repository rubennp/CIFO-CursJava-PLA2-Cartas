package juego;

import java.util.ArrayList;

import cartas.Carta;
import cartas.Francesa;

/**
 * 
 * Extiende la clase Juego para jugar al póquer.
 * 
 * @author Rubèn Nieto
 *
 */
public class Poker extends Juego {
	private Francesa baraja = new Francesa();
	
	/**
	 * Constructor de la clase Poker.
	 * @param jugadores son los jugadores que jugarán.
	 */
	public Poker(ArrayList<Jugador> jugadores) {
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
