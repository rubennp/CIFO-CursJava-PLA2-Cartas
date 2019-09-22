package juego;

import java.util.ArrayList;

import cartas.Carta;

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
	
	/**
	 * Añade una carta a las cartas del jugador.
	 * @param carta
	 */
	public void darCarta(Carta carta) {
		this.cartas.add(carta);
	}
	
	/**
	 * Retira una carta de las cartas del jugador.
	 * @param indice es la posición en el array de la carta a retirar.
	 * @return Carta es la carta que se ha retirado de las cartas del jugador.
	 */
	public Carta retirarCarta(int indice) {
		Carta carta = cartas.get(indice);
		
		cartas.remove(indice);
		
		return carta;
	}
	
	/**
	 * Obtener las cartas del jugador.
	 * @return las cartas del jugador
	 */
	String juego() {
		return getCartas().toString();
	}
	
	/**
	 * Sobrescribe el método de la clase Object para que muestre solo nombre del jugador.
	 * @return el nombre del jugador.
	 */
	public String toString() {
		return nombre;
	}
}
