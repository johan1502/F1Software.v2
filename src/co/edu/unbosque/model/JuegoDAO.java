package co.edu.unbosque.model;
import java.util.ArrayList;
import co.edu.unbosque.model.persistence.BinariosFile;

public class JuegoDAO {

	private ArrayList <JuegoDTO> lista;
	private BinariosFile binario;
	
	public JuegoDAO() {
		lista = new ArrayList <JuegoDTO> ();
		binario = new BinariosFile();
	}
	
	public String mostrarJuegoRegistrados() {
		lista = binario.lecturaJuego();
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
	
	
	
}
