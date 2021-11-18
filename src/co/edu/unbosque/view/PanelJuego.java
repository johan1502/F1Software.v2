package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PanelJuego extends JPanel{

	private JLabel lblTitulo ;
	private JLabel lblVacio ;
	
	private JLabel lblNombre ;
	private JTextField txtNombre;
	private JLabel lblTipo ;
	private JTextField txtTipo;
	
	private JButton btnLeerJuego;
	private JButton btnEscribirJuego;
	
	public PanelJuego () {
		setLayout(new GridLayout(4,2));
		
		lblTitulo = new JLabel(" Juego  ");
		lblVacio = new JLabel("   ");
		
		lblNombre = new JLabel("   Nombre juego:  ");
		txtNombre = new JTextField();
		
		lblTipo = new JLabel("   Tipo juego:  ");
		txtTipo = new JTextField();
	
		btnLeerJuego = new JButton();
		btnLeerJuego.setText(" Leer ");
		btnLeerJuego.setActionCommand("LEERJUEGO");	
		
		btnEscribirJuego = new JButton();
		btnEscribirJuego.setText(" Escribir ");
		btnEscribirJuego.setActionCommand("ESCRIBIRJUEGO");	
		
		txtNombre.setActionCommand("txtNombreJuego");
		txtTipo.setActionCommand("txtTipoJuego");
		
		
		add(lblTitulo);
		add(lblVacio);
		
		add(lblNombre);
		add(txtNombre);
		
		add(lblTipo);
		add(txtTipo);
		
		add(btnLeerJuego);
		add(btnEscribirJuego);
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtTipo() {
		return txtTipo;
	}

	public void setTxtTipo(JTextField txtTipo) {
		this.txtTipo = txtTipo;
	}

	public JButton getBtnLeerJuego() {
		return btnLeerJuego;
	}

	public void setBtnLeerJuego(JButton btnLeerJuego) {
		this.btnLeerJuego = btnLeerJuego;
	}

	public JButton getBtnEscribirJuego() {
		return btnEscribirJuego;
	}

	public void setBtnEscribirJuego(JButton btnEscribirJuego) {
		this.btnEscribirJuego = btnEscribirJuego;
	}

	
	
	
	
}
