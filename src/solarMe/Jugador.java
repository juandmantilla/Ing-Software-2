/* Clase enfocada al Jugador y a los posibles
 * usos que este tenga a lo largo del juego
 * @author : Juan Mantilla - Felipe Peña	
 * @version : 17 de Julio de 2019
 *  */
package solarMe;

import java.util.ArrayList;

public class Jugador
{
	//Guarda el puntaje acumulado por cada OA que recorra el Jugador
	private int puntaje;
	
	//@param puntaje variable responsable de asignar el puntaje al comienzo del juego
	public Jugador()
	{
		this.puntaje = 0;
	}
	
	
	public void setPuntaje(int puntaje )
	{
		this.puntaje = puntaje;
	}
	
	public int getPuntaje()
	{
		return puntaje;
	}
	
	public void subirNivel(OA objeto, Cuestionario cuestionario)
	{	int contador = 0;
		
		if((puntaje/cuestionario.getTamanoPreguntas())>= (cuestionario.getTamanoRespuestas()*0.9))
		{
			objeto.setNombre(objeto.getListaPlaneta().get(contador+1));
			System.out.println("Has subido de  nivel!" + objeto.getNombre());
			
		}
		else
		{
			objeto.setNombre(objeto.getListaPlaneta().get(contador));
			System.out.println("Has quedado en el mismo nivel " + objeto.getNombre());
			
		}
	}
	
}
