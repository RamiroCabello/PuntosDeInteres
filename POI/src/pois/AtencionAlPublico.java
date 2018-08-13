package pois;

import java.time.DayOfWeek;
import java.util.List;
import org.joda.time.LocalDateTime;

public class AtencionAlPublico {
	
	private List<DayOfWeek> diasDisponibles;
	private List<TuplaHorario> horariosDisponibles;
	
	public boolean atiendeEnEseMomento(LocalDateTime momento) {
		
		return diasDisponibles.contains(momento.dayOfWeek()) && 
				horariosDisponibles.stream().anyMatch(h -> h.estaDentroDelHorario(momento));
	}

	
	public List<DayOfWeek> getDiasDisponibles() {
		return diasDisponibles;
	}

	public void setDiasDisponibles(List<DayOfWeek> diasDisponibles) {
		this.diasDisponibles = diasDisponibles;
	}

	public List<TuplaHorario> getHorariosDisponibles() {
		return horariosDisponibles;
	}

	public void setHorariosDisponibles(List<TuplaHorario> horariosDisponibles) {
		this.horariosDisponibles = horariosDisponibles;
	}
	
}
