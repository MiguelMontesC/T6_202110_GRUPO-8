package model.logic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


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
	private ArregloDinamico<YoutubeVideo> datos;
	private Lista lista;
	private YoutubeVideo youtube;
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		datos = new ArregloDinamico<YoutubeVideo>(100000000);
		lista = new Lista(youtube) ;
	}
	
	
	
	public void cargarYoutubeVideoListaEncadenada() throws ParseException
	{
		FileReader arhcCVS=null;
		CSVReader csvReader=null;
		
		try
		{
		
			arhcCVS= new FileReader("data/videos-small.csv");
			com.opencsv.CSVParser conPuntoYComa = new CSVParserBuilder().withSeparator(';').build();
			csvReader =new CSVReaderBuilder(arhcCVS).withCSVParser(conPuntoYComa).build();
			
			String[] palabra=csvReader.readNext();
			
				while ((palabra =csvReader.readNext())!=null)
				{	
					palabra =csvReader.readNext();
					
					String id= palabra[0];
					
					DateFormat aaa = new SimpleDateFormat("dd.MM.yyyy");
					DateFormat bbb = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					
					Date tredingDate = aaa.parse(palabra[1]);
					String titulo = palabra[2];
					String tituloCanal = palabra[3];
					int catego = Integer.parseInt(palabra[4]);
					Date publishingTime = bbb.parse(palabra[5]);

					ArregloDinamico <String> ttt = new ArregloDinamico<String>(1000);
					String array = palabra[6];
					String [] dividir = array.split("|");
					for (int i =0; i < dividir.length; i++)
					{
						String meter = dividir [i];
						ttt.addFirst(meter);
					}
					
					
					int numeroV = Integer.parseInt(palabra[7]);
					int numeroL = Integer.parseInt(palabra[8]);
					int numeroD = Integer.parseInt(palabra[9]);

					
					
					youtube = new YoutubeVideo (id, tredingDate, titulo, tituloCanal,catego ,publishingTime, ttt, numeroV, numeroL, numeroD);
					lista.addFirst(youtube);
					
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
	
	public void cargarDatosArregloDinamico () throws ParseException
	{
		FileReader arhcCVS=null;
		CSVReader csvReader=null;
		
		try
		{
		
			arhcCVS= new FileReader("data/videos-small.csv");
			com.opencsv.CSVParser conPuntoYComa = new CSVParserBuilder().withSeparator(';').build();
			csvReader =new CSVReaderBuilder(arhcCVS).withCSVParser(conPuntoYComa).build();
			
			String[] palabra=csvReader.readNext();
			
				while ((palabra =csvReader.readNext())!=null)
				{	
					palabra =csvReader.readNext();
					
					String id= palabra[0];
					
					DateFormat aaa = new SimpleDateFormat("dd.MM.yyyy");
					DateFormat bbb = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					
					Date tredingDate = aaa.parse(palabra[1]);
					String titulo = palabra[2];
					String tituloCanal = palabra[3];
					int catego = Integer.parseInt(palabra[4]);
					Date publishingTime = bbb.parse(palabra[5]);

					ArregloDinamico <String> ttt = new ArregloDinamico<String>(1000);
					String array = palabra[6];
					String [] dividir = array.split("|");
					for (int i =0; i < dividir.length; i++)
					{
						String meter = dividir [i];
						ttt.addFirst(meter);
					}
					
					
					int numeroV = Integer.parseInt(palabra[7]);
					int numeroL = Integer.parseInt(palabra[8]);
					int numeroD = Integer.parseInt(palabra[9]);

					
					
					youtube = new YoutubeVideo (id, tredingDate, titulo, tituloCanal,catego ,publishingTime, ttt, numeroV, numeroL, numeroD);
					datos.addFirst(youtube);						
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
	
}
