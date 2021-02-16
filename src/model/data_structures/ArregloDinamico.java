package model.data_structures;

/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */
public class ArregloDinamico <T extends Comparable <T>>  implements ILista <T>, Comparable <ArregloDinamico <T>>
{
		/**
		 * Capacidad maxima del arreglo
		 */
        private int tamanoMax;
		/**
		 * Numero de elementos presentes en el arreglo (de forma compacta desde la posicion 0)
		 */
        private int tamanoAct;
        /**
         * Arreglo de elementos de tamaNo maximo
         */
        private T elementos[ ];

        /**
         * Construir un arreglo con la capacidad maxima inicial.
         * @param max Capacidad maxima inicial
         */
		public ArregloDinamico( int max )
        {
               elementos = (T[]) new String[max];;
               tamanoMax = max;
               tamanoAct = 0;
        }
        
		public void agregar( T dato )
        {
               if ( tamanoAct == tamanoMax )
               {  // caso de arreglo lleno (aumentar tamaNo)
                    tamanoMax = 2 * tamanoMax;
                    T [ ] copia = elementos;
                    elementos = (T[]) new String[tamanoMax];
                    for ( int i = 0; i < tamanoAct; i++)
                    {
                     	 elementos[i] = (T) copia[i];
                    } 
            	    System.out.println("Arreglo lleno: " + tamanoAct + " - Arreglo duplicado: " + tamanoMax);
               }	
               elementos[tamanoAct] = dato;
               tamanoAct++;
       }

		public int darCapacidad() {
			return tamanoMax;
		}

		public int darTamanoAct() {
			return tamanoAct;
		}

		public T darElemento(int i) {
			// TODO implementar
			T element = null;
			if (i>0 && i< tamanoAct)
			{
				element = (T) elementos[i];
			}
			
			return element;
		}

		public T buscar(T dato) {
			// TODO implementar
			// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
			for (int i=0; i< tamanoAct; i++)
			{
				if(((T) darElemento(i)).equals(dato))
				{
					return (T) elementos[i];
				}
			}
			return null;
		}

		public T eliminar(T dato) {
			// TODO implementar
			// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
			T elemento = buscar(dato);
			
				for (int i=0; i< tamanoAct; i++)
				{
					if(darElemento(i).equals(dato))
					{
						elementos[i] = elementos[i+1];
					}
				}	
			
			
			return elemento;
		}
		
		public void invertir()
		{
			T [] copia = elementos;
			elementos = (T[]) new String [tamanoMax];
			for (int i =0; i < elementos.length; i++)
			{
				elementos[tamanoAct-1-i] = copia[i];
			}
		}
		
		
		public int compareTo(T obj)
		{
			int resultado = (Integer) null;
			for (int i=0; i< tamanoAct; i++)
			{
				if ( elementos[i] == obj)
				{
					resultado = 0;
				}
				
			}
			return resultado;
		}

		@Override
		public int compareTo(ArregloDinamico<T> o) {
			return tamanoAct - o.darTamanoAct();
		}

		@Override
		public void addFirst(T element) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void addLast(T element) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertElement(T element, int pos) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public T removeFirst() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public T removeLast() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public T deleteElement(int pos) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public T firtsElement() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public T lastElement() throws Exception {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public T getElement(int pos) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int isPresent(T elemento) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void exchange(int i, int j) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void changeInfo(int i, T elemento) {
			// TODO Auto-generated method stub
			
		}

		

}
