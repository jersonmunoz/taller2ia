package taller2;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de ciudades porfavor:");
	    while (!scan.hasNextInt()) {
	      System.out.println("Debe ingresar un número:");
	      scan.nextLine();
	    }
	    int numero = scan.nextInt();
	    long startTime = System.nanoTime();
	    MatrizDistancia matrizDistancia = new  MatrizDistancia(numero);
	    NodoCiudad[] lista_ciudades=matrizDistancia.generarCiudades();
	    matrizDistancia.agregarAdyacencia(lista_ciudades);
		BusquedaProfundidad busqueda = new BusquedaProfundidad();
		NodoCiudad nodo = lista_ciudades[0];
		LinkedList<NodoCiudad> camino_recorrido =busqueda.BusquedaProfundidadCiudad(nodo,lista_ciudades,0,numero);
		matrizDistancia.imprimirValoresRuta(camino_recorrido);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("Tiempo ejecución:");
		System.out.println(duration/1000000+"ms");
		//Se cae con 6960
	}

}
