/* Esta clase define cada uno de los cuestionarios de los 
 * OA correspondientes. 
 * @author : Juan Mantilla - Felipe Peña	
 * @version : 17 de Julio de 2019
 *  */
package solarMe;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Cuestionario
{
	
	private String nombreCuestionario ="";
	private HashMap<String , String> preguntas = new HashMap<String, String>();
	
	public Cuestionario(OA objeto)
	{
		this.nombreCuestionario = objeto.getNombre();
	}
	
		
	
	
	public void cargarPreguntas()
	{
		switch (this.nombreCuestionario) {
		case "Sol":
			
			preguntas.put("s1", cargarArchivo("preguntas/Sol/p1.txt"));
			preguntas.put("s2", cargarArchivo("preguntas/Sol/p2.txt"));
			preguntas.put("s3", cargarArchivo("preguntas/Sol/p3.txt"));
			preguntas.put("s4", cargarArchivo("preguntas/Sol/p4.txt"));
			preguntas.put("s5", cargarArchivo("preguntas/Sol/p5.txt"));
			break;
		case "Mercurio":
			preguntas.put("mer1", cargarArchivo("preguntas/Mercurio/p1.txt"));
			preguntas.put("mer2", cargarArchivo("preguntas/Mercurio/p2.txt"));
			preguntas.put("mer3", cargarArchivo("preguntas/Mercurio/p3.txt"));
			preguntas.put("mer4", cargarArchivo("preguntas/Mercurio/p4.txt"));
			preguntas.put("mer5", cargarArchivo("preguntas/Mercurio/p5.txt"));
			break;
		case "Venus":
			preguntas.put("v1", cargarArchivo("preguntas/Venus/p1.txt"));
			preguntas.put("v2", cargarArchivo("preguntas/Venus/p2.txt"));
			preguntas.put("v3", cargarArchivo("preguntas/Venus/p3.txt"));
			preguntas.put("v4", cargarArchivo("preguntas/Venus/p4.txt"));
			preguntas.put("v5", cargarArchivo("preguntas/Venus/p5.txt"));
			break;
		case "Tierra":
			preguntas.put("t1", cargarArchivo("preguntas/Tierra/p1.txt"));
			preguntas.put("t2", cargarArchivo("preguntas/Tierra/p2.txt"));
			preguntas.put("t3", cargarArchivo("preguntas/Tierra/p3.txt"));
			preguntas.put("t4", cargarArchivo("preguntas/Tierra/p4.txt"));
			preguntas.put("t5", cargarArchivo("preguntas/Tierra/p5.txt"));
			break;
		case "Marte":
			preguntas.put("mar1", cargarArchivo("preguntas/Marte/p1.txt"));
			preguntas.put("mar2", cargarArchivo("preguntas/Marte/p2.txt"));
			preguntas.put("mar3", cargarArchivo("preguntas/Marte/p3.txt"));
			preguntas.put("mar4", cargarArchivo("preguntas/Marte/p4.txt"));
			preguntas.put("mar5", cargarArchivo("preguntas/Marte/p5.txt"));
			break;
		case "Jupiter":
			preguntas.put("j1", cargarArchivo("preguntas/Jupiter/p1.txt"));
			preguntas.put("j2", cargarArchivo("preguntas/Jupiter/p2.txt"));
			preguntas.put("j3", cargarArchivo("preguntas/Jupiter/p3.txt"));
			preguntas.put("j4", cargarArchivo("preguntas/Jupiter/p4.txt"));
			preguntas.put("j5", cargarArchivo("preguntas/Jupiter/p5.txt"));
			break;
		case "Saturno":
			preguntas.put("sat1", cargarArchivo("preguntas/Saturno/p1.txt"));
			preguntas.put("sat2", cargarArchivo("preguntas/Saturno/p2.txt"));
			preguntas.put("sat3", cargarArchivo("preguntas/Saturno/p3.txt"));
			preguntas.put("sat4", cargarArchivo("preguntas/Saturno/p4.txt"));
			preguntas.put("sat5", cargarArchivo("preguntas/Saturno/p5.txt"));
			break;
		case "Urano":
			preguntas.put("u1", cargarArchivo("preguntas/Urano/p1.txt"));
			preguntas.put("u2", cargarArchivo("preguntas/Urano/p2.txt"));
			preguntas.put("u3", cargarArchivo("preguntas/Urano/p3.txt"));
			preguntas.put("u4", cargarArchivo("preguntas/Urano/p4.txt"));
			preguntas.put("u5", cargarArchivo("preguntas/Urano/p5.txt"));
			break;
		case "Neptuno":
			break;
		case "Pluton":
			break;
		default:
			break;
		}
	}
	
	
	public String cargarArchivo(String direccion)
	{
			String texto = "";
			try
			{
				BufferedReader bf = new BufferedReader(new FileReader(direccion));
				String temp ="";
				String bfRead;
				while((bfRead = bf.readLine()) != null)
				{
					temp = temp + bfRead;
				}
				texto = temp;
			} catch (Exception e)
			{
				//Manejar excepciones
				System.err.print("El archivo no existe o no ha sido encontrado");
				
			}
		
		
		return texto;
	}

	public void imprimirPreguntas()
	{
		System.out.println(preguntas);
	}
}

