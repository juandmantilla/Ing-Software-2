package solarMe;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args)
	{
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenido a SolarMe");
		System.out.println("Seleccione lo que desee realizar");
		System.out.println("1) Jugar");
		System.out.println("2) Acerca");
		System.out.println("3) Salir");
		String entrada = scanner.nextLine();
		
		/* Menu de juego */
		switch (entrada) {
		case "1":
			OA objeto = new OA("Mercurio");
			System.out.println("Está en  " + objeto.getNombre());
			
			
			break;
		case "2":
			System.out.println("Juego desarrollado por Juan Mantilla y Felipe Peña ...");
			break;
		case "3":
			/* Sale del juego*/
			System.exit(0);
			break;

		}
	}

}
