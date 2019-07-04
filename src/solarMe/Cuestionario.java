package solarMe;

import java.util.HashMap;

public class Cuestionario
{
	private HashMap<String, String> hashPreguntas = new HashMap<String, String>();
	
	public Cuestionario()
	{
		
	}
	//Método que imprime preguntas dependiendo del OA que lo solicite
	public void imprimirPregunta(String OA)
	{
		switch (OA) {
		case "Sol":
			System.out.println();
			break;
		case "Mercurio":
			break;
		case "Venus" :
			break;
		case "Tierra":
			break;
		case "Marte":
			break;
		case "Jupiter":
			break;
		case "Saturno":
			break;
		case "Urano":
			break;
		case "Neptuno":
			break;
		case "Plutón":
			break;
		default:
			break;
		
		
		}
	}
	
	public void agregarPregunta(String OA)
	{
		switch (OA) {
		case "Sol":
			hashPreguntas.put("Sol", "¿Cuántas veces cabe la tierra en el sol? ");
			hashPreguntas.put("Sol", "¿Cuál es el combustible del sol? ");
			break;
		case "Mercurio":
			break;
		case "Venus" :
			break;
		case "Tierra":
			break;
		case "Marte":
			break;
		case "Jupiter":
			break;
		case "Saturno":
			break;
		case "Urano":
			break;
		case "Neptuno":
			break;
		case "Plutón":
			break;
		default:
			break;
		
	}
	
	
	}
}

