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
	public Modelo() {
		datos = new ArregloDinamico<YoutubeVideo>(100000000);
		lista = new Lista(youtube);
	}

	public void cargarYoutubeVideoListaEncadenada() throws ParseException
	{
		FileReader arhcCVS=null;
		CSVReader csvReader=null;
		try
		{

			arhcCVS= new FileReader("data/videos-small.csv");
			com.opencsv.CSVParser conPuntoYComa = new CSVParserBuilder().withSeparator(',').build();
			csvReader =new CSVReaderBuilder(arhcCVS).withCSVParser(conPuntoYComa).build();

			String[] palabra=csvReader.readNext();

			palabra =csvReader.readNext();

			while (palabra !=null)
			{	
				try {

					String id= palabra[0];

					SimpleDateFormat aaa = new SimpleDateFormat("dd.MM.yyyy");
					SimpleDateFormat bbb = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

					Date trendingDate = aaa.parse(palabra[1]);		
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



					youtube = new YoutubeVideo (id,trendingDate,  titulo, tituloCanal,catego,publishingTime , ttt, numeroV, numeroL, numeroD);
					lista.addFirst(youtube);
					System.out.println(youtube.getId());
				}
				catch (Exception e)
				{
					// error pasando de csv a youtube
					System.out.println("Error leyendo video");
				}
				try
				{
					palabra =csvReader.readNext();

				}
				catch (Exception e)
				{
					palabra =csvReader.readNext();
					// no lee la linea y sigue 
					System.out.println("Lee siguiente video");
				}
			}
			csvReader.close();

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
		System.out.println("El tamaño de la lista es " + lista.size());
	}

	public void cargarDatosArregloDinamico() throws ParseException 
	{
		FileReader arhcCVS=null;
		CSVReader csvReader=null;
		try
		{

			arhcCVS= new FileReader("data/videos-small.csv");
			com.opencsv.CSVParser conPuntoYComa = new CSVParserBuilder().withSeparator(',').build();
			csvReader =new CSVReaderBuilder(arhcCVS).withCSVParser(conPuntoYComa).build();

			String[] palabra=csvReader.readNext();

			palabra =csvReader.readNext();

			while (palabra !=null)
			{	
				try {

					String id= palabra[0];

					SimpleDateFormat aaa = new SimpleDateFormat("dd.MM.yyyy");
					SimpleDateFormat bbb = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

					Date trendingDate = aaa.parse(palabra[1]);		
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



					youtube = new YoutubeVideo (id,trendingDate,  titulo, tituloCanal,catego,publishingTime , ttt, numeroV, numeroL, numeroD);
					datos.addLast(youtube);
					System.out.println(youtube.getId());
				}
				catch (Exception e)
				{
					// error pasando de csv a youtube
					System.out.println("Error leyendo video");
				}
				try
				{
					palabra =csvReader.readNext();

				}
				catch (Exception e)
				{
					palabra =csvReader.readNext();
					// no lee la linea y sigue 
					System.out.println("Lee siguiente video");
				}
			}
			csvReader.close();

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
		System.out.println("El tamaño de el arreglo es" + datos.size());
	}

	public void cargar_NUMERO_DatosEnArregloDinamico(int num) 
	{
		if (num > datos.darTamano())
			num = datos.darTamano();
				{
					datos.subLista(num);
				}
		
		
		/*/
		FileReader arhcCVS=null;
		CSVReader csvReader=null;
		try
		{

			arhcCVS= new FileReader("data/videos-small.csv");
			com.opencsv.CSVParser conPuntoYComa = new CSVParserBuilder().withSeparator(',').build();
			csvReader =new CSVReaderBuilder(arhcCVS).withCSVParser(conPuntoYComa).build();

			String[] palabra=csvReader.readNext();

			palabra =csvReader.readNext();

			while (palabra !=null)
			{	
				try {

					String id= palabra[0];

					SimpleDateFormat aaa = new SimpleDateFormat("dd.MM.yyyy");
					SimpleDateFormat bbb = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

					Date trendingDate = aaa.parse(palabra[1]);		
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



					youtube = new YoutubeVideo (id,trendingDate,  titulo, tituloCanal,catego,publishingTime , ttt, numeroV, numeroL, numeroD);
					datos.addLast(youtube);

					if (datos.darTamano() == num)
					{
						palabra = null;
					}
					System.out.println(youtube.getId());
				}
				catch (Exception e)
				{
					// error pasando de csv a youtube
					System.out.println("Error leyendo video");
				}
				try
				{
					palabra =csvReader.readNext();

				}
				catch (Exception e)
				{
					palabra =csvReader.readNext();
					// no lee la linea y sigue 
					System.out.println("Lee siguiente video");
				}
			}
			csvReader.close();

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
		System.out.println("El tamaño de el arreglo es" + datos.size());
		
		*/
	}

	public void cargar_NUMERO_DatosEnLista(int num)
	{
		if (num > lista.size())
		num = lista.size();
			{
			lista.subLista(num);	
			}

		/*/
		FileReader arhcCVS=null;
		CSVReader csvReader=null;
		try
		{

			arhcCVS= new FileReader("data/videos-small.csv");
			com.opencsv.CSVParser conPuntoYComa = new CSVParserBuilder().withSeparator(',').build();
			csvReader =new CSVReaderBuilder(arhcCVS).withCSVParser(conPuntoYComa).build();

			String[] palabra=csvReader.readNext();

			palabra =csvReader.readNext();

			while (palabra !=null)
			{	
				try {

					String id= palabra[0];

					SimpleDateFormat aaa = new SimpleDateFormat("dd.MM.yyyy");
					SimpleDateFormat bbb = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

					Date trendingDate = aaa.parse(palabra[1]);		
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


					youtube = new YoutubeVideo (id,trendingDate,  titulo, tituloCanal,catego,publishingTime , ttt, numeroV, numeroL, numeroD);
					lista.addFirst(youtube);
					while (num < lista.size())
					{
						if (lista.size() == num)
						{
							palabra = null;
						}
					}
				}
				catch (Exception e)
				{
					// error pasando de csv a youtube
					System.out.println("Error leyendo video");
				}
				try
				{
					palabra =csvReader.readNext();

				}
				catch (Exception e)
				{
					palabra =csvReader.readNext();
					// no lee la linea y sigue 
					System.out.println("Lee siguiente video");
				}
			}
			csvReader.close();

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
		System.out.println("El tamaño de la lista es " + lista.size());
	}
/*/

	}

}
