package taller2;
import java.util.*;
public class MatrizDistancia {
	private int [][] matriz;
	
	public MatrizDistancia(int numero) {
		super();
		this.matriz=this.crearMatriz(numero);
	}
	public int[][] obtenerMatriz() {
		return this.matriz;
	}
	public int [][] crearMatriz(int n) {
		Random random = new Random();
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
        	  for (int j = 0; j <= i; j++) {
        	    int x = random.nextInt(101);
        	    if(i==j) {
        	    	array[i][j]=0;
        	    }
        	    else {
          	      array[j][i] = x;
          	      array[i][j] = x;
          	    }
        	  }
        }
        for( int[] a : array ) { 
            System.out.println( Arrays.toString( a ));
        }
        return array;
	}

}
