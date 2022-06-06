package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelReproductor extends JPanel {

	private static final long serialVersionUID = 1L;
	JButton agregarCanciones;
	JButton reproducir;
	JButton menu;
	JButton agregar;
	ImageIcon imagen;
	Icon icono;

	public PanelReproductor() {
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		setVisible(true);
		inicializarComponentes();

	}

	private void inicializarComponentes() {
		setBackground(Color.DARK_GRAY);

		JLabel image = new JLabel();
		ImageIcon icon = new ImageIcon("./Imagenes/FondoReproductor.jpg");
		image.setBounds(0, 0, 400, 600);
		image.setIcon(new ImageIcon(icon.getImage().getScaledInstance(334, 620, Image.SCALE_DEFAULT)));
	

		menu = new JButton();
		menu .setBounds(1, 1, 45, 45);
		imagen = new ImageIcon("./Imagenes/Menu.png");
		icono = new ImageIcon(imagen.getImage().getScaledInstance(80, 65, 40));
		menu.setIcon(icono);
		menu.setText("    ");
		menu .setActionCommand("MENU");
			add(menu );
			
			reproducir = new JButton();
			reproducir.setBounds(132, 100, 75, 75);
			imagen = new ImageIcon("./Imagenes/play.png");
			icono = new ImageIcon(imagen.getImage().getScaledInstance(270, 270, Image.SCALE_DEFAULT));
			reproducir.setIcon(icono);
			reproducir.setText("    ");
			reproducir.setActionCommand("REPRODUCIR");
				add(reproducir);

				agregar = new JButton();
				agregar.setBounds(95, 420, 150, 30);
				getAgregar().setBackground(new Color(0, 0, 0));
				agregar.setText("Agregar Canciones");
				agregar.setForeground(Color.WHITE);
				agregar.setActionCommand("AGREGAR");
					add(agregar);
					
					add(image);

	}

	public JButton getAgregarCanciones() {
		return agregarCanciones;
	}

	public void setAgregarCanciones(JButton agregarCanciones) {
		this.agregarCanciones = agregarCanciones;
	}

	public JButton getReproducir() {
		return reproducir;
	}

	public void setReproducir(JButton reproducir) {
		this.reproducir = reproducir;
	}


	public JButton getMenu() {
		return menu;
	}

	public void setMenu(JButton menu) {
		this.menu = menu;
	}

	public JButton getAgregar() {
		return agregar;
	}

	public void setAgregar(JButton agregar) {
		this.agregar = agregar;
	}

}
