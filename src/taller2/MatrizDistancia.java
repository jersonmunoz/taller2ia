package taller2;
import java.util.*;
public class MatrizDistancia {
	private int [][] matriz;
	
	public MatrizDistancia(int numero) {
		super();
		this.matriz=this.crearMatriz(numero); //Esta clase solo contiene la matriz de valores
	}
	public int[][] obtenerMatriz() {
		return this.matriz;
	}
	public int [][] crearMatriz(int n) {	//Este método genera la matriz de valor segun el número entregado por el usuario
		Random random = new Random();		
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {	
        	  for (int j = 0; j <= i; j++) {
        	    int x = random.nextInt(101);		//Todos los valores son generados con una random de 1 a 100
        	    if(i==j) {
        	    	array[i][j]=0;		//Si las coordenadas son iguales sus valores serán 0
        	    }
        	    else {	
          	      array[j][i] = x;		//En caso contrario agregará los valores simetricamente en la matriz
          	      array[i][j] = x;		//El objetivo de esto es obtener una matriz simetrica añadiendo el mismo valor
          	    }						//en la coordenada (x,y) e (y,x)
        	  }
        }
     /*   for( int[] a : array ) { 
            System.out.println( Arrays.toString( a ));
        } */
        return array;
	}
	public NodoCiudad[] generarCiudades() { //Este método genera las ciudades y retorna una lista de NodoCiudad
		int cantidadCiudades=this.matriz[0].length;//Estas dependeran de la cantidad de ciudades agregada a la matriz
		NodoCiudad [] ciudades = new NodoCiudad[cantidadCiudades];//Se generará cada nodo 
		for(int i =0;i<cantidadCiudades;i++) {
			ciudades[i]=new NodoCiudad("A"+i);//El nombre cada ciudad será ciudad A y luego su index , por ejemplo ciudad A0
		}
		return ciudades;
	}
	public void imprimirValoresRuta(LinkedList<NodoCiudad>camino_recorrido){	//Este método imprime los valores obtenidos en el recorrido que nos entregó el algoritmo DFS
		int valorInicial=Integer.parseInt(camino_recorrido.get(0).getCiudad().substring(1));		//El valor inicial será el nodo con posición 0 en la lista del recorrido
		System.out.print("[A"+valorInicial+"]"+ " =>");				//Aca imprime la primera ciudad
		for(int i=0;i<camino_recorrido.size()-1;i++) {				//Iterará hacia las siguientes ciudades que encontró el algoritmo en su solución
			int valorX =Integer.parseInt(camino_recorrido.get(i).getCiudad().substring(1));		//cada camino es un par ordenado , osea desde la ciudad (x) hacia la ciudad(y) , esto se obtiene desde el nombre de la ciudad EJ: A0- > X=0
			int valorY = Integer.parseInt(camino_recorrido.get(i+1).getCiudad().substring(1));	//Esto se utiliza para obtener los valores de la matriz y el costo de recorrer el camino desde x hacia y
			System.out.print(matriz[valorX][valorY]+" =>");			//Aca se imprime el valor obtenido 
			if(valorY==camino_recorrido.size()-1) {				//En caso de que el valor Y sea el ultimo de la lista imprimirá un caracter diferente para el formato requerido por el profesor
				System.out.println("[A"+valorY+"] ");			//Finalmente imprime
			}
			else {
				System.out.print("[A"+valorY+"] =>");			//Imprime las diferentes ciudades obtenidas
			}
			
		}
	}
	public void agregarAdyacencia(NodoCiudad[] lista_ciudades) {	//Este metodo agrega los nodos adyacentes de la rama del grafo mediante iteraciones 
		  for(int i=0;i<lista_ciudades.length;i++) {				
		    	for(int j=i+1;j<lista_ciudades.length;j++) {
		    		lista_ciudades[i].añadirAdyacentes(lista_ciudades[j]);
			    }
		    }
	}


}
