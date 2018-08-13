package pois;

import org.joda.time.*;
import java.time.DayOfWeek;
import java.util.List;

public class Servicio {
	
	private String nombreServicio;	
	private AtencionAlPublico diaYHorarioDeAtencion;

	
	public boolean estaDisponible(LocalDateTime momento) {
		return diaYHorarioDeAtencion.atiendeEnEseMomento(momento);
	}
	
	public String getServicio() {
		return nombreServicio;
	}

	public void setServicio(String servicio) {
		this.nombreServicio = servicio;
	}

}
