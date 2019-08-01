/* Clase enfocada al Jugador y a los posibles
 * usos que este tenga a lo largo del juego
 * @author : Juan Mantilla - Felipe Peña	
 * @version : 17 de Julio de 2019
 *  */
package solarMe;

public class Jugador
{
	//Guarda el puntaje acumulado por cada OA que recorra el Jugador
	private float puntaje;
	
	//Contador guarda los valores para aumentar de nivel (OA)
	int contador = 0;
	
	//@param puntaje variable responsable de asignar el puntaje al comienzo del juego
	public Jugador()
	{
		this.puntaje = 0;
	}
	
	
	public void setPuntaje(int puntaje )
	{
		this.puntaje = puntaje;
	}
	
	public float getPuntaje()
	{
		return puntaje;
	}
	
	public void subirNivel(OA objeto, Cuestionario cuestionario)
	{	System.out.println("----------------------------------");
		
		if((getPuntaje())>= (cuestionario.getTamanoPreguntas(objeto)*0.8))
		{
			objeto.setNombre(objeto.getListaPlaneta().get(contador+1));
			System.out.println("Has subido al nivel " + objeto.getNombre() + ". Felicidades!");
			cuestionario.setNombreCuestionario(objeto.getListaPlaneta().get(contador+1));
			contador++;
			setPuntaje(0);
			cuestionario.reiniciarArrayList(objeto);
			
		}
		else if(getPuntaje() < (cuestionario.getTamanoPreguntas(objeto)*0.8))
		{
			System.out.println("Has quedado en el mismo nivel " + objeto.getNombre());
			setPuntaje(0);
			cuestionario.reiniciarArrayList(objeto);
			
		} 
		else
		{
			System.out.println( "No se ha podido calificar");
		}
	}
	
}
