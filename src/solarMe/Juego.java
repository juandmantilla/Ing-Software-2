/* Clase encargada de cargar todos los objetos u elementos
 * responsables del correcto funcionamiento del juego
 * @author : Juan Mantilla - Felipe Peña	
 * @version : 23 de Julio de 2019
 *  */
package solarMe;

import java.util.Scanner;

public class Juego 
{	
	// Objeto Planetario de inicio del juego
	OA objeto = new OA("Sol");
	
	//Lector de Scanner
	Scanner scanner = new Scanner(System.in);
	
	//Objeto de Jugador
	Jugador jugador = new Jugador();
	
	//Las variables entrada1 y entrada2 almacenan las entrada de teclado del jugador
	String entrada, entrada2;
	
	// Constructor de Juego, inicialización de variables
	public Juego()
	{
		this.entrada = "";
		this.entrada2 = "";
	}
	
	//Método que lanza el menú principal del juego
	public void lanzarJuego()
	{
		do 
		{
			/* Menú de inicio */
			System.out.println("Bienvenido a SolarMe");
			System.out.println("Seleccione lo que desee realizar");
			System.out.println("1) Iniciar");
			System.out.println("2) Acerca");
			System.out.println("3) Salir");
			entrada2 = scanner.nextLine();
			
			/* Menú de juego */
			switch (entrada2) 
			{
			case "1":
				
				do {
					System.out.println("¿Qué quieres hacer?");
					System.out.println("1) Jugar");
					System.out.println("2) Aprender");
					System.out.println("3) Volver");
					entrada2 = scanner.nextLine();
					switch (entrada2)
					{
					case "1":
						objeto.getNombre();
						objeto.cargarInformacion();
						objeto.imprimirInformacion();
						System.out.println("1) Volver");
						entrada2 = scanner.nextLine();
						
						if(entrada2.equals("1"))
							entrada2 = "volver";
						break;
					case "2":
						int i = 0;
						int cont = 0;
						
						
						Cuestionario c1 = new Cuestionario(objeto);
						c1.cargarPreguntas();
						while(i<c1.getTamanoPreguntas(objeto))
						{
							c1.imprimirPregunta(objeto, i);
							c1.cargarRespuestas();
							System.out.println("Teclee la respuesta");
							entrada = scanner.nextLine();
							
							
							if(entrada.equals(c1.getRespuesta(objeto, i)))
							{	
								System.out.println("Ha ganado 1 punto");
								i++;
								jugador.setPuntaje(cont+1);
								cont++;
								
							}
							else
							{	
								
								System.out.println("No ha ganado ningún punto");
								i++;
								
							}
							
						}
						
						System.out.println("Tus puntos totales " + jugador.getPuntaje());
						System.out.println();
						jugador.subirNivel(objeto, c1);
						
						if(entrada2.equals("1"))
							entrada2 = "volver";
						break;
					case "3":
						entrada = "volver";
						break;
					
					}
				}while(entrada2.equals("volver"));
			
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

