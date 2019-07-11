/* Esta clase define el objeto astronómico
 * devuelve información y preguntasl del objeto seleccionado
 * @author : Juan Mantilla - Felipe Peña	
 * @version : 11 de Julio de 2019
 *  */



package solarMe;

import java.io.BufferedReader;
import java.io.FileReader;

public class OA
{
	private String nombre;
	private String informacion;
	
	//Constructor por defecto
	public OA()
	{
		this.nombre = "Defecto";
		this.informacion = "Escoja un pláneta para empezar a jugar";
		
	}
	

	public OA(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	/* Este método carga la información del OA*/
	public String cargarInformacion()
	{	
		switch (this.nombre)
		{
		case "Sol":
			this.informacion = cargarArchivo("infoPlanetas/sol.txt");
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
		case "Plutón":
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
}
