/* Esta clase define cada uno de los cuestionarios de los 
 * OA correspondientes. 
 * @author : Juan Mantilla - Felipe Peña	
 * @version : 23 de Julio de 2019
 *  */
package solarMe;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class Cuestionario
{
	
	
	
	private String nombreCuestionario = "";
	
	//ArrayList's que guardan las diferentes preguntas
	private ArrayList<String> preguntasSol = new ArrayList<String>();
	private ArrayList<String> preguntasMercurio = new ArrayList<String>();
	private ArrayList<String> preguntasVenus = new ArrayList<String>();
	private ArrayList<String> preguntasTierra = new ArrayList<String>();
	private ArrayList<String> preguntasMarte = new ArrayList<String>();
	private ArrayList<String> preguntasJupiter = new ArrayList<String>();
	private ArrayList<String> preguntasSaturno = new ArrayList<String>();
	private ArrayList<String> preguntasUrano = new ArrayList<String>();
	private ArrayList<String> preguntasNeptuno = new ArrayList<String>();
	private ArrayList<String> preguntasPluton = new ArrayList<String>();
	
	public Cuestionario(OA objeto)
	{
		this.nombreCuestionario = objeto.getNombre();
	}
	
		
	
	// Carga en los diferentes ArrayList las preguntas de lo OA
	// Cada pregunta tiene un archivo .txt asociado
	public void cargarPreguntas()
	{
		switch (this.nombreCuestionario) {
		case "Sol":
			preguntasSol.add( cargarArchivo("preguntas/Sol/p1.txt"));
			preguntasSol.add( cargarArchivo("preguntas/Sol/p2.txt"));
			preguntasSol.add( cargarArchivo("preguntas/Sol/p3.txt"));
			preguntasSol.add( cargarArchivo("preguntas/Sol/p4.txt"));
			preguntasSol.add( cargarArchivo("preguntas/Sol/p5.txt"));
		
			break;
		case "Mercurio":
			preguntasMercurio.add( cargarArchivo("preguntas/Mercurio/p1.txt"));
			preguntasMercurio.add( cargarArchivo("preguntas/Mercurio/p2.txt"));
			preguntasMercurio.add( cargarArchivo("preguntas/Mercurio/p3.txt"));
			preguntasMercurio.add( cargarArchivo("preguntas/Mercurio/p4.txt"));
			preguntasMercurio.add( cargarArchivo("preguntas/Mercurio/p5.txt"));
			break;
		case "Venus":
			preguntasVenus.add( cargarArchivo("preguntas/Venus/p1.txt"));
			preguntasVenus.add( cargarArchivo("preguntas/Venus/p2.txt"));
			preguntasVenus.add( cargarArchivo("preguntas/Venus/p3.txt"));
			preguntasVenus.add( cargarArchivo("preguntas/Venus/p4.txt"));
			preguntasVenus.add( cargarArchivo("preguntas/Venus/p5.txt"));
			break;
		case "Tierra":
			preguntasTierra.add( cargarArchivo("preguntas/Tierra/p1.txt"));
			preguntasTierra.add( cargarArchivo("preguntas/Tierra/p2.txt"));
			preguntasTierra.add( cargarArchivo("preguntas/Tierra/p3.txt"));
			preguntasTierra.add( cargarArchivo("preguntas/Tierra/p4.txt"));
			preguntasTierra.add( cargarArchivo("preguntas/Tierra/p5.txt"));
			break;
		case "Marte":
			preguntasMarte.add( cargarArchivo("preguntas/Marte/p1.txt"));
			preguntasMarte.add( cargarArchivo("preguntas/Marte/p2.txt"));
			preguntasMarte.add( cargarArchivo("preguntas/Marte/p3.txt"));
			preguntasMarte.add( cargarArchivo("preguntas/Marte/p4.txt"));
			preguntasMarte.add( cargarArchivo("preguntas/Marte/p5.txt"));
			
			break;
		case "Jupiter":
			preguntasJupiter.add( cargarArchivo("preguntas/Jupiter/p1.txt"));
			preguntasJupiter.add( cargarArchivo("preguntas/Jupiter/p2.txt"));
			preguntasJupiter.add( cargarArchivo("preguntas/Jupiter/p3.txt"));
			preguntasJupiter.add( cargarArchivo("preguntas/Jupiter/p4.txt"));
			preguntasJupiter.add( cargarArchivo("preguntas/Jupiter/p5.txt"));
			
			break;
		case "Saturno":
			preguntasSaturno.add( cargarArchivo("preguntas/Saturno/p1.txt"));
			preguntasSaturno.add( cargarArchivo("preguntas/Saturno/p2.txt"));
			preguntasSaturno.add( cargarArchivo("preguntas/Saturno/p3.txt"));
			preguntasSaturno.add( cargarArchivo("preguntas/Saturno/p4.txt"));
			preguntasSaturno.add( cargarArchivo("preguntas/Saturno/p5.txt"));
			
			break;
		case "Urano":
			preguntasUrano.add( cargarArchivo("preguntas/Urano/p1.txt"));
			preguntasUrano.add( cargarArchivo("preguntas/Urano/p2.txt"));
			preguntasUrano.add( cargarArchivo("preguntas/Urano/p3.txt"));
			preguntasUrano.add( cargarArchivo("preguntas/Urano/p3.txt"));
			preguntasUrano.add( cargarArchivo("preguntas/Urano/p4.txt"));
			break;
		case "Neptuno":
			preguntasNeptuno.add( cargarArchivo("preguntas/Neptuno/p1.txt"));
			preguntasNeptuno.add( cargarArchivo("preguntas/Neptuno/p2.txt"));
			preguntasNeptuno.add( cargarArchivo("preguntas/Neptuno/p3.txt"));
			preguntasNeptuno.add( cargarArchivo("preguntas/Neptuno/p4.txt"));
			preguntasNeptuno.add( cargarArchivo("preguntas/Neptuno/p5.txt"));
			
			break;
		case "Pluton":
			preguntasPluton.add( cargarArchivo("preguntas/Pluton/p1.txt"));
			preguntasPluton.add( cargarArchivo("preguntas/Pluton/p2.txt"));
			preguntasPluton.add( cargarArchivo("preguntas/Pluton/p3.txt"));
			preguntasPluton.add( cargarArchivo("preguntas/Pluton/p4.txt"));
			preguntasPluton.add( cargarArchivo("preguntas/Pluton/p5.txt"));
			
			break;
		default:
			break;
		}
	}
	
	//Método encargardo de retornar la cadena de caracteres
	// de archivo de preguntas
	//@param direccion es una cadena de caracteres para la dirección local del archivo
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

	public void imprimirPregunta(String pregunta)
	{
		
	}
	
	public void imprimirPreguntaOA(OA objeto) {
		
		if(objeto.getNombre()=="Sol") {
		int contador=0;
			for(String item:preguntasSol) {
				System.out.println(contador+") "+item);
				contador++;
			}
		}
		if(objeto.getNombre()=="Mercurio") {
		int contador=0;
			for(String item:preguntasMercurio) {
				System.out.println(contador+") "+item);
				contador++;
			}
		}
		if(objeto.getNombre()=="Venus") {
		int contador=0;
			for(String item:preguntasVenus) {
				System.out.println(contador+") "+item);
				contador++;
			}
		}
		if(objeto.getNombre()=="Tierra") {
		int contador=0;
			for(String item:preguntasTierra) {
				System.out.println(contador+") "+item);
				contador++;
			}
		}
		if(objeto.getNombre()=="Marte") {
		int contador=0;
			for(String item:preguntasMarte) {
				System.out.println(contador+") "+item);
				contador++;
			}
		}
		if(objeto.getNombre()=="Jupiter") {
		int contador=0;
			for(String item:preguntasJupiter) {
				System.out.println(contador+") "+item);
				contador++;
			}
		}
		if(objeto.getNombre()=="Saturno") {
		int contador=0;
			for(String item:preguntasSaturno) {
				System.out.println(contador+") "+item);
				contador++;
			}
		}
		if(objeto.getNombre()=="Urano") {
		int contador=0;
			for(String item:preguntasUrano) {
				System.out.println(contador+") "+item);
				contador++;
			}
		}
		if(objeto.getNombre()=="Neptuno") {
		int contador=0;
			for(String item:preguntasNeptuno) {
				System.out.println(contador+") "+item);
				contador++;
			}
		}
		if(objeto.getNombre()=="Pluton") {
		int contador=0;
			for(String item:preguntasPluton) {
				System.out.println(contador+") "+item);
				contador++;
			}
		}
		
	}
	
}


