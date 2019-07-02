package solarMe;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args)
	{
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenido a SolarMe");
		System.out.println("Qué quiere hacer?");
		String entrada = scanner.nextLine();
		
		/* Menu de juego */
		switch (entrada) {
		case "Jugar":
			System.out.println("Empiece el juego");
			/* Mostrar niveles */
			
			System.out.println("El nivel actual es el Sol ");
			OA objeto = new OA();
			objeto.imprimirInformacion();
			
			break;
		case "Acerca":
			System.out.println("Juego desarrollado por Juan Mantilla y Felipe Peña ...");
			break;
		case "Salir":
			/* Sale del juego*/
			System.exit(0);
			break;

		}
	}

}
