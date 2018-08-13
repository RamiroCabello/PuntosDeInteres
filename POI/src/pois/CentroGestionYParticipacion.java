package pois;

import org.uqbar.geodds.Point;
import org.uqbar.geodds.Polygon;
import java.util.List;
import org.joda.time.*;

public class CentroGestionYParticipacion extends PuntoDeInteres{

	private List<Servicio> servicios;
	
	
	public boolean estaCerca(Polygon comuna) {
		return comuna.isInside(this.getCoordenadas());
	}
	
	public boolean estaDisponible(LocalDateTime momento) {
		return true;
	}
	
	
	public boolean estaDisponible(LocalDateTime momento, String nombreServicio) {
		
		return this.buscarServicioPorNombre(nombreServicio).estaDisponible(momento);
	}
	
	
	public Servicio buscarServicioPorNombre(String nombreServicio) {
		
		return servicios.stream().filter(s -> s.getServicio() == nombreServicio).findFirst().get();
	}

	@Override
	public boolean buscarPorTag(String tag) {
		return this.servicios.stream().anyMatch(s -> s.getServicio().contains(tag) );
	}
	
}
