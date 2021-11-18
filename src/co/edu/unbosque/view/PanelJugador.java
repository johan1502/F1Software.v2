package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelJugador extends JPanel{

	private JLabel lblNombre ;
	private JTextField txtNombre;
	private JLabel lblEdad ;
	private JTextField txtEdad;
	private JLabel lblGenero ;
	private JTextField txtGenero;
	private JLabel lblPuntaje ;
	private JTextField txtPuntaje;
	private JLabel lblTitulo ;
	private JLabel lblVacio ;
	private JLabel lblID;
	private JTextField txtID;

	private JButton botonJugadores;
	private JButton btnEscribirJugador1;

	private JButton botonBuscarJugador;
	private JButton btnEscribirJugador2;
	
	public PanelJugador () {
		setLayout(new GridLayout(8,2));

		lblTitulo = new JLabel(" Jugador  ");
		lblVacio = new JLabel("   ");

		lblNombre = new JLabel(" Nombre :  ");
		txtNombre = new JTextField();

		lblEdad = new JLabel(" Edad :  ");
		txtEdad = new JTextField();

		lblGenero = new JLabel(" Genero :  ");
		txtGenero = new JTextField();

		lblPuntaje = new JLabel(" Puntaje :  ");
		txtPuntaje = new JTextField();
		
		lblID = new JLabel("Documento: ");
		txtID = new JTextField();

		botonJugadores = new JButton();
		botonJugadores.setText("leer Jugadores");
		botonJugadores.setActionCommand("listaJugadores");	

		btnEscribirJugador1 = new JButton();
		btnEscribirJugador1.setText(" Escribir J1 ");
		btnEscribirJugador1.setActionCommand("ESCRIBIRJ1");	
		
		botonBuscarJugador = new JButton();
		botonBuscarJugador.setText("Buscar Jugador");
		botonBuscarJugador.setActionCommand("BuscarJugador");	

		btnEscribirJugador2 = new JButton();
		btnEscribirJugador2.setText(" Escribir J2 ");
		btnEscribirJugador2.setActionCommand("ESCRIBIRJ2");	
		

		txtEdad.setActionCommand("txtEdadJugador");
		txtGenero.setActionCommand("txtGeneroJugador");
		txtNombre.setActionCommand("txtNombreJugador");
		txtPuntaje.setActionCommand("txtPuntajeJugador");


		add(lblTitulo);
		add(lblVacio);

		add(lblNombre);
		add(txtNombre);

		add(lblEdad);
		add(txtEdad);

		add(lblGenero);
		add(txtGenero);

		add(lblID);
		add(txtID);
		
		
		add(lblPuntaje);
		add(txtPuntaje);

		add(botonJugadores);
		add(btnEscribirJugador1);
		
		add(botonBuscarJugador);
		add(btnEscribirJugador2);
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtEdad() {
		return txtEdad;
	}

	public void setTxtEdad(JTextField txtEdad) {
		this.txtEdad = txtEdad;
	}

	public JTextField getTxtGenero() {
		return txtGenero;
	}

	public void setTxtGenero(JTextField txtGenero) {
		this.txtGenero = txtGenero;
	}

	public JTextField getTxtPuntaje() {
		return txtPuntaje;
	}

	public void setTxtPuntaje(JTextField txtPuntaje) {
		this.txtPuntaje = txtPuntaje;
	}

	public JButton getBtnLeerJugador1() {
		return botonJugadores;
	}

	public void setBtnLeerJugador1(JButton btnLeerJugador1) {
		this.botonJugadores = btnLeerJugador1;
	}

	public JButton getBtnEscribirJugador1() {
		return btnEscribirJugador1;
	}

	public void setBtnEscribirJugador1(JButton btnEscribirJugador1) {
		this.btnEscribirJugador1 = btnEscribirJugador1;
	}

	public JButton getBtnLeerJugador2() {
		return botonBuscarJugador;
	}

	public void setBtnLeerJugador2(JButton btnLeerJugador2) {
		this.botonBuscarJugador = btnLeerJugador2;
	}

	public JButton getBtnEscribirJugador2() {
		return btnEscribirJugador2;
	}

	public void setBtnEscribirJugador2(JButton btnEscribirJugador2) {
		this.btnEscribirJugador2 = btnEscribirJugador2;
	}

	public JTextField getTxtID() {
		return txtID;
	}

	public void setTxtID(JTextField txtID) {
		this.txtID = txtID;
	}
}