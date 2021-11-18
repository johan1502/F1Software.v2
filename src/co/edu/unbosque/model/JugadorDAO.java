package co.edu.unbosque.model;
import java.util.ArrayList;
import co.edu.unbosque.model.persistence.BinariosFile;

public class JugadorDAO {

	private ArrayList <JugadorDTO> lista;
	private BinariosFile binario;
	
	public JugadorDAO () {
		binario = new BinariosFile();
		lista = new ArrayList <JugadorDTO> ();
	}
	
	public String mostrarJugadores() {
		lista = binario.lecturaJugador();
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
	
	public void agregarJugador(JugadorDTO jugador) {
		binario.escrituraJugador(jugador);
	}
	
	public String buscarJugador(int documento) {
		lista = binario.lecturaJugador();
		for(int i = 0; i < lista.size(); i++) {
			if(documento == lista.get(i).getDocumento()) {
				return lista.get(i).toString();
			}
		}
		return null;
	}
	
}