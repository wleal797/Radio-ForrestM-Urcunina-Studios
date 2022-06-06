package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class AggCanciones extends JFrame {

	private static final long serialVersionUID = 1L;

	PanelCanciones panelc;

	public AggCanciones() {
		setTitle("BosqueFM");
		setVisible(false);
		setSize(800, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.DARK_GRAY);
		getContentPane().setLayout(new BorderLayout(2, 2));

		inicializarComponentes();
		setLocationRelativeTo(null);

	}

	private void inicializarComponentes() {

		panelc = new PanelCanciones();
		getContentPane().add(panelc, BorderLayout.CENTER);

	}

	public PanelCanciones getPanelc() {
		return panelc;
	}

	public void setPanelc(PanelCanciones panelc) {
		this.panelc = panelc;
	}
	
}
