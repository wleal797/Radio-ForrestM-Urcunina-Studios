package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class PantallaReproductor extends JFrame {

	private static final long serialVersionUID = 1L;

	PanelReproductor panelr;

	
	public PantallaReproductor() {
		
		setBounds(500, 60, 350, 580);
		setTitle("BosqueFM");
		setVisible(false);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.DARK_GRAY);
		getContentPane().setLayout(new BorderLayout(2, 2));

		inicializarComponentes();
	}

	private void inicializarComponentes() {

		panelr = new PanelReproductor();
		getContentPane().add(panelr, BorderLayout.CENTER);

	}

	public PanelReproductor getPanelr() {
		return panelr;
	}

	public void setPanelr(PanelReproductor panelr) {
		this.panelr = panelr;
	}

}
