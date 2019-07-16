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
