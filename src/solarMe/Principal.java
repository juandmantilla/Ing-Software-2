package solarMe;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;
public class Principal
{
	public static void main(String[] args)
	{
			
		Scanner scanner = new Scanner(System.in);
		String entrada = "";
		do 
		{
			/* Menú de inicio */
			System.out.println("Bienvenido a SolarMe");
			System.out.println("Seleccione lo que desee realizar");
			System.out.println("1) Jugar");
			System.out.println("2) Acerca");
			System.out.println("3) Salir");
			entrada = scanner.nextLine();
			
			/* Menú de juego */
			switch (entrada) 
			{
			case "1":
				System.out.println("¿Qué quieres hacer?");
				System.out.println("1) Jugar");
				System.out.println("2) Aprender");
				System.out.println("3) Volver");
				entrada = scanner.nextLine();
				switch (entrada)
				{
				case "1":
					
					break;
				case "2":
					
					break;
				case "3":
					entrada = "volver";
				default:
					break;
				}
			
			break;
			case "2":
				/* Acerca del desarrollo del aplicativo */
				System.out.println("Juego desarrollado por Juan Mantilla y Felipe Peña ...");
				System.out.println("1) Volver");
				entrada = scanner.nextLine();
				do
				{
					if(entrada.equals("1"))
					{
					entrada = "volver";
					break;
					}
					else
					{
						System.out.println("Ingrese la opción correcta");
						entrada = scanner.nextLine();
						if(entrada.equals("1"))
						{
							entrada = "volver";
							break;
						}
					}	
					
				}while(!entrada.equals("1") || entrada.equals("volver"));
				
				break;
				
			case "3":
				/* Sale del juego*/
				System.exit(0);
				break;
	
			}
		}while(entrada.equals("volver"));
	}

}
