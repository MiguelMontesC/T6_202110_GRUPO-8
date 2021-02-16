package view;

import model.logic.Modelo;

public class View 
{
	 /**
     * Metodo constructor
     */
    public View()
    {
    	
    }
    
	public void printMenu()
	{
		System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Enter: (e.g., 1):");

		
		System.out.println("1. Cargar Youtube Video en Lista Encadenada");
		System.out.println("2. Cargar Youtube Video en Arreglo Dinamico");

	}

	public void printMessage(String mensaje) {

		System.out.println(mensaje);
	}		
	
	public void printModelo(Modelo modelo)
	{
		// TODO implementar
	}

}
