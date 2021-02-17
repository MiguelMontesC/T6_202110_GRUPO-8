package model.logic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.csv.CSVParser;

import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import model.data_structures.ArregloDinamico;
import model.data_structures.Lista;


/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo {
	/**
	 * Atributos del modelo del mundo
	 */
	private ArregloDinamico datos;
	private Lista lista;
	
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		datos = new ArregloDinamico(7);
	}
	
	/**
	 * Constructor del modelo del mundo con capacidad dada
	 * @param tamano
	 */
	public Modelo(int capacidad)
	{
		datos = new ArregloDinamico(capacidad);
	}
	
	public void cargarPeliculas()
	{
		FileReader arhcCVS=null;
		CSVReader csvReader=null;
		
		FileReader arhcCVS2=null;
		CSVReader csvReader2=null;
		
	
		
		
		try
		{
			/*
			 * arhcCVS= new FileReader("data/prueba.csv");
			 * 
			 */
			arhcCVS= new FileReader("data/SmallMoviesDetailsCleaned.csv");
			com.opencsv.CSVParser conPuntoYComa = new CSVParserBuilder().withSeparator(';').build();
			csvReader =new CSVReaderBuilder(arhcCVS).withCSVParser(conPuntoYComa).build();
			
			String[] palabra=csvReader.readNext();
			
	
			arhcCVS2= new FileReader("data/MoviesCastingRaw-small.csv");
			com.opencsv.CSVParser conPuntoYComa2= new CSVParserBuilder().withSeparator(';').build();
			csvReader2 =new CSVReaderBuilder(arhcCVS2).withCSVParser(conPuntoYComa2).build();
			
			String[] palabra2=csvReader2.readNext();
			
					
				while ((palabra=csvReader.readNext())!=null)
				{	
					palabra2=csvReader2.readNext();
					
					int id=Integer.parseInt(palabra[0]);
					Date tredingDate =palabra[1];
					String titulo = palabra[2];
					String tituloCanal = palabra[3];
					Date publishingTime =palabra[5];
					ArregloDinamico ttt = palabra[6];
					int numeroV = Integer.parseInt(palabra[7]);
					int numeroL = Integer.parseInt(palabra[8]);
					int numeroD = Integer.parseInt(palabra[9]);

					
					
					YoutubeVideo nuevoVideo =new YoutubeVideo (id, tredingDate, titulo, tituloCanal, publishingTime, ttt, numeroV, numeroL, numeroD) ;
					datos.addLast((Comparable) nuevoVideo);						
					
				}
				
				
					
					
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (CsvValidationException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return datos.darTamano();
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
	
	public String [] invertir ()
	{
		return (String[]) datos.invertir();
	}

}
