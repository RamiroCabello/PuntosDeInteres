package mapa;

import java.util.ArrayList;
import java.util.List;
import pois.PuntoDeInteres;
import java.util.Map;
import java.util.stream.Collectors;
import org.joda.time.LocalDate;

public class Reporte {

	private static Reporte instancia=null;
	private List<Busqueda> busquedas= new ArrayList<Busqueda>();
	
	//Singleton
	private Reporte() {}
	
	public static Reporte getInstancia() {
		if (instancia == null) instancia= new Reporte();
		
		return instancia;
	}
	
	public void agregarBusqueda(Busqueda busqueda) {
		this.busquedas.add(busqueda);
	}
	
	
	public Map<LocalDate, Long> cantBusquedasPorFecha(LocalDate fecha){
		return this.busquedas.stream().collect(Collectors.groupingBy(Busqueda::getFecha, 
				                               Collectors.counting()));
	}
	
	public Map<String, Integer> cantResultadosPorBusqueda(){
		return this.busquedas.stream().collect(Collectors.groupingBy(Busqueda::getFraseBuscada, 
				Collectors.summingInt(Busqueda::getCantResultados)));
	}
	
	public Map<String, Integer> cantResultadosPorTerminal(){
		return this.busquedas.stream().collect(Collectors.groupingBy(Busqueda::getTerminal, 
				Collectors.summingInt(Busqueda::getCantResultados)));
	}
}
