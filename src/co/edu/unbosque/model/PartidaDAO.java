package co.edu.unbosque.model;
import java.util.ArrayList;

import co.edu.unbosque.model.persistence.BinariosFile;

public class PartidaDAO {

	private BinariosFile binario;
	private ArrayList <PartidaDTO> lista;
	
	public PartidaDAO () {
		binario = new BinariosFile();
		lista = new ArrayList <PartidaDTO> ();
	}
	
	public String mostrarPartidaJugadas() {
		lista = binario.lecturaPartida();
		String contenido = "";
		int contador = 0;
		for(int i = 0; i < lista.size(); i++) {
			contenido += lista.get(i).toString() + "\n\n";
			contador++;
			if(contador == 2) {
				contenido += "\n--------------------\n";
				contador = 0;
			}
		}
		if(contenido.length() != 0) {
			return contenido;
		}else {
			return null;
		}
	}
	
	public void agregarPartida(PartidaDTO partida) {
		binario.escrituraPartida(partida);
	}
	
	
	
	
}

