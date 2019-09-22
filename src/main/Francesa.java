package main;

/**
 * 
 * Extiende la clase Baraja. 
 * Para manejar barajas del tipo francés.
 * 
 * @author Rubèn Nieto
 *
 */
public class Francesa extends Baraja {
	private final String[] palos = { "picas", "tréboles", "diamantes", "corazones" };
	private final String[] nombres = { "as", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K" };
	
	/**
	 * Constructor sin parámetros, reinicia la baraja.
	 */
	public Francesa() {
		this.reiniciar();
	}
	
	/**
	 * Implementa el método reiniciar() de Baraja con las cartas de la baraja francesa.
	 */
	@Override
	public void reiniciar() {
		if (this.cartas.size() > 0) this.cartas.removeAll(this.cartas); 	// si hay alguna carta en la baraja, vacia.
		
		for (String palo : palos) {
			for (int n = 0; n < nombres.length; n++) {
				Carta carta = new Carta(nombres[n], palo, (n < 10) ? (n+1) : 10);
				this.cartas.add(carta);
			}
		}
	}
}
