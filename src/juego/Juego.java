package juego;

import java.util.Scanner;

import cartas.Carta;

import java.util.ArrayList;

/**
 * 
 * Clase abstracta (de la que heredan Mus y Poker).
 *  
 * @author Rubèn Nieto
 *
 */
public abstract class Juego {
	ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	/**
	 * Constructor de la clase.
	 * @param jugadores serán los jugadores que jugarán.
	 */
	public Juego(ArrayList<Jugador> jugadores) {
		if (jugadores.size() >= 2) this.jugadores.addAll(jugadores);
		else {
			Scanner in = new Scanner(System.in);
			
			System.out.println("¡Faltan jugadores!");
			while (jugadores.size() >= 2) {
				System.out.println("* Añade un jugador: ");
				Jugador nuevoJugador = new Jugador(in.nextLine());
				this.addJugador(nuevoJugador);
			}
			in.close();
		}
	}
	
	/**
	 * Almacena un nuevo jugador.
	 * @param j es el nuevo jugador a almacenar.
	 */
	void addJugador(Jugador j) {
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
