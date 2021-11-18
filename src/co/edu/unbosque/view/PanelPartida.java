package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelPartida extends JPanel{

	
	private JLabel lblTitulo ;
	private JLabel lblVacio ;
	private JLabel lblTipoPartida ;
	private JTextField txtTipoPartida;
	private JLabel lblJugador1 ;
	private JTextField txtJugador1;
	private JLabel lblJugador2 ;
	private JTextField txtJugador2;
	private JLabel lblPuntaje1 ;
	private JTextField txtPuntaje1;
	private JLabel lblPuntaje2 ;
	private JTextField txtPuntaje2;
	
	private JButton btnLeerPartida;
	private JButton btnEscribirPartida;
	
	
	public PanelPartida () {
		setLayout(new GridLayout(7,2));
		
		lblTitulo = new JLabel(" Partida  ");
		lblVacio = new JLabel("   ");
		
		lblTipoPartida = new JLabel(" Tipo Partida :  ");
		txtTipoPartida = new JTextField();
		
		lblJugador1 = new JLabel(" Jugador 1 :  ");
		txtJugador1 = new JTextField();
		
		lblJugador2 = new JLabel(" Jugador 2 :  ");
		txtJugador2 = new JTextField();
		
		lblPuntaje1 = new JLabel(" Puntaje 1 :  ");
		txtPuntaje1 = new JTextField();
		
		lblPuntaje2 = new JLabel(" Puntaje 2 :  ");
		txtPuntaje2 = new JTextField();
		
		btnLeerPartida = new JButton();
		btnLeerPartida.setText(" Leer ");
		btnLeerPartida.setActionCommand("LEERPARTIDA");	
		
		btnEscribirPartida = new JButton();
		btnEscribirPartida.setText(" Escribir ");
		btnEscribirPartida.setActionCommand("ESCRIBIRPARTIDA");	
		
		txtJugador1.setActionCommand("txtJugador1Partida");
		txtJugador2.setActionCommand("txtJugador2Partida");
		txtPuntaje1.setActionCommand("txtPuntaje1Partida");
		txtPuntaje2.setActionCommand("txtPuntaje1Partida");
		txtTipoPartida.setActionCommand("txtTipoPartidaPartida");
		
		add(lblTitulo);
		add(lblVacio);
		
		add(lblTipoPartida);
		add(txtTipoPartida);
		
		add(lblJugador1);
		add(txtJugador1);
		
		add(lblPuntaje1);
		add(txtPuntaje1);
		
		add(lblJugador2);
		add(txtJugador2);
		
		add(lblPuntaje2);
		add(txtPuntaje2);
		
		add(btnLeerPartida);
		add(btnEscribirPartida);
	}


	public JTextField getTxtTipoPartida() {
		return txtTipoPartida;
	}


	public void setTxtTipoPartida(JTextField txtTipoPartida) {
		this.txtTipoPartida = txtTipoPartida;
	}


	public JTextField getTxtJugador1() {
		return txtJugador1;
	}


	public void setTxtJugador1(JTextField txtJugador1) {
		this.txtJugador1 = txtJugador1;
	}


	public JTextField getTxtJugador2() {
		return txtJugador2;
	}


	public void setTxtJugador2(JTextField txtJugador2) {
		this.txtJugador2 = txtJugador2;
	}


	public JTextField getTxtPuntaje1() {
		return txtPuntaje1;
	}


	public void setTxtPuntaje1(JTextField txtPuntaje1) {
		this.txtPuntaje1 = txtPuntaje1;
	}


	public JTextField getTxtPuntaje2() {
		return txtPuntaje2;
	}


	public void setTxtPuntaje2(JTextField txtPuntaje2) {
		this.txtPuntaje2 = txtPuntaje2;
	}


	public JButton getBtnLeerPartida() {
		return btnLeerPartida;
	}


	public void setBtnLeerPartida(JButton btnLeerPartida) {
		this.btnLeerPartida = btnLeerPartida;
	}


	public JButton getBtnEscribirPartida() {
		return btnEscribirPartida;
	}


	public void setBtnEscribirPartida(JButton btnEscribirPartida) {
		this.btnEscribirPartida = btnEscribirPartida;
	}


	
	
	
}
