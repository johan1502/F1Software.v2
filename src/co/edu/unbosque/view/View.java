package co.edu.unbosque.view;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import co.edu.unbosque.controller.Controller;

public class View extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private PanelJuego pj;
	private PanelJugador pjr;
	private PanelPartida pp;
	private JLabel lblTorneo;
	
	public View(Controller control) {
		
		setSize(500,400);
		setResizable(false);
		setTitle("Sistema de informacion de juegos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		pj = new PanelJuego();
		pjr = new PanelJugador();
		pp  = new PanelPartida();
		lblTorneo = new JLabel("  TORNEO proximamente ");
		
		setLayout(new GridLayout(2,2));
		
		
		add(pjr);
		add(pj);
		add(pp);
		add(lblTorneo);
		
		
		setVisible(true);
	}
	
	
	public PanelJuego getPj() {
		return pj;
	}

	public void setPj(PanelJuego pj) {
		this.pj = pj;
	}

	public PanelJugador getPjr() {
		return pjr;
	}

	public void setPjr(PanelJugador pjr) {
		this.pjr = pjr;
	}

	public PanelPartida getPp() {
		return pp;
	}

	public void setPp(PanelPartida pp) {
		this.pp = pp;
	}
	
	
}
