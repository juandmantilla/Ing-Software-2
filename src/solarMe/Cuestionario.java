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
			break;
		case "Venus":
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

