package controller;

import java.text.ParseException;
import java.util.Scanner;

import model.logic.Modelo;
import view.View;

public class Controller 
{
	/* Instancia del Modelo*/
	private Modelo modelo;

	/* Instancia de la Vista*/
	private View view;

	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view = new View();
		modelo = new Modelo();
	}

	public void run() throws ParseException
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option) {					
			case 1:
				view.printMessage("--------- Cargar YoutubeVideo en Lista Encadenada ---------");
				modelo = new Modelo(); 
				modelo.cargarYoutubeVideoListaEncadenada();
				view.printMessage("");
				view.printMessage("Se ha cargado con Exito en la Lista Encadenada");
				view.printMessage("--------- Escriba el numero de YoutubeVideo que quiere cargar en Lista Encadenada ---------");
				int nume = lector.nextInt();
				modelo.cargar_NUMERO_DatosEnLista(nume);
				view.printMessage("Se ha cargado con Exito en el Arreglo Dinamico");
				break;	
				

			case 2:
				view.printMessage("--------- Cargar YoutubeVideo en Arreglo Dinamico ");
				modelo.cargarDatosArregloDinamico();
				view.printMessage("Se ha cargado con Exito en el Arreglo Dinamico");
				view.printMessage("--------- Escriba el numero de YoutubeVideo que quiere cargar en Arreglo Dinamico ---------");
				int num = lector.nextInt();
				modelo.cargar_NUMERO_DatosEnArregloDinamico(num);
				view.printMessage("Se ha cargado con Exito en el Arreglo Dinamico");
				break;
				
			case 3: 
				view.printMessage("--------- \n Hasta pronto !! \n---------"); 
				lector.close();
				fin = true;
				break;	

			default: 
				view.printMessage("--------- \n Opcion Invalida !! \n---------");
				break;

			}

		}
	}
}
