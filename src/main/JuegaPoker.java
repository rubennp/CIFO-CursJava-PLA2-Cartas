package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

import juego.Jugador;
import juego.Poker;

public class JuegaPoker {

	public static void main(String[] args) {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		Scanner inNumJugadores = new Scanner(System.in);
		
		System.out.println("Juguemos al POKER:");
		System.out.println("------------------");
		System.out.println("* Cuantos jugadores? ");
		
		try {
			int nJugadores = inNumJugadores.nextInt();
			
			Scanner inNomJugadores = new Scanner(System.in);
			
			do {
				System.out.println("* Nombre del jugador " + (jugadores.size()+1) + ":");
				Jugador nuevoJugador = new Jugador(inNomJugadores.nextLine());
				jugadores.add(nuevoJugador);
			} while (jugadores.size() < nJugadores);
			
			try {
				Poker poker = new Poker(jugadores);
				
				System.out.println("-> Jugadores : " + poker.getJugadores());
				System.out.println("-> Baraja : " + poker.getBaraja());
			} catch (Exception e) {
				System.out.println("\nERROR: " + e.getMessage());
			} finally {
				inNomJugadores.close();
			}
		} catch (InputMismatchException e) {
			System.out.println("ERROR: ¡Debes introducir un número entero para el número de participantes!");
		} finally {
			inNumJugadores.close();
		}
	}
}
