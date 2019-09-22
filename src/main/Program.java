package main;

import java.util.ArrayList;

import juego.Jugador;
import juego.Mus;
import juego.Poker;

/**
 * 
 * Programa para lanzar juegos de cartas.
 * ------------------------------------- 
 * Activitat del PLA2 del Curs de desenvolupament Java.
 * 
 * CIFO Hospitalet (PQTM'2019)
 * Professor: Juan Pablo Fuentes
 * 
 * @author Rubèn Nieto
 *
 */
public class Program {

	/**
	 * Entrada al programa
	 * @args son los parámetros pasados al programa por consola, si los hay.
	 */
	public static void main(String[] args) {
		ArrayList<Jugador> jugadoresMus = new ArrayList<Jugador>();
		ArrayList<Jugador> jugadoresPoker = new ArrayList<Jugador>();
		
		Jugador jugador1 = new Jugador("Jugador 1");
		Jugador jugador2 = new Jugador("Jugador 2");
		Jugador jugador3 = new Jugador("Jugador 3");
		Jugador jugador4 = new Jugador("Jugador 4");
		
		jugadoresMus.add(jugador1);
		jugadoresMus.add(jugador2);
		jugadoresPoker.add(jugador3);
		jugadoresPoker.add(jugador4);
		
		Mus mus = new Mus();
		for (Jugador j : jugadoresMus) mus.addJugador(j);
			
		System.out.println("* Jugarán al Mus:");
		System.out.print("-> ");
		for (Jugador jugador : mus.getJugadores()) System.out.print(jugador.getNombre() + " ");
		System.out.println("\nCon las cartas : " + mus.getBaraja());
		
		try {
			Poker poker = new Poker(jugadoresPoker);
			System.out.println("\n* Jugarán al Poker:");
			System.out.print("-> ");
			for (Jugador jugador : poker.getJugadores()) System.out.print(jugador.getNombre() + " ");
			System.out.println("\nCon las cartas : " + poker.getBaraja());
		} catch (Exception e) {
			System.out.println("\nERROR Poker : " + e.getMessage());
		}
	}
}
