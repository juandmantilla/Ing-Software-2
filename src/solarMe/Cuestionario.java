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
		
	private String nombreCuestionario;
	
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
	
	
	//ArrayList's que guardan las diferentes respuestas
	private ArrayList<String> respuestasSol = new ArrayList<String>();
	private ArrayList<String> respuestasMercurio = new ArrayList<String>();
	private ArrayList<String> respuestasVenus = new ArrayList<String>();
	private ArrayList<String> respuestasTierra = new ArrayList<String>();
	private ArrayList<String> respuestasMarte = new ArrayList<String>();
	private ArrayList<String> respuestasJupiter = new ArrayList<String>();
	private ArrayList<String> respuestasSaturno = new ArrayList<String>();
	private ArrayList<String> respuestasUrano = new ArrayList<String>();
	private ArrayList<String> respuestasNeptuno = new ArrayList<String>();
	private ArrayList<String> respuestasPluton = new ArrayList<String>();
	
	
	
	public Cuestionario(OA objeto)
	{
		this.nombreCuestionario = objeto.getNombre();
	}
	
	public void setNombreCuestionario(String nombre)
	{
		this.nombreCuestionario = nombre;
	}
	
	public String getNombreCuestionario()
	{
		return this.nombreCuestionario;
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
	
	// Método encargardo de retornar la cadena de caracteres
	// de archivo de preguntas
	// @param direccion es una cadena de caracteres para la dirección local del archivo
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

	//Imprime la pregunta especificada para cada planeta
	//@param objeto corresponte de un OA
	//@param numPregunta indica el número de la pregunta
	public void imprimirPregunta(OA objeto, int numPregunta)
	{
		switch (objeto.getNombre()) {
		case "Sol":
			System.out.println(preguntasSol.get(numPregunta));
			break;
		case "Mercurio":
			System.out.println(preguntasMercurio .get(numPregunta));
			break;
		case "Venus":
			System.out.println(preguntasVenus.get(numPregunta));
			break;
		case "Tierra":
			System.out.println(preguntasTierra.get(numPregunta));
			break;
		case "Marte":
			System.out.println(preguntasMarte.get(numPregunta));
			break;
		case "Jupiter":
			System.out.println(preguntasJupiter.get(numPregunta));
			break;
		case "Saturno":
			System.out.println(preguntasSaturno.get(numPregunta));
			break;
		case "Urano":
			System.out.println(preguntasUrano.get(numPregunta));
			break;
		case "Neptuno":
			System.out.println(preguntasNeptuno.get(numPregunta));
			break;
		case "Pluton":
			System.out.println(preguntasPluton.get(numPregunta));
			break;
		
		}
	}
	
		
	//Cargar Respuestas en ArrayList's 
	public void cargarRespuestas()
	{
		switch (this.nombreCuestionario) {
		case "Sol":
			respuestasSol.add( cargarArchivo("preguntas/Sol/r1.txt"));
			respuestasSol.add( cargarArchivo("preguntas/Sol/r2.txt"));
			respuestasSol.add( cargarArchivo("preguntas/Sol/r3.txt"));
			respuestasSol.add( cargarArchivo("preguntas/Sol/r4.txt"));
			respuestasSol.add( cargarArchivo("preguntas/Sol/r5.txt"));
		
			break;
		case "Mercurio":
			respuestasMercurio.add( cargarArchivo("preguntas/Mercurio/r1.txt"));
			respuestasMercurio.add( cargarArchivo("preguntas/Mercurio/r2.txt"));
			respuestasMercurio.add( cargarArchivo("preguntas/Mercurio/r3.txt"));
			respuestasMercurio.add( cargarArchivo("preguntas/Mercurio/r4.txt"));
			respuestasMercurio.add( cargarArchivo("preguntas/Mercurio/r5.txt"));
			break;
		case "Venus":
			respuestasVenus.add( cargarArchivo("preguntas/Venus/r1.txt"));
			respuestasVenus.add( cargarArchivo("preguntas/Venus/r2.txt"));
			respuestasVenus.add( cargarArchivo("preguntas/Venus/r3.txt"));
			respuestasVenus.add( cargarArchivo("preguntas/Venus/r4.txt"));
			respuestasVenus.add( cargarArchivo("preguntas/Venus/r5.txt"));
			break;
		case "Tierra":
			respuestasTierra.add( cargarArchivo("preguntas/Tierra/r1.txt"));
			respuestasTierra.add( cargarArchivo("preguntas/Tierra/r2.txt"));
			respuestasTierra.add( cargarArchivo("preguntas/Tierra/r3.txt"));
			respuestasTierra.add( cargarArchivo("preguntas/Tierra/r4.txt"));
			respuestasTierra.add( cargarArchivo("preguntas/Tierra/r5.txt"));
			break;
		case "Marte":
			respuestasMarte.add( cargarArchivo("preguntas/Marte/r1.txt"));
			respuestasMarte.add( cargarArchivo("preguntas/Marte/r2.txt"));
			respuestasMarte.add( cargarArchivo("preguntas/Marte/r3.txt"));
			respuestasMarte.add( cargarArchivo("preguntas/Marte/r4.txt"));
			respuestasMarte.add( cargarArchivo("preguntas/Marte/r5.txt"));
			
			break;
		case "Jupiter":
			respuestasJupiter.add( cargarArchivo("preguntas/Jupiter/r1.txt"));
			respuestasJupiter.add( cargarArchivo("preguntas/Jupiter/r2.txt"));
			respuestasJupiter.add( cargarArchivo("preguntas/Jupiter/r3.txt"));
			respuestasJupiter.add( cargarArchivo("preguntas/Jupiter/r4.txt"));
			respuestasJupiter.add( cargarArchivo("preguntas/Jupiter/r5.txt"));
			
			break;
		case "Saturno":
			respuestasSaturno.add( cargarArchivo("preguntas/Saturno/r1.txt"));
			respuestasSaturno.add( cargarArchivo("preguntas/Saturno/r2.txt"));
			respuestasSaturno.add( cargarArchivo("preguntas/Saturno/r3.txt"));
			respuestasSaturno.add( cargarArchivo("preguntas/Saturno/r4.txt"));
			respuestasSaturno.add( cargarArchivo("preguntas/Saturno/r5.txt"));
			
			break;
		case "Urano":
			respuestasUrano.add( cargarArchivo("preguntas/Urano/r1.txt"));
			respuestasUrano.add( cargarArchivo("preguntas/Urano/r2.txt"));
			respuestasUrano.add( cargarArchivo("preguntas/Urano/r3.txt"));
			respuestasUrano.add( cargarArchivo("preguntas/Urano/r3.txt"));
			respuestasUrano.add( cargarArchivo("preguntas/Urano/r4.txt"));
			break;
		case "Neptuno":
			respuestasNeptuno.add( cargarArchivo("preguntas/Neptuno/r1.txt"));
			respuestasNeptuno.add( cargarArchivo("preguntas/Neptuno/r2.txt"));
			respuestasNeptuno.add( cargarArchivo("preguntas/Neptuno/r3.txt"));
			respuestasNeptuno.add( cargarArchivo("preguntas/Neptuno/r4.txt"));
			respuestasNeptuno.add( cargarArchivo("preguntas/Neptuno/r5.txt"));
			
			break;
		case "Pluton":
			respuestasPluton.add( cargarArchivo("preguntas/Pluton/r1.txt"));
			respuestasPluton.add( cargarArchivo("preguntas/Pluton/r2.txt"));
			respuestasPluton.add( cargarArchivo("preguntas/Pluton/r3.txt"));
			respuestasPluton.add( cargarArchivo("preguntas/Pluton/r4.txt"));
			respuestasPluton.add( cargarArchivo("preguntas/Pluton/r5.txt"));
			
			break;
		
		}

	}

	public String getRespuesta(OA objeto, int numPregunta)
	{	String texto = "";
		switch (objeto.getNombre()) {
		case "Sol":
			texto = respuestasSol.get(numPregunta);
			break;
		case "Mercurio":
			texto = respuestasMercurio.get(numPregunta);
			break;
		case "Venus":
			texto = respuestasVenus.get(numPregunta);
			break;
		case "Tierra":
			texto = respuestasTierra.get(numPregunta);
			break;
		case "Marte":
			texto = respuestasMarte.get(numPregunta);
			break;
		case "Jupiter":
			texto = respuestasJupiter.get(numPregunta);
			break;
		case "Saturno":
			texto = respuestasSaturno.get(numPregunta);
			break;
		case "Urano":
			texto = respuestasUrano.get(numPregunta);
			break;
		case "Neptuno":
			texto = respuestasNeptuno.get(numPregunta);
			break;
		case "Pluton":
			texto = respuestasPluton.get(numPregunta);
			break;
			
			
		}
		return texto;
	}

	public float getTamanoPreguntas(OA objeto)
	{
		float resp = 0;
		switch (objeto.getNombre()) {
		case "Sol":
			resp = preguntasSol.size();
			break;
		case "Mercurio":
			resp = preguntasMercurio.size();
			break;
		case "Venus":
			resp = preguntasVenus.size();
			break;
		case "Tierra":
			resp = preguntasTierra.size();
			break;
		case "Marte":
			resp = preguntasMarte.size();
			break;
		case "Jupiter":
			resp = preguntasJupiter.size();
			break;
		case "Saturno":
			resp = preguntasSaturno.size();
			break;
		case "Urano":
			resp = preguntasUrano .size();
			break;
		case "Neptuno":
			resp = preguntasNeptuno.size();
			break;
		case "Pluton":
			resp = preguntasPluton.size();
			break;
		}
		return resp;
		
	}
	
	//Devuelve el tamaño 
	public int getTamanoRespuestas(OA objeto)
	{
		int resp = 0;
		switch (objeto.getNombre()) {
		case "Sol":
			resp = respuestasSol.size();
			break;
		case "Mercurio":
			resp = respuestasMercurio.size();
			break;
		case "Venus":
			resp = respuestasVenus.size();
			break;
		case "Tierra":
			resp = respuestasTierra.size();
			break;
		case "Marte":
			resp = respuestasMarte.size();
			break;
		case "Jupiter":
			resp = respuestasJupiter.size();
			break;
		case "Saturno":
			resp = respuestasSaturno.size();
			break;
		case "Urano":
			resp = respuestasUrano.size();
			break;
		case "Neptuno":
			resp = respuestasUrano.size();
			break;
		case "Pluton":
			resp = respuestasPluton.size();
			break;
		}
		return resp;
	}
	
	//Método que reinicia el arrayList de los cuestionarios de OA
	public void reiniciarArrayList(OA objeto)
	{
		
		switch (objeto.getNombre()) {
		case "Sol":
			preguntasSol = new ArrayList<String>();
			break;
		case "Mercurio":
			preguntasMercurio = new ArrayList<String>();
			break;
		case "Venus":
			preguntasVenus = new ArrayList<String>();
			break;
		case "Tierra":
			preguntasTierra = new ArrayList<String>();
			break;
		case "Marte":
			preguntasMarte = new ArrayList<String>();
			break;
		case "Jupiter":
			preguntasJupiter = new ArrayList<String>();
			break;
		case "Saturno":
			preguntasSaturno = new ArrayList<String>();
			break;
		case "Urano":
			preguntasUrano = new ArrayList<String>();
			break;
		case "Neptuno":
			preguntasNeptuno = new ArrayList<String>();
			break;
		case "Pluton":
			preguntasPluton = new ArrayList<String>();
			break;
			
		}
	
	}
	
}


