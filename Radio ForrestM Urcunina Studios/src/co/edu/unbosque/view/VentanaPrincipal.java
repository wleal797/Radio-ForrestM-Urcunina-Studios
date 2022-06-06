package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	public PanelBotones panelbotones;

	public VentanaPrincipal() {
		setTitle("BosqueFM");
		setSize(450, 340);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.LIGHT_GRAY);

		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	private void inicializarComponentes() {
		
		panelbotones = new PanelBotones();
		getContentPane().add(panelbotones, BorderLayout.CENTER);

		
	}

	public PanelBotones getPanelbotones() {
		return panelbotones;
	}

	public void setPanelbotones(PanelBotones panelbotones) {
		this.panelbotones = panelbotones;
	}

}
