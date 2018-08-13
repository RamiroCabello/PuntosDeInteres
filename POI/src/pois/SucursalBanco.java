package pois;

import org.joda.time.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.DayOfWeek;
import org.uqbar.geodds.Point;

public class SucursalBanco extends PuntoDeInteres{
	
	private AtencionAlPublico diaYHorarioAtencion;
	private String nombreBanco;
	
	
	public SucursalBanco(String nombreBanco) {
		this.diaYHorarioAtencion.setDiasDisponibles(this.diasDisponiblesBanco());
		this.diaYHorarioAtencion.setHorariosDisponibles(this.horarioBancario());
		this.nombreBanco= nombreBanco;
	}

	public boolean estaCerca(Point ubicacion) {
		return this.getCoordenadas().distance(ubicacion)<  0.5;
	}

	
	public boolean estaDisponible(LocalDateTime momento) {
		return diaYHorarioAtencion.atiendeEnEseMomento(momento);
	}
	
	
	public List<DayOfWeek> diasDisponiblesBanco(){
		List<DayOfWeek> diasDisponibles= new ArrayList<DayOfWeek>();
		diasDisponibles.add(DayOfWeek.MONDAY);
		diasDisponibles.add(DayOfWeek.TUESDAY);
		diasDisponibles.add(DayOfWeek.WEDNESDAY);
		diasDisponibles.add(DayOfWeek.THURSDAY);
		diasDisponibles.add(DayOfWeek.FRIDAY);
		
		return diasDisponibles;
	}

	
	private List<TuplaHorario> horarioBancario() {
		TuplaHorario horario= new TuplaHorario(new LocalTime(10,0), new LocalTime(15,0));
		List<TuplaHorario> lista= new ArrayList<TuplaHorario>();
		lista.add(horario);
		
		return lista;
	}

	@Override
	public boolean buscarPorTag(String tag) {
		return this.nombreBanco == tag;
	}
	

}
