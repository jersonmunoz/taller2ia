package taller2;
import java.util.Scanner;

import Utils.BusquedaProfundidad;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese un número porfavor:");
	    while (!scan.hasNextInt()) {
	      System.out.println("Debe ingresar un número:");
	      scan.nextLine();
	    }
	    int numero = scan.nextInt();
	    long startTime = System.nanoTime();
	    MatrizDistancia matrizdistancia = new  MatrizDistancia(numero);
	    NodoCiudad nodo= new NodoCiudad("A1");
		NodoCiudad nodo2= new NodoCiudad("A2");
		NodoCiudad nodo3= new NodoCiudad("A3");
		NodoCiudad nodo4= new NodoCiudad("A4");
		NodoCiudad nodo5= new NodoCiudad("A5");
		nodo.añadirAdjacentes(nodo2);
		nodo.añadirAdjacentes(nodo3);
		nodo.añadirAdjacentes(nodo5);
		nodo2.añadirAdjacentes(nodo4);
		nodo2.añadirAdjacentes(nodo5);
		BusquedaProfundidad busqueda = new BusquedaProfundidad();
		busqueda.BusquedaProfundidad(nodo);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println(duration/1000000+"ms");
		//Se cae con 17799
	}

}
