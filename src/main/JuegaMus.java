package main;

import java.util.ArrayList;
import java.util.Scanner;

import juego.Jugador;
import juego.Mus;

public class JuegaMus {

	public static void main(String[] args) {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Juguemos al MUS:");
		System.out.println("----------------");
		
		do {
			System.out.println("* Nombre del jugador " + (jugadores.size()+1) + ":");
			Jugador nuevoJugador = new Jugador(in.nextLine());
			jugadores.add(nuevoJugador);
		} while (jugadores.size() < 4);
		in.close();
		
		Mus mus = new Mus();
		for (Jugador j : jugadores) mus.addJugador(j);
		
		System.out.println("-> Jugadores : " + mus.getJugadores());
		System.out.println("-> Baraja : " + mus.getBaraja());
	}
}
