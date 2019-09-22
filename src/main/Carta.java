package main;

/**
 * Para el manejo de las cartas del juego.
 * 
 * @author Rubèn Nieto
 *
 */
public class Carta {
	private String palo;			// oros, copas, bastos y espadas para la baraja española
									// corazones, tréboles, picas y diamantes para la francesa
	private String nombre;			// 1 (o as en la francesa), 2, 3, 4, 5, 6, 7, 8, 9
									// sota (10), caballo (11) y rey (12) para la española
									// J (10), Q (11), K (12) para la francesa
	private int valor; 				// del 1 al 12
	
	/**
	 * Constructor de la clase
	 * 
	 * @param palo será el palo de la carta (oros, copas, bastos y espadas para la baraja española; o corazones, tréboles, picas o diamantes para la francesa).
	 * @param nombre será el nombre de la carta (1 (o as), 2, 3, 4, 5, 6, 7, 8, 9 y sota (10), caballo (11) y rey (12) para la española o J, Q, K, .
	 * @param valor será el valor de la carta.
	 */
	public Carta(String nombre, String palo, int valor) {
		this.setNombre(nombre);
		this.setPalo(palo);
		this.setValor(valor);
	}
	
	/**
	 * Obtener el palo de la carta.
	 * @return palo es el palo de la carta.
	 */
	public String getPalo() {
		return palo;
	}

	/**
	 * Almacenar el palo de la carta.
	 * @param palo es el palo de la carta.
	 */
	public void setPalo(String palo) {
		this.palo = palo;
	}

	/**
	 * Obtener el nombre de la carta.
	 * @return nombre es el nombre de la carta.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Almacenar el nombre de la carta.
	 * @param nombre es el nombre de la carta.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtener el valor de la carta.
	 * @return el valor de la carta.
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * Almacenar el valor de la carta.
	 * @param valor es el valor de la carta.
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	/**
	 * Sobreescribe el método toString de la clase madre Object para mostrar "nombre + de + valor" al mostrar una carta.
	 */
	@Override
	public String toString() {
		return nombre + " de " + palo;
	}
}
