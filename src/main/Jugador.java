package main;

import java.util.ArrayList;

/**
 * Para el manejo de los jugadores.
 * 
 * @author Rubèn Nieto
 *
 */
public class Jugador {
	private String nombre;
	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	
	/**
	 * Constructor de la clase.
	 * @param nombre es el nombre del jugador.
	 */
	public Jugador(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtener el nombre del jugador.
	 * @return el nombre del jugador.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Almacenar el nombre del jugador.
	 * @param nombre es el nombre del jugador.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtener las cartas del jugador.
	 * @return las cartas del jugador.
	 */
	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	/**
	 * Almacenar las cartas del jugador.
	 * @param cartas es las cartas del jugador.
	 */
	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	
	public void darCarta(Carta carta) {
		this.cartas.add(carta);
	}
	
	public Carta retirarCarta(int indice) {
		Carta carta = cartas.get(indice);
		
		cartas.remove(indice);
		
		return carta;
	}
	
	String juego() {
		return cartas.toString();
	}
}
