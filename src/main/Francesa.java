package main;

public class Francesa extends Baraja {
	private final String[] palos = { "picas", "tréboles", "diamantes", "corazones" };
	private final String[] nombres = { "as", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K" };
	
	public Francesa() {
		this.reiniciar();
	}
	
	@Override
	public void reiniciar() {
		if (this.cartas.size() > 0) this.cartas.removeAll(this.cartas);
		
		for (String palo : palos) {
			for (int n = 0; n < nombres.length; n++) {
				Carta carta = new Carta(nombres[n], palo, (n < 10) ? (n+1) : 10);
				this.cartas.add(carta);
			}
		}
	}
}
