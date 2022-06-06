package co.edu.unbosque.view;

import java.awt.Color;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelCanciones extends JPanel {

	private static final long serialVersionUID = 1L;

	JButton agregar;
	JButton borrar;
	JButton editar;
	JButton mostrar;
	JButton menu;
	JButton reproductor;

	JComboBox<String> cancionesBox;

	JTextArea campo1;

	ImageIcon imagen;
	Icon icono;

	public PanelCanciones() {

		setBackground(Color.DARK_GRAY);
		setLayout(null);
		setVisible(true);
		inicializarComponentes();

	}

	private void inicializarComponentes() {
		setBackground(Color.DARK_GRAY);

		JLabel image = new JLabel();
		ImageIcon icon = new ImageIcon("./Imagenes/FondoParrilla.jpg");
		image.setBounds(0, 0, 800, 500);
		image.setIcon(new ImageIcon(icon.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT)));

		cancionesBox = new JComboBox<String>();
		cancionesBox.setBackground(Color.gray);
		cancionesBox.setBounds(50, 100, 500, 25);
		add(cancionesBox);
		cancionesBox.addItem("Aerosmith - Amazing");
		cancionesBox.addItem("Bon Jovi - Always");
		cancionesBox.addItem("Eddie Van Halen - Eruption");
		cancionesBox.addItem("Skrillex - First Of The Year (Equinox)");
		cancionesBox.addItem("Guns N' Roses - Welcome To The Jungle");
		cancionesBox.addItem("Kiss - I Was Made For Loving You");
		cancionesBox.addItem("Danny Ocean - Me Rehuso");
		cancionesBox.addItem("Queen - 'We Will Rock You'");
		cancionesBox.addItem("Slayer - Black Magic");
		cancionesBox.addItem("50 Cent - No Romeo No Juliet ft. Chris Brown");
		cancionesBox.addItem("Twenty One Pilots - Air Catcher");
		cancionesBox.addItem("All Time Low - A Love Like A War ft. Vic Fuentes");
		cancionesBox.addItem("Arctic Monkeys - Love Is A Laserquest");
		cancionesBox.addItem("Valentino - Besame ft. MTZ Manuel Turizo");
		cancionesBox.addItem("Piso 21 - Besandote");
		cancionesBox.addItem("Cali Y El Dandee - La Estrategia");
		cancionesBox.addItem("Carlos Vives, Sebastian Yatra - Robarte Un Beso");
		cancionesBox.addItem("Abraham Mateo - Loco Enamorado ft Farruko, Christian Daniel");
		cancionesBox.addItem("Ozuna - Dile Que Tu Me Quieres");
		cancionesBox.addItem("Passenger - Let Her Go");

		campo1 = new JTextArea("1");
		campo1.setBackground(Color.gray);
		campo1.setBounds(420, 100, 50, 25);
		add(campo1);

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		menu = new JButton();
		menu.setBounds(1, 1, 45, 45);
		imagen = new ImageIcon("./Imagenes/MenuParrilla.png");
		icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 50, 40));
		menu.setIcon(icono);
		menu.setActionCommand("MENU");
		add(menu);

		agregar = new JButton("Agregar");
		agregar.setBounds(50, 400, 140, 30);
		getAgregar().setBackground(Color.DARK_GRAY);
		agregar.setActionCommand("AGREGARCANCIONES");
		agregar.setForeground(Color.white);
		add(agregar);

		borrar = new JButton("Borrar");
		borrar.setBounds(220, 400, 140, 30);
		getBorrar().setBackground(Color.DARK_GRAY);
		borrar.setActionCommand("BORRARCANCIONES");
		borrar.setForeground(Color.white);
		add(borrar);

		editar = new JButton("Editar");
		editar.setBounds(420, 400, 140, 30);
		getEditar().setBackground(Color.DARK_GRAY);
		editar.setActionCommand("EDITARCANCIONES");
		editar.setForeground(Color.white);
		add(editar);

		mostrar = new JButton("Mostrar");
		mostrar.setBounds(590, 400, 140, 30);
		getMostrar().setBackground(Color.DARK_GRAY);
		mostrar.setActionCommand("MOSTRARCANCIONES");
		mostrar.setForeground(Color.white);
		add(mostrar);

		reproductor = new JButton("REPRODUCTOR");
		reproductor.setBounds(600, 96, 140, 30);
		reproductor.setActionCommand("ABRIR");
		add(reproductor);

		add(image);
	}

	public JButton getAgregar() {
		return agregar;
	}

	public void setAgregar(JButton agregar) {
		this.agregar = agregar;
	}

	public JButton getBorrar() {
		return borrar;
	}

	public void setBorrar(JButton borrar) {
		this.borrar = borrar;
	}

	public JButton getEditar() {
		return editar;
	}

	public void setEditar(JButton editar) {
		this.editar = editar;
	}

	public JButton getMostrar() {
		return mostrar;
	}

	public void setMostrar(JButton mostrar) {
		this.mostrar = mostrar;
	}

	public JButton getMenu() {
		return menu;
	}

	public void setMenu(JButton menu) {
		this.menu = menu;
	}

	public JButton getReproductor() {
		return reproductor;
	}

	public void setReproductor(JButton reproductor) {
		this.reproductor = reproductor;
	}

	public JTextArea getCampo1() {
		return campo1;
	}

	public void setCampo1(JTextArea campo1) {
		this.campo1 = campo1;
	}

	public JComboBox<String> getCancionesBox() {
		return cancionesBox;
	}

	public void setCancionesBox(JComboBox<String> cancionesBox) {
		this.cancionesBox = cancionesBox;
	}

}
