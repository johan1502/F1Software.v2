package co.edu.unbosque.model.persistence;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.JuegoDTO;
import co.edu.unbosque.model.JugadorDTO;
import co.edu.unbosque.model.PartidaDTO;

public class BinariosFile {

	private static File archivoJugador;
	private static File archivoJuego;
	private static File archivoPartidas;
	
	public BinariosFile() {
		archivoJugador = new File(".\\Archivo\\Jugadores.dat");
		archivoJuego = new File(".\\Archivo\\Juegos.dat");
		archivoPartidas = new File(".\\Archivo\\Partidas.dat");
	}
	
	public void escrituraJugador(JugadorDTO jugador) {
		ObjectOutputStream escritura;
		try {
			if(archivoJugador.length() != 0) {
				escritura = new LecturaObjeto(new FileOutputStream(archivoJugador, true));
			}else {
				escritura = new ObjectOutputStream(new FileOutputStream(archivoJugador));
			}
			escritura.writeObject(jugador);
			escritura.close();

		} catch(Exception e) {}
	}
	
	public ArrayList <JugadorDTO> lecturaJugador() {
		ArrayList <JugadorDTO> lista = new ArrayList <JugadorDTO> ();
		FileInputStream flujo;
		ObjectInputStream lectura;
		JugadorDTO jugador;;
		try {
			flujo = new FileInputStream(archivoJugador);
			lectura = new ObjectInputStream(flujo);
			try {
				while(true) {
					jugador = (JugadorDTO) lectura.readObject(); 
					lista.add(jugador);
				}
			} catch(EOFException fin) {}
			
		} catch(Exception e) {}
		return lista;
	}
	
	public void escrituraJuego(JuegoDTO juego) {
		FileOutputStream flujo;
		ObjectOutputStream escritura;
		try {
			if(archivoJuego.length() != 0) {
				escritura = new LecturaObjeto(new FileOutputStream(archivoJuego, true));
			}else {
				escritura = new ObjectOutputStream(new FileOutputStream(archivoJuego));
			}
			escritura.writeObject(juego);
			escritura.close();
			
		} catch(Exception e) {}
	}
	
	
	public ArrayList <JuegoDTO> lecturaJuego() {
		ArrayList <JuegoDTO> lista = new ArrayList <JuegoDTO> ();
		FileInputStream flujo;
		ObjectInputStream lectura;
		JuegoDTO juego;
		try {
			flujo = new FileInputStream(archivoJuego);
			lectura = new ObjectInputStream(flujo);
			
			try {
				while(true) {
					juego = (JuegoDTO) lectura.readObject();
					lista.add(juego);
				}
			} catch(EOFException fin) {}
		} catch(Exception e) {}
		return lista;
	}
	
	
	
	public void escrituraPartida(PartidaDTO partida) {
		ObjectOutputStream escritura;
		try {
			if(archivoPartidas.length() == 0) {
				escritura = new ObjectOutputStream(new FileOutputStream(archivoPartidas));
			}else {
				escritura = new LecturaObjeto(new FileOutputStream(archivoPartidas, true));
			}
			escritura.writeObject(partida);
			escritura.close();
			
		} catch(Exception e) {}
	}
	
	public ArrayList <PartidaDTO> lecturaPartida() {
		ArrayList <PartidaDTO> lista = new ArrayList <PartidaDTO> ();
		FileInputStream flujo;
		ObjectInputStream lectura;
		PartidaDTO partida;
		try {
			flujo = new FileInputStream(archivoPartidas);
			lectura = new ObjectInputStream(flujo);			
			try {
				while(true) {
					partida = (PartidaDTO) lectura.readObject();
					lista.add(partida);
				}
			} catch(EOFException fin) {}
			
		} catch(Exception e) {}
		return lista;
	}
	
	
	
	
	public class LecturaObjeto extends ObjectOutputStream{

		public LecturaObjeto(OutputStream out) throws IOException{
			super(out);
		}
		
		public LecturaObjeto() throws IOException, SecurityException {
			super();
		}
		
		@Override
		protected void writeStreamHeader() throws IOException{}

	}

    
    
    

}