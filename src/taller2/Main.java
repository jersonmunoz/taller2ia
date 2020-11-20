package taller2;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//static ArrayList<NodoCiudad> nodos=new ArrayList<>();
		MatrizDistancia matrizdistancia = new  MatrizDistancia(4);
		matrizdistancia.getMatriz();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text: ");
	    String myString = input.next();
		System.out.println("Texto: "+myString);
		NodoCiudad nodo= new NodoCiudad("A1");
		NodoCiudad nodo2= new NodoCiudad("A2");
		
	
		
	}

}
