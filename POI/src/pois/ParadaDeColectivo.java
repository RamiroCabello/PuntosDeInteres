package pois;

import org.uqbar.geodds.Point;
import org.joda.time.*;

public class ParadaDeColectivo extends PuntoDeInteres{
	
	private int nroLinea;
	
	public ParadaDeColectivo(int nroLinea) {
		this.nroLinea= nroLinea;
	}
	
	public boolean estaCerca(Point ubicacion) {
		return this.getCoordenadas().distance(ubicacion)<  0.1;
	}
	
	public boolean estaDisponible(LocalDateTime fechaYHora) {
		return true;
	}

	@Override
	public boolean buscarPorTag(String tag) {
		return nroLinea == Integer.valueOf(tag);
	}
}
