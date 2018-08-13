package mapa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import pois.*;

public class Mapa {

	private List<PuntoDeInteres> pois;
	private static Mapa instancia= null;

	//Singleton
	private Mapa() {}
	
	public static Mapa getInstancia() {
		if (instancia == null) instancia= new Mapa();
		
		return instancia;
	}
	
	
	public void agregarPunto(PuntoDeInteres punto) {
		this.pois.add(punto);
	}
	
	public void quitarPunto(PuntoDeInteres punto) {
		this.pois.remove(punto);
	}
	
	
	public List<PuntoDeInteres> getPois() {
		return pois;
	}

	public void setPois(List<PuntoDeInteres> pois) {
		this.pois = pois;
	}
}
