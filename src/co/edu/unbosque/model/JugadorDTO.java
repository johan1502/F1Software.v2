package co.edu.unbosque.model;

import java.io.Serializable;

public class JugadorDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nombreJugador;
	private int edad;
	private String genero;
	private double puntaje;
	private long documento;
	private String numeroJugador;
	
	public JugadorDTO() {}
	
	public JugadorDTO(String numero, String nombre, int eda, String gene, long document, double points) {
		numeroJugador = numero;
		nombreJugador = nombre;
		edad = eda;
		genero = gene;
		documento = document;
		puntaje = points;
	}
	
	public String toString() {
		return numeroJugador.toUpperCase() + "\n" +
			   "Nombre:  " + nombreJugador + "\n" + 
	           "Edad:  " + edad + "\n" + 
			   "Genero:  " + genero + "\n" + 
	           "Puntaje:  " + puntaje;
	}
	
	
	//-------------------- getters y setters ----------------------------------
	
	public String getNombreJugador() {
		return nombreJugador;
	}
	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public double getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}
	public long getDocumento() {
		return documento;
	}
	public void setDocumento(long documento) {
		this.documento = documento;
	}
	public String getNumeroJugador() {
		return numeroJugador;
	}
	public void setNumeroJugador(String numeroJugador) {
		this.numeroJugador = numeroJugador;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}