package model.logic;

import model.data_structures.ArregloDinamico;
import model.data_structures.IArregloDinamico;
import model.data_structures.Lista;
import model.data_structures.YoutubeVideo;

public class Modelo <T>
{
	/**
	 * Atributos del modelo del mundo
	 */
	private ArregloDinamico <YoutubeVideo> datosArreglo;
	
	private Lista <YoutubeVideo> datosLista;
	
	/**
	 * Constructor del modelo del mundo con capacidad dada
	 * @param tamano
	 */
	public Modelo()
	{
		datosArreglo =  new ArregloDinamico <YoutubeVideo> (1000);
		datosLista = new Lista <YoutubeVideo> ();
	}
	
	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamanoAct()
	{
		return datos.darTamanoAct();
	}

	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 */
	public void agregar(String dato)
	{	
		datos.agregar(dato);
	}
	
	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public String buscar(String dato)
	{
		return (String) datos.buscar(dato);
	}
	
	/**
	 * Requerimiento eliminar dato
	 * @param dato Dato a eliminar
	 * @return dato eliminado
	 */
	public String eliminar(String dato)
	{
		return (String) datos.eliminar(dato);
	}


}

