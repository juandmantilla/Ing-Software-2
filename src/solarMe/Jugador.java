/* CLase enfocada al Jugador y a los posibles
 * usos que este tenga a lo largo del juego
 * @author : Juan Mantilla - Felipe Peña	
 * @version : 17 de Julio de 2019
 *  */
package solarMe;

public class Jugador
{
	
	private int puntaje = 0;
	
	//@param puntaje variable responsable de asignar el puntaje al comienzo del juego
	public Jugador(int puntaje)
	{
		
		this.puntaje = puntaje;
	}
	
	
	public void setPuntaje(int puntaje )
	{
		this.puntaje = puntaje;
	}
	
	public int getPuntaje()
	{
		return puntaje;
	}
	
	public void subirNivel(OA objeto)
	{
		
	}
	
}
