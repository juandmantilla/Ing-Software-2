package solarMe;



public class Principal
{
	public static void main(String[] args)
	{
	 //Juego juego = new Juego();
	 //juego.lanzarJuego();
	 
	 OA objeto = new OA("Sol",true);
	 
	 Cuestionario c1 = new Cuestionario(objeto );
	 c1.cargarPreguntas();
	 c1.imprimirPreguntas();
	
	}

}
