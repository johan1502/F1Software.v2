package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.JuegoDAO;
import co.edu.unbosque.model.JuegoDTO;
import co.edu.unbosque.model.JugadorDAO;
import co.edu.unbosque.model.JugadorDTO;
import co.edu.unbosque.model.PartidaDAO;
import co.edu.unbosque.model.PartidaDTO;
import co.edu.unbosque.model.persistence.BinariosFile;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private View gui;
	private BinariosFile bin;
	private JugadorDAO jugadordao;
	private PartidaDAO partidadao;
	private JuegoDAO juegodao;
	
	public Controller() {
		jugadordao = new JugadorDAO();
		partidadao = new PartidaDAO();
		juegodao = new JuegoDAO();
		gui = new View(null);	
		bin = new BinariosFile();
		asignarOyentes();		
	}

	public void asignarOyentes() {
		gui.getPj().getBtnLeerJuego().addActionListener(this);
		gui.getPj().getBtnEscribirJuego().addActionListener(this);
		
		gui.getPjr().getBtnLeerJugador1().addActionListener(this);
		gui.getPjr().getBtnEscribirJugador1().addActionListener(this);
		
		gui.getPjr().getBtnLeerJugador2().addActionListener(this);
		gui.getPjr().getBtnEscribirJugador2().addActionListener(this);
		
		gui.getPp().getBtnLeerPartida().addActionListener(this);
		gui.getPp().getBtnEscribirPartida().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		try {
			if(comando.equals("ESCRIBIRJ1")) {
				String opcion = "Jugador 1.";
				String nombre = gui.getPjr().getTxtNombre().getText();
				String edad = gui.getPjr().getTxtEdad().getText();
				String genero = gui.getPjr().getTxtGenero().getText();
				String puntuacion = gui.getPjr().getTxtPuntaje().getText();
				String id = gui.getPjr().getTxtID().getText();
				if(nombre.length() > 0 && edad.length() > 0 && edad.length() > 0 && genero.length() > 0 && puntuacion.length() > 0 && id.length() > 0) {
					bin.escrituraJugador(new JugadorDTO(opcion, nombre, Integer.parseInt(edad), genero, Integer.parseInt(id), Integer.parseInt(puntuacion)));
					JOptionPane.showMessageDialog(null, "El jugador se ha registrado correctamente");
				}else {
					JOptionPane.showMessageDialog(null, "No se logro registrar la partida, debido a que no se ha llenado todos los espacios.");
				}
				limpiarEspacios();
				
			}else if(comando.equals("ESCRIBIRJ2")) {
				String opcion = "Jugador 2.";
				String nombre = gui.getPjr().getTxtNombre().getText();
				String edad = gui.getPjr().getTxtEdad().getText();
				String genero = gui.getPjr().getTxtGenero().getText();
				String puntuacion = gui.getPjr().getTxtPuntaje().getText();
				String id = gui.getPjr().getTxtID().getText();
				bin.escrituraJugador(new JugadorDTO(opcion, nombre, Integer.parseInt(edad), genero, Integer.parseInt(id), Integer.parseInt(puntuacion)));
				JOptionPane.showMessageDialog(null, "El jugador se ha registrado correctamente");
				limpiarEspacios();
				
			}else if(comando.equals("listaJugadores")) {
				String contenido = jugadordao.mostrarJugadores();
				if(contenido != null) {
					System.out.println("LISTA DE JUGADORES\n-----------------------\n" + jugadordao.mostrarJugadores());
				}else {
					System.out.println("No se han registrado jugadores, lo siento.");
				}
				
			}else if(comando.equals("BuscarJugador")) {
				if(gui.getPjr().getTxtID().getText().length() > 0) {
					int documento = Integer.parseInt(gui.getPjr().getTxtNombre().getText());
					String buscar = jugadordao.buscarJugador(documento);
					if(buscar != null) {
						System.out.println("El jugador buscado es:\n" + jugadordao.buscarJugador(documento));
					}else {
						System.out.println("EL nombre ingresado no se encuentra.");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Para buscar un jugador debes ingresar su documento.");
				}
				
			}else if(comando.equals("ESCRIBIRPARTIDA")) {
				String tipo = gui.getPp().getTxtTipoPartida().getText();
				String jugador1 = gui.getPp().getTxtJugador1().getText();
				String puntaje1 = gui.getPp().getTxtPuntaje1().getText();
				String jugador2 = gui.getPp().getTxtJugador2().getText();
				String puntaje2 = gui.getPp().getTxtPuntaje1().getText();
				if(tipo.length() > 0 && jugador1.length() > 0 && jugador2.length() > 0 && puntaje1.length() > 0 && puntaje2.length() > 0){
					bin.escrituraPartida(new PartidaDTO(tipo, jugador1, jugador2, Double.parseDouble(puntaje1), Double.parseDouble(puntaje2)));
					JOptionPane.showMessageDialog(null, "El registro de la partida se ha guardado correctamente");
					gui.getPp().getTxtJugador1().setText("");
					gui.getPp().getTxtPuntaje1().setText("");
					gui.getPp().getTxtJugador2().setText("");
					gui.getPp().getTxtPuntaje1().setText("");
					
				}else {
					JOptionPane.showMessageDialog(null, "No se logro registrar la partida, debido a que no se ha llenado todos los espacios.");
				}
				
			}else if(comando.equals("LEERPARTIDA")) {
				String contenido = partidadao.mostrarPartidaJugadas();
				if(contenido != null) {
					System.out.println("LAS PARTIDAS REGISTRADAS SON:\n---------------------------\n" + contenido);	
				}else {
					System.out.println("No se han registrado partidas :(");
				}
				
			}else if(comando.equals("ESCRIBIRJUEGO")) {
				String nombre = gui.getPj().getTxtNombre().getText();
				String tipo = gui.getPj().getTxtTipo().getText();
				if(nombre.length() > 0 && tipo.length() > 0) {
					bin.escrituraJuego(new JuegoDTO(nombre, tipo));
					JOptionPane.showMessageDialog(null, "El juego se ha guardado correctamente.");
					gui.getPj().getTxtNombre().setText("");
					gui.getPj().getTxtTipo().setText("");
				}else {
					JOptionPane.showMessageDialog(null, "No se logro registrar la partida, debido a que no se ha llenado todos los espacios.");
				}
				
			}else if(comando.equals("LEERJUEGO")) {
				String contenido = juegodao.mostrarJuegoRegistrados();
				if(contenido != null) {
					System.out.println("LOS JUEGOS REGISTRADOS SON:\n-------------------------\n" + contenido);
				}else {
					System.out.println("No se han registrado juegos :(");
				}
				
			}
		} catch(NumberFormatException a) {
			JOptionPane.showMessageDialog(null, "No debes ingresar letras en los campos numericos, gracias.");
		}	
	}	
	
	private void limpiarEspacios() {
		gui.getPjr().getTxtNombre().setText("");
		gui.getPjr().getTxtEdad().setText("");
		gui.getPjr().getTxtGenero().setText("");
		gui.getPjr().getTxtID().setText("");
		gui.getPjr().getTxtPuntaje().setText("");
	}
	
	
	
}