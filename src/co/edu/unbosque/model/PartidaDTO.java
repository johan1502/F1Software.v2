package co.edu.unbosque.model;

import java.io.Serializable;

public class PartidaDTO implements Serializable{

	private String tipoPartida;
	private String jugador1;
	private String jugador2;
	private double puntaje1 = 0.0;
	private double puntaje2 = 0.0;
	
	public PartidaDTO() {}
	
	public PartidaDTO(String tipo, String j1, String j2, double p1, double p2) {
		tipoPartida = tipo;
		jugador1 = j1;
		jugador2 = j2;
		puntaje1 = p1;
		puntaje2 = p2;
	}
	
	public String toString() {
		return "Tipo de partida:  " + tipoPartida + "\n" + 
	           "Nombre jugador 1: " + jugador1 + "\n" + 
			   "Puntaje:  " + puntaje1 + "\n" +
			   "Nombre jugador 2: " + jugador2 + "\n" + 
	           "Puntaje:  " + puntaje2;
	}
	
	
	//-------------------- getters y setters ----------------------------------
	
	public String getTipoPartida() {
		return tipoPartida;
	}
	public void setTipoPartida(String tipoPartida) {
		this.tipoPartida = tipoPartida;
	}
	public String getJugador1() {
		return jugador1;
	}
	public void setJugador1(String jugador1) {
		this.jugador1 = jugador1;
	}
	public String getJugador2() {
		return jugador2;
	}
	public void setJugador2(String jugador2) {
		this.jugador2 = jugador2;
	}
	public double getPuntaje1() {
		return puntaje1;
	}
	public void setPuntaje1(double puntaje1) {
		this.puntaje1 = puntaje1;
	}
	public double getPuntaje2() {
		return puntaje2;
	}
	public void setPuntaje2(double puntaje2) {
		this.puntaje2 = puntaje2;
	}
		
}