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
		String dato = "";
		String respuesta = "";

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option){
			case 1:
				view.printMessage("--------- Cargar YoutubeVideo en Lista Encadenada ---------");
				modelo = new Modelo(); 
				modelo.cargarYoutubeVideoListaEncadenada();
				view.printMessage("Se ha cargado con Exito en la Lista Encadenada");						
				break;

			case 2:
				view.printMessage("--------- Cargar YoutubeVideo en Arreglo Dinamico ");
				modelo.cargarDatosArregloDinamico();
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
