package main;

/**
 * 
 * Extiende la clase Baraja.
 * Para manejar barajas del tipo español.
 * 
 * @author Rubèn Nieto
 *
 */
public class Española extends Baraja {
	private final String[] palos = { "espadas", "bastos", "oros", "copas" };
	private final String[] nombres = { "1", "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey" };
	
	/**
	 * Constructor sin parámetros, reinicia la baraja.
	 */
	public Española() {
		this.reiniciar();
	}
	
	/**
	 * Implementa el método reiniciar() de Baraja con las cartas de la baraja española.
	 */
	@Override
	public void reiniciar() {
		if (this.cartas.size() > 0) this.cartas.removeAll(this.cartas);
		
		for (String palo : palos) {
			for (int n = 0; n < nombres.length; n++) {
				Carta carta = new Carta(nombres[n], palo, (n < 7) ? (n+1) : 10);
				this.cartas.add(carta);
			}
		}
	}
}
