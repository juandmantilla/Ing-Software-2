/* Esta clase define cada uno de los cuestionarios de los 
 * OA correspondientes. 
 * @author : Juan Mantilla - Felipe Peña	
 * @version : 17 de Julio de 2019
 *  */
package solarMe;
import java.util.HashMap;

public class Cuestionario
{
	private HashMap<String,String> listaPreguntas = new HashMap<String, String>();
	
	public Cuestionario(OA objeto )
	{
		
	}
	
	//Método que imprime preguntas dependiendo del OA que lo solicite
	public void imprimirPregunta(String OA )
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
	
	public void agregarPregunta(String OA, String pregunta, String respuesta)	
	{
		switch (OA) {
		case "Sol":
			listaPreguntas.put(pregunta, respuesta);
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

