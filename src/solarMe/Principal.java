package solarMe;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;
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
			System.out.println("¿Qué quieres hacer?");
			System.out.println("1) Jugar");
			System.out.println("2) Aprender");
			System.out.println("3) Volver");
			String entrada2 = scanner.nextLine();
			
			switch (entrada2){
			case "1":
				OA objeto = new OA("Sol");
				objeto.cargarInformacion();
				objeto.imprimirInformacion();
				break;
			case "2":
				
				break;
			
			default:
				break;
			}
			
				
			
			
			
			break;
		case "2":
			/* Acerca del desarrollo del aplicativo */
			System.out.println("Juego desarrollado por Juan Mantilla y Felipe Peña ...");
			System.out.println("1) Volver");
			entrada2 = scanner.nextLine();
			if (entrada2.equals("1"))
			{
				entrada = "1";
			}
			break;
		case "3":
			/* Sale del juego*/
			System.exit(0);
			break;

		}
	}

}
