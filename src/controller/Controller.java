package controller;

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

	public void run()
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
				view.printMessage("--------- Cargar YoutubeVideo en Lista Encadenada ");
				int capacidad = lector.nextInt();
				modelo = new Modelo(capacidad); 
				view.printMessage("Arreglo Dinamico creado");
				view.printMessage("Numero actual de elementos " + modelo.darTamanoAct() + "\n---------");						
				break;

			case 2:
				view.printMessage("--------- Cargar YoutubeVideo en Arreglo Dinamico ");
				dato = lector.next();
				modelo.agregar(dato);
				view.printMessage("Dato agregado");
				view.printMessage("Numero actual de elementos " + modelo.darTamanoAct() + "\n---------");						
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
