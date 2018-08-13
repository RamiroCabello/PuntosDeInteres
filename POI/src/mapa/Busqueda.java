package mapa;

import org.joda.time.*;

public class Busqueda {
	
	private String fraseBuscada;
	private int cantResultados;
	private LocalDate fecha;
	private String terminal;
	
	public Busqueda(String fraseBuscada, int cantResultados, String terminal) {
		this.fraseBuscada= fraseBuscada;
		this.cantResultados= cantResultados;
		this.terminal= terminal;
		this.fecha= LocalDate.now();
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public int getCantResultados() {
		return cantResultados;
	}

	public void setCantResultados(int cantResultados) {
		this.cantResultados = cantResultados;
	}
	
	public String getFraseBuscada() {
		return fraseBuscada;
	}

	public void setFraseBuscada(String fraseBuscada) {
		this.fraseBuscada = fraseBuscada;
	}
	
	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	

}
