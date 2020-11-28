package taller2;
import java.util.*;
public class NodoCiudad {
	private String ciudad;
	private boolean visitado;
	private List<NodoCiudad> adyacentes;
	private NodoCiudad padre;

public NodoCiudad(String ciudad){
	this.ciudad=ciudad;
	this.adyacentes= new ArrayList<NodoCiudad>();
	}

public void añadirAdjacentes(NodoCiudad nodo) {
	this.adyacentes.add(nodo);	
}
public boolean getVisitado() {
	return visitado;
}
public void setPadre(NodoCiudad nodo) {
	padre=nodo;
}
public NodoCiudad getPadre() {
	return padre;
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
}
