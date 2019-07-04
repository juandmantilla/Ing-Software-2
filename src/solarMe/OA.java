/* Esta clase define el objeto astronómico
 * devuelve información y preguntasl del objeto seleccionado
 * @author : Juan Mantilla - Felipe Peña	
 * @version : 2 de Julio de 2019
 *  */

package solarMe;

public class OA
{
	private String nombre;
	private String informacion;
	
	
	public OA(String nombre, String informacion)
	{
		this.nombre = nombre;
		this.informacion = informacion;
	}
	
	//Constructor por defecto
	public OA()
	{
		this.nombre = "Sol";
		this.informacion = "El sol está compuesto de  hidrógeno que por medio de fus"
				+ "ion se convierte en helio ...";
		
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
	{	String informacionCargada = "_";
		switch (this.nombre)
		{
		
		case "Sol":
			
			this.informacion = informacionCargada;
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
	
	
	public void imprimirNombre()
	{
		System.out.println(this.nombre);
	}
	
	public void imprimirInformacion()
	{
		System.out.println(this.informacion);
	}
}
