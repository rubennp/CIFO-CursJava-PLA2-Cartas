package main;

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
		Jugador jugador1 = new Jugador("Jugador 1");
		Jugador jugador2 = new Jugador("Jugador 2");
		Jugador jugador3 = new Jugador("Jugador 3");
		Jugador jugador4 = new Jugador("Jugador 4");
				
		Francesa francesa = new Francesa();
		Española española = new Española();
		
		francesa.barajar();
		española.barajar();
		
		for (int c = 0; c < 5; c++ ) jugador1.darCarta(francesa.repartir());
		for (int c = 0; c < 5; c++ ) jugador2.darCarta(francesa.repartir());
		
		System.out.println("Las cartas de " + jugador1.getNombre() + " son: " + jugador1.getCartas());
		System.out.println("Las cartas de " + jugador2.getNombre() + " son: " + jugador2.getCartas());
		
		for (int c = 0; c < 5; c++ ) jugador3.darCarta(española.repartir());
		for (int c = 0; c < 5; c++ ) jugador4.darCarta(española.repartir());
		
		System.out.println("Las cartas de " + jugador3.getNombre() + " son: " + jugador3.getCartas());
		System.out.println("Las cartas de " + jugador4.getNombre() + " son: " + jugador4.getCartas());
		
		española.reiniciar();
		francesa.reiniciar();
		
		System.out.println(francesa.cartas);
		System.out.println(española.cartas);
		
	}

}
