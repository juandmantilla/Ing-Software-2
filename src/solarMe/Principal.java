/* Clase Principal lanza el juego
 * @author : Juan Mantilla - Felipe Peña	
 * @version : 23 de Julio de 2019
 *  */


package solarMe;

public class Principal
{
	public static void main(String[] args)
	{
	 //Juego juego = new Juego();
	 //juego.lanzarJuego();
	 
	OA objeto = new OA("Sol",true);
	
	Cuestionario c1 = new Cuestionario(objeto);
	c1.imprimirPregunta("s1");
			
	}

}
