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
	
	public void agregarPregunta(String OA, String pregunta)
	{
		switch (OA) {
		case "Sol":
			hashPreguntas.put("Sol",pregunta);
			break;
		case "Mercurio":
			hashPreguntas.put("Mercurio",pregunta);
			break;
		case "Venus" :
			hashPreguntas.put("Venus",pregunta);
			break;
		case "Tierra":
			hashPreguntas.put("Tierra",pregunta);
			break;
		case "Marte":
			hashPreguntas.put("Marte",pregunta);
			break;
		case "Jupiter":
			hashPreguntas.put("Jupiter",pregunta);
			break;
		case "Saturno":
			hashPreguntas.put("Saturno",pregunta);
			break;
		case "Urano":
			hashPreguntas.put("Urano",pregunta);
			break;
		case "Neptuno":
			hashPreguntas.put("Neptuno",pregunta);
			break;
		case "Plutón":
			hashPreguntas.put("Plutón",pregunta);
			break;
		default:
			break;
		
	}
	
	
	}
}

