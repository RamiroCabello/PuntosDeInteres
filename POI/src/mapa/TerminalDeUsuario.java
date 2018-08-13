package mapa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.uqbar.geodds.Point;
import pois.PuntoDeInteres;

public class TerminalDeUsuario {
	
	private Point coordenadaas;
	private Mapa mapa= Mapa.getInstancia();
	private Reporte reporte= Reporte.getInstancia();
	private String nombreTerminal;
	private List<AccionDeBusqueda> acciones;
	
	public List<PuntoDeInteres> buscarPuntosEnSistema(String tag){
		return this.mapa.getPois().stream().filter(p -> p.buscarPorTag(tag)).collect(Collectors.toList());
	}
	
	public List<PuntoDeInteres> buscarCGPsExternos(String calleOZona){
		return new ArrayList<PuntoDeInteres>();
	}
	
	public List<PuntoDeInteres> buscarBancosExternos(String nombreBanco, String nombreServicio){
		return new ArrayList<PuntoDeInteres>();
	}
	
	public List<PuntoDeInteres> buscarTodosLosPuntos(String tag){
		List<PuntoDeInteres> listaTotal= this.buscarPuntosEnSistema(tag);
		listaTotal.addAll(this.buscarCGPsExternos(tag));
		listaTotal.addAll(this.buscarBancosExternos(tag, tag));
		this.generarBusquedaParaReporte(listaTotal, tag);
		this.acciones.forEach(a -> a.realizarAccion(););
		
		return listaTotal;
	}

	private void generarBusquedaParaReporte(List<PuntoDeInteres> listaTotal, String tag) {
		
		this.reporte.agregarBusqueda(new Busqueda(tag, listaTotal.size(), nombreTerminal));
	}

}
