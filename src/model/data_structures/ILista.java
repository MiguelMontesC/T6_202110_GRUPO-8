/**
 * 
 */
package model.data_structures;

/**
 * @author Beba
 *
 */
public interface ILista  <T extends Comparable <T>> {

	/**
	 * Agrega un elemento al inicio de la lista.
	 * @param elemento a agregar.
	 */
	void addFirst(T element);
	
	/**
	 * Agrega un elemento al final de la lista.
	 * @param elemento a agregar.
	 */
	void addLast(T element);
	
	/**
	 * Agrega un elemento en la posición pos si la posición es una posición válida.
	 * @param elemento a agregar.
	 * @param posición donde se agrega.
	 */
	void insertElement(T element, int pos);
	
	/**
	 * Elimina el primer elemento. 
	 * @return El elemento eliminado.
	 */
	T removeFirst();
	
	/**
	 * Elimina el último elemento. 
	 * @return El elemento eliminado.
	 */
	T removeLast();
	
	/**
	 * Elimina el elemento de una posición válida.
	 * @param posición del elemento que se va a eliminar.
	 * @return el elemento eliminado.
	 */
	T deleteElement(int pos);
	
	/**
	 * Retorna el primer elemento.
	 * @return primer elemento.
	 */
	T firtsElement();
	
	/**
	 * Retorna el último elemento.
	 * @return último elemento.
	 */
	T lastElement() throws Exception;
	
	/**
	 * Retorna el elemento en una posición válida.
	 * @param posición del elemento
	 * @return elemento en la posición dada.
	 */
	T getElement(int pos);

	/**
	 * Retorna el número de datos del arreglo
	 * @return Número de datos del arreglo
	 */
	int size();
	
	/**
	 * Retorna si la lista esta o no vacía
	 * @return true si el arreglo No tiene datos. false de lo contrario.
	 */
	boolean isEmpty();
	
	/**
	 * Retorna la posición válida de un elemento.
	 * @param elemento que se busca.
	 * @return la posición válida del elemento. Si no se encuentra el elemento, el valor retornado es -1
	 */
	int isPresent(T elemento);
	
	/**
	 * Intercambia la información de los elementos en dos posiciones válidas.
	 * @param primer posición.
	 * @param segunda posición.
	 * 
	 */
	void exchange(int i, int j);
	
	/**
	 * Actualiza el elemento en una posición válida.
	 * @param posición del elemento.
	 * @param elemento que va a reemplazar.
	 */
	void changeInfo(int i, T elemento);
	

}
