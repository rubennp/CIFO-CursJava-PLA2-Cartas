package juego;

import java.util.ArrayList;

import cartas.Carta;

/**
 * 
 * Clase abstracta (de la que heredan Mus y Poker).
 *  
 * @author Rubèn Nieto
 *
 */
public abstract class Juego {
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	/**
	 * Constructor de clase sin parámetros (lo utiliza clase Mus).
	 */
	public Juego() { }
	
	/**
	 * Constructor clase con parámetros (lo utiliza clase Poker).
	 * @param jugadores serán los jugadores que jugarán.
	 */
	public Juego(ArrayList<Jugador> jugadores) throws Exception {
		if (jugadores.size() < 2) throw new Exception("¡Se necesitan al menos 2 jugadores para jugar!"); 
		else this.jugadores.addAll(jugadores);
	}
	
	/**
	 * Almacena un nuevo jugador.
	 * @param j es el nuevo jugador a almacenar.
	 */
	public void addJugador(Jugador j) {
		jugadores.add(j);
	}
	
	/**
	 * Obtener los jugadores.
	 * @return los jugadores del juego actual.
	 */
	public ArrayList<Jugador> getJugadores() {
		return this.jugadores;
	}
	
	/**
	 * Clase abstracta que se implementa en cada una de las clases hijas Mus y Poker.
	 * @return las cartas de la baraja actual.
	 */
	public abstract ArrayList<Carta> getBaraja();
}
