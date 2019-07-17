/* CLase enfocada al Jugador y a los posibles
 * usos que este tenga a lo largo del juego
 * @author : Juan Mantilla - Felipe Peña	
 * @version : 11 de Julio de 2019
 *  */
package solarMe;

public class Jugador
{
	private String nombreJugador;
	private int puntaje = 0;
	
	public Jugador(String nombreJugador, int puntaje)
	{
		this.nombreJugador = nombreJugador;
		this.puntaje = puntaje;
	}
	
	public void setNombreJugador(String nombreJugador)
	{
		this.nombreJugador = nombreJugador;
	}
	
	public String getNombreJugador()
	{
		return nombreJugador;
	}
	
	public void setPuntaje(int puntaje )
	{
		this.puntaje = puntaje;
	}
}
