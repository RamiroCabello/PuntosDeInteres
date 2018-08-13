package pois;

import org.joda.time.*;

public class TuplaHorario {

	private LocalTime horaInicio;
	private LocalTime horaFin;
	
	public TuplaHorario(LocalTime horaInicio, LocalTime horaFin) {
		this.horaInicio= horaInicio;
		this.horaFin= horaFin;
	}
	
	public boolean estaDentroDelHorario(LocalDateTime fecha) {
		
		return (fecha.getHourOfDay() >= horaInicio.getHourOfDay() &&
				fecha.getHourOfDay() < horaFin.getHourOfDay());
	}
}
