package Utils;
import java.util.*;
import taller2.NodoCiudad;
public class BusquedaProfundidad {
	private Stack<NodoCiudad> pila;
	public BusquedaProfundidad() {
		pila=new Stack<NodoCiudad>();
	}
	
	public void BusquedaProfundidad(NodoCiudad raiz){
	pila.add(raiz);
	raiz.setVisitado(true);
	while(!pila.isEmpty()) {
			NodoCiudad nodoActual=pila.pop();
			System.out.println("NodoActual: "+nodoActual.getCiudad());
			
			for(NodoCiudad nodo:nodoActual.getAdyacentes()) {
				if(!nodo.getVisitado()){
					nodo.setVisitado(true);
					nodo.setPadre(nodoActual);
					pila.push(nodo);
				}
			}
	}
	}
	
}
