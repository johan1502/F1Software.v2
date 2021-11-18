package co.edu.unbosque.model;

import java.io.Serializable;

public class JuegoDTO implements Serializable{

	private static final long serialVersionIUD = 122L;
	public String nombreJuego;
	public String tipoJuego;
	
	public JuegoDTO(String nombre, String tipo) {
		nombreJuego = nombre;
		tipoJuego = tipo;
	}
	
	public String toString() {
		return "Nombre del juego: " +  nombreJuego + "\n" + 
	           "Tipo de juego:  " + tipoJuego;
	}
	
	//-------------------- getters y setters ----------------------------------
	
	public String getNombreJuego() {
		return nombreJuego;
	}
	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}
	public String getTipoJuego() {
		return tipoJuego;
	}
	public void setTipoJuego(String tipoJuego) {
		this.tipoJuego = tipoJuego;
	}

	public static long getSerialversioniud() {
		return serialVersionIUD;
	}
		
}
