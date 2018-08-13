package pois;

import org.uqbar.geodds.Point;

public abstract class PuntoDeInteres {
	
	private Point coordenadas;
	private String direccion;
	private String callePrincipal;
	private String entreCalle1;
	private String entreCalle2;
	private int numero; 
	
	
	public abstract boolean buscarPorTag(String tag);
	
	public Point getCoordenadas() {
		return coordenadas;
	}
	
	public void setCoordenadas(Point coordenadas) {
		this.coordenadas = coordenadas;
	}
	
	
	
	
}
