package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelBotones extends JPanel {

	private static final long serialVersionUID = 1L;
	JButton abrirReproductor;
	JButton agregarCanciones;

	public PanelBotones() {
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		setVisible(true);
		inicializarComponentes();

	}

	private void inicializarComponentes() {

		JLabel imagen = new JLabel();
		ImageIcon icon = new ImageIcon("./Imagenes/FondoPrincipal.jpg");
		imagen.setBounds(0, 0, 450, 300);
		imagen.setIcon(new ImageIcon(icon.getImage().getScaledInstance(450, 300, Image.SCALE_DEFAULT)));

		abrirReproductor = new JButton();
		abrirReproductor.setBounds(50, 200, 145, 30);
		getAbrirReproductor().setBackground(new Color(0, 0, 0));
		abrirReproductor.setText("Abrir Reproductor");
		abrirReproductor.setForeground(Color.WHITE);
		abrirReproductor.setActionCommand("ABRIR");
		add(abrirReproductor);

		agregarCanciones = new JButton();
		agregarCanciones.setBounds(250, 200, 145, 30);
		getAgregarCanciones().setBackground(new Color(0, 0, 0));
		agregarCanciones.setText("Agregar Canciones");
		agregarCanciones.setForeground(Color.WHITE);
		agregarCanciones.setActionCommand("AGREGAR");
		add(agregarCanciones);

		add(imagen);
	}

	public JButton getAbrirReproductor() {
		return abrirReproductor;
	}

	public void setAbrirReproductor(JButton abrirReproductor) {
		this.abrirReproductor = abrirReproductor;
	}

	public JButton getAgregarCanciones() {
		return agregarCanciones;
	}

	public void setAgregarCanciones(JButton agregarCanciones) {
		this.agregarCanciones = agregarCanciones;
	}

}
