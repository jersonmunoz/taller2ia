package taller2;
import java.util.*;
public class NodoCiudad {
	private String ciudad;
	private boolean visitado;
	private List<NodoCiudad> adyacentes;

public NodoCiudad(String ciudad){
	this.ciudad=ciudad;
	this.adyacentes= new LinkedList<NodoCiudad>();
	}

public void añadirAdyacentes(NodoCiudad nodo) {
	this.adyacentes.add(nodo);	
}
public List<NodoCiudad> getAdyacentes() {
    return adyacentes;
}
 public String getCiudad() {
	 return this.ciudad;
 }
 public void setVisitado(boolean visitado) {
	 this.visitado=visitado;
 }
 public boolean getVisitado() {
		return visitado;
	}
}
