package model.data_structures;

/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */
public class ArregloDinamico <T extends Comparable <T>>  implements IArregloDinamico <T>, Comparable <ArregloDinamico <T>>
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
               elementos = (T[]) new  String [max];
               tamanoMax = max;
               tamanoAct = 0;
        }
        
		public void agregar( T dato )
        {
               if ( tamanoAct == tamanoMax )
               {  // caso de arreglo lleno (aumentar tamaNo)
                    tamanoMax = 2 * tamanoMax;
                    T [ ] copia = (T[]) elementos;
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

		public int darTamano() {
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


		public <T extends Comparable<T>> T buscar(T dato) 
		{
			// TODO implementar
			// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
			
			T rta = null;
			boolean stop=false;
			
            for ( int i = 0; i < tamanoAct && stop==false; i++)
            {
            	T objeto= (T) elementos[i];
            	
             	 if (  dato.compareTo(objeto)==0)
             	 {
             		rta = objeto;
             		stop = true;
             	 }
            } 
			return rta;
		}
		
		
		public  <T extends Comparable<T>> T eliminar(T dato)
		{
			// TODO implementar
			// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
			T rta=null;
			boolean stop=false;
            for ( int i = 0; i < tamanoAct && stop==false; i++)
            {
            	T objeto= (T) elementos[i];
             	 if (  dato.compareTo(objeto)==0)
             	 {
             		rta=objeto;
             		
             		for (int j=i;j< tamanoAct;j++)
             		{
             			if (j!=tamanoAct-1)
             				{
             				elementos[j]=elementos[j+1];
             				}
             			else
             			{
             				elementos[j]=null;
             			}
             		}
             		
             		stop=true;
             		tamanoAct=tamanoAct-1;
             	 }
            } 
			return rta;
		}
		
		
		@Override
		public T[] invertir() {
			// TODO Auto-generated method stub
			T[]  copia = (T[]) new String [tamanoAct] ;

			for(int i=0; i<tamanoAct; i++)
			{
				for (int j=tamanoAct; j>-1; j--)
				{
					copia[i]= elementos[j];
				}
				
			}
			return copia;
		}

		
		
		@Override
		public int compareTo(ArregloDinamico<T> o) {
			// TODO Auto-generated method stub
			return 0;
		}


		
}
