package pois;

import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.uqbar.geodds.Point;

public class LocalComercial extends PuntoDeInteres{

	private Rubro rubro;
	private AtencionAlPublico diaYHoraDeAtencion;
	
	
	public boolean estaCerca(Point ubicacion) {
		return this.getCoordenadas().distance(ubicacion)<  rubro.getRadioDeCercania();
	}
	
	public boolean estaDisponible(LocalDateTime momento) {
		return diaYHoraDeAtencion.atiendeEnEseMomento(momento);
	}

	@Override
	public boolean buscarPorTag(String tag) {
		return rubro.getNombreRubro() == tag;
	}
	
	
	
}
