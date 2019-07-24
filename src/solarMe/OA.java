/* Esta clase define el objeto astronómico
 * devuelve información y preguntasl del objeto seleccionado
 * @author : Juan Mantilla - Felipe Peña	
 * @version : 17 de Julio de 2019
 *  */



package solarMe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class OA
{
	//Nombre del Objeto Astronómico
	private String nombre;
	
	//Información relacionada al OA 
	private String informacion;
	
	
	//ArrayList que guarda los diferentes nombres de los planetas
	//Usado en clase Jugador
	private ArrayList<String> listaPlanetas = new ArrayList<String>();


	public OA(String nombre)
	{
		this.nombre = nombre;
		this.listaPlanetas.add("Sol");
		this.listaPlanetas.add("Mercurio");
		this.listaPlanetas.add("Venus");
		this.listaPlanetas.add("Tierra");
		this.listaPlanetas.add("Marte");
		this.listaPlanetas.add("Jupiter");
		this.listaPlanetas.add("Saturno");
		this.listaPlanetas.add("Urano");
		this.listaPlanetas.add("Neptuno");
		this.listaPlanetas.add("Pluton");
	}
   	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	
	
	/* Este método carga la información del OA a través de un archivo de texto externo*/
	public String cargarInformacion()
	{	
		switch (this.nombre)
		{
		case "Sol":
			this.informacion = cargarArchivo("infoPlanetas/sol.txt");
			break;
		case "Mercurio":
			this.informacion = cargarArchivo("infoPlanetas/mercurio.txt");
			break;
		case "Venus":
			this.informacion = cargarArchivo("infoPlanetas/venus.txt");
			break;
		case "Tierra":
			this.informacion = cargarArchivo("infoPlanetas/tierra.txt");
			break;
		case "Marte":
			this.informacion = cargarArchivo("infoPlanetas/marte.txt");
			break;
		case "Jupiter":
			this.informacion = cargarArchivo("infoPlanetas/jupiter.txt");
			break;
		case "Saturno":
			this.informacion = cargarArchivo("infoPlanetas/saturno.txt");
			break;
		case "Urano":
			this.informacion = cargarArchivo("infoPlanetas/urano.txt");
			break;
		case "Neptuno":
			this.informacion = cargarArchivo("infoPlanetas/neptuno.txt");
			break;
		case "Plutón":
			this.informacion = cargarArchivo("infoPlanetas/pluton.txt");
			break;
		default :
			break;
		
		}
		return this.informacion;
	}
	
	public void imprimirNombreOA()
	{
		System.out.println(this.nombre);
	}
	
	public void imprimirInformacion()
	{
		System.out.println(this.informacion);
	}

	// Carga la información de los planetas desde los archivos txt
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

	public ArrayList<String> getListaPlaneta()
	{
		return this.listaPlanetas;
	}
	

}
