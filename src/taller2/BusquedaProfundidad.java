package taller2;
import java.util.*;
public class BusquedaProfundidad {
	private LinkedList<NodoCiudad> camino_recorrido;
	public BusquedaProfundidad() {
		camino_recorrido=new LinkedList<NodoCiudad>();	//Esta clase solo almacenará el camino recorrido que deberá retornar
	}

	public LinkedList<NodoCiudad> BusquedaProfundidadCiudad(NodoCiudad raiz,	//Este método es iterativo lo que permitirá el recorrido en profundidad
			NodoCiudad[] lista_ciudades,int profundidad,int limite){
		if(!camino_recorrido.contains(raiz)) {		//Si el camino recorrido contiene la raiz no la agregará y continuará despues del if
			raiz.setVisitado(true);					//En caso contrario marcará el nodo raiz como visitado
		//	System.out.println(raiz.getCiudad());
		//	System.out.println(profundidad);
			camino_recorrido.add(raiz);				//Finalmente lo agregará al camino recorrido que es una lista con NodoCiudad
		}
		for(NodoCiudad nodo:raiz.getAdyacentes()) {	//Ahora procede a realizar el recorrido de los nodos adyacentes si esque tiene , en caso contrario será un nodo hoja
			if(camino_recorrido.size()==limite || profundidad==limite) {		//Si es un nodo hoja o la cantidad de ciudades recorridas es igual a la cantidad ingresada de ciudades, finalizará la iteración
				break;													//Esto nos dice que encontró una solución o que se llegó al limite de profundidad
			}
			else if(!nodo.getVisitado()&&profundidad!=limite) {		//En caso contrario , si aun quedan nodos por visitar y la profundidad no está en su maximo , entonces realizará el mismo procedimiento
			BusquedaProfundidadCiudad(nodo,lista_ciudades,profundidad+1,limite);	
			}
		}	
		return camino_recorrido;			//Cuando finalice el recorrido luego del break , retornará la solución que encontro mediante una lista de NodoCiudad
	}

}

	

