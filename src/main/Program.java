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
		Carta carta = new Carta("1", "bastos", 1);
		Carta carta2 = new Carta("5", "oros", 5);
		Jugador jugador = new Jugador("Rubèn");
		jugador.darCarta(carta);
		jugador.darCarta(carta2);
		System.out.println("El jugador " + jugador.getNombre() + " tiene " + jugador.juego());
		System.out.println("Después de retirar " + jugador.retirarCarta(0) + ", sus cartas son: " + jugador.juego());
		
		Francesa francesa = new Francesa();
		Espanyola española = new Espanyola();
		
		System.out.println(francesa.cartas);
		System.out.println(española.cartas);
		
		francesa.barajar();
		española.barajar();
		
		System.out.println(francesa.cartas);
		System.out.println(española.cartas);
		
	}

}
