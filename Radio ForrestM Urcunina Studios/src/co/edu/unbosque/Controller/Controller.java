package co.edu.unbosque.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.view.*;


public class Controller implements ActionListener {

	VentanaPrincipal ventana = new VentanaPrincipal();
	PantallaReproductor reproductor = new PantallaReproductor();
	AggCanciones agregar = new AggCanciones();
	Fachada fachada = new Fachada();
	boolean sonido = true;
	int numeroCanciones = 0;

	ArrayList<Integer> listaCanciones2 = new ArrayList<Integer>();
	int cancionSeleccionada = 0;

	public Controller() {
		ventana.setVisible(true);
		reproductor.setVisible(false);
		agregar.setVisible(false);
		asignarOyentes();

	}

	private void asignarOyentes() {
		ventana.getPanelbotones().getAbrirReproductor().addActionListener(this);
		ventana.getPanelbotones().getAgregarCanciones().addActionListener(this);

		reproductor.getPanelr().getReproducir().addActionListener(this);
		reproductor.getPanelr().getMenu().addActionListener(this);
		reproductor.getPanelr().getAgregar().addActionListener(this);

		agregar.getPanelc().getMenu().addActionListener(this);
		agregar.getPanelc().getBorrar().addActionListener(this);
		agregar.getPanelc().getMostrar().addActionListener(this);
		agregar.getPanelc().getEditar().addActionListener(this);
		agregar.getPanelc().getAgregar().addActionListener(this);
		agregar.getPanelc().getReproductor().addActionListener(this);

		agregar.getPanelc().getCancionesBox().addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();

		if (comando.equals("ABRIR")) {
			ventana.setVisible(false);
			agregar.setVisible(false);
			reproductor.setVisible(true);

		}

		if (comando.equals("AGREGAR")) {
			ventana.setVisible(false);
			reproductor.setVisible(false);
			agregar.setVisible(true);

		}
		if (comando.equals("MENU")) {
			ventana.setVisible(true);
			agregar.setVisible(false);
			reproductor.setVisible(false);

		}

		if (comando.equals("REPRODUCIR")) {

			JOptionPane.showMessageDialog(null,
					fachada.getRegistroCancionesDAO().getCancione()[listaCanciones2.get(0)]);
			fachada.getRegistroCancionesDAO().reproducirCancion(listaCanciones2.get(0));
			JOptionPane.showMessageDialog(null,
					fachada.getRegistroCancionesDAO().getCancione()[listaCanciones2.get(1)]);
			fachada.getRegistroCancionesDAO().reproducirCancion(listaCanciones2.get(1));
			JOptionPane.showMessageDialog(null,
					fachada.getRegistroCancionesDAO().getCancione()[listaCanciones2.get(2)]);
			fachada.getRegistroCancionesDAO().reproducirCancion(listaCanciones2.get(2));
			JOptionPane.showMessageDialog(null,
					fachada.getRegistroCancionesDAO().getCancione()[listaCanciones2.get(3)]);
			fachada.getRegistroCancionesDAO().reproducirCancion(listaCanciones2.get(3));
			JOptionPane.showMessageDialog(null,
					fachada.getRegistroCancionesDAO().getCancione()[listaCanciones2.get(4)]);
			fachada.getRegistroCancionesDAO().reproducirCancion(listaCanciones2.get(4));
			JOptionPane.showMessageDialog(null,
					fachada.getRegistroCancionesDAO().getCancione()[listaCanciones2.get(5)]);
			fachada.getRegistroCancionesDAO().reproducirCancion(listaCanciones2.get(5));
			JOptionPane.showMessageDialog(null,
					fachada.getRegistroCancionesDAO().getCancione()[listaCanciones2.get(6)]);
			fachada.getRegistroCancionesDAO().reproducirCancion(listaCanciones2.get(6));
			JOptionPane.showMessageDialog(null,
					fachada.getRegistroCancionesDAO().getCancione()[listaCanciones2.get(7)]);
			fachada.getRegistroCancionesDAO().reproducirCancion(listaCanciones2.get(7));
			JOptionPane.showMessageDialog(null,
					fachada.getRegistroCancionesDAO().getCancione()[listaCanciones2.get(8)]);
			fachada.getRegistroCancionesDAO().reproducirCancion(listaCanciones2.get(8));
			JOptionPane.showMessageDialog(null,
					fachada.getRegistroCancionesDAO().getCancione()[listaCanciones2.get(9)]);
			fachada.getRegistroCancionesDAO().reproducirCancion(listaCanciones2.get(9));
			JOptionPane.showMessageDialog(null,
					fachada.getRegistroCancionesDAO().getCancione()[listaCanciones2.get(10)]);
			fachada.getRegistroCancionesDAO().reproducirCancion(listaCanciones2.get(10));
			JOptionPane.showMessageDialog(null,
					fachada.getRegistroCancionesDAO().getCancione()[listaCanciones2.get(11)]);
			fachada.getRegistroCancionesDAO().reproducirCancion(listaCanciones2.get(11));
			JOptionPane.showMessageDialog(null,
					fachada.getRegistroCancionesDAO().getCancione()[listaCanciones2.get(12)]);
			fachada.getRegistroCancionesDAO().reproducirCancion(listaCanciones2.get(12));
			JOptionPane.showMessageDialog(null,
					fachada.getRegistroCancionesDAO().getCancione()[listaCanciones2.get(13)]);
			fachada.getRegistroCancionesDAO().reproducirCancion(listaCanciones2.get(13));
			JOptionPane.showMessageDialog(null,
					fachada.getRegistroCancionesDAO().getCancione()[listaCanciones2.get(14)]);
			fachada.getRegistroCancionesDAO().reproducirCancion(listaCanciones2.get(14));
			JOptionPane.showMessageDialog(null,
					fachada.getRegistroCancionesDAO().getCancione()[listaCanciones2.get(15)]);
			fachada.getRegistroCancionesDAO().reproducirCancion(listaCanciones2.get(15));
			JOptionPane.showMessageDialog(null,
					fachada.getRegistroCancionesDAO().getCancione()[listaCanciones2.get(16)]);
			fachada.getRegistroCancionesDAO().reproducirCancion(listaCanciones2.get(16));
			JOptionPane.showMessageDialog(null,
					fachada.getRegistroCancionesDAO().getCancione()[listaCanciones2.get(17)]);
			fachada.getRegistroCancionesDAO().reproducirCancion(listaCanciones2.get(17));
			JOptionPane.showMessageDialog(null,
					fachada.getRegistroCancionesDAO().getCancione()[listaCanciones2.get(18)]);
			fachada.getRegistroCancionesDAO().reproducirCancion(listaCanciones2.get(18));
			JOptionPane.showMessageDialog(null,
					fachada.getRegistroCancionesDAO().getCancione()[listaCanciones2.get(19)]);
			fachada.getRegistroCancionesDAO().reproducirCancion(listaCanciones2.get(19));
		}
		///////////////////////////////////////////////////////////////////// 7
		if (comando.equals("AGREGARCANCIONES")) {

			cancionSeleccionada = agregar.getPanelc().getCancionesBox().getSelectedIndex();
			fachada.getRegistroCancionesDAO().escribirOrdenCancionesDTO(cancionSeleccionada);
			listaCanciones2.add(cancionSeleccionada);
			System.out.println("GUARDADO");

		}
/////////////////////////////////////////////////////////////////////////////////
		if (comando.equals("MOSTRARCANCIONES")) {
			int i = 0;
			String x = "";
			x += (String) agregar.getPanelc().getCancionesBox().getSelectedItem();
			System.out.println(fachada.getRegistroCancionesDAO().leerRegistroCancionesDTO());

			JOptionPane.showMessageDialog(null, fachada.getRegistroCancionesDAO().leerRegistroCancionesDTO());

			JOptionPane.showMessageDialog(null, x);
		}

		if (comando.equals("BORRARCANCIONES")) {
			cancionSeleccionada = agregar.getPanelc().getCancionesBox().getSelectedIndex();
			fachada.getRegistroCancionesDAO().borrarRegistroCanciones(cancionSeleccionada);
			listaCanciones2.remove(cancionSeleccionada);

		}

		if (comando.equals("EDITARCANCIONES")) {
			String edit = JOptionPane.showInputDialog("Digite la posición que desea editar entre 1 y 20");
			int editar = Integer.parseInt(edit) + 1;

			cancionSeleccionada = agregar.getPanelc().getCancionesBox().getSelectedIndex();
			fachada.getRegistroCancionesDAO().EditarRegistroCanciones(cancionSeleccionada);
		}

	}

	public int getCancionSeleccionada() {
		return cancionSeleccionada;
	}

	public void setCancionSeleccionada(int cancionSeleccionada) {
		this.cancionSeleccionada = cancionSeleccionada;
	}

}
