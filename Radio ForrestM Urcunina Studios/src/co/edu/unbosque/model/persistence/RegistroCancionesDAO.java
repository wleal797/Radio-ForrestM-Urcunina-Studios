package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.sound.sampled.Clip;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class RegistroCancionesDAO {
	private String rutaReg = "./data/registro.dat";
	private RegistroCancionesDTO[] cancione = new RegistroCancionesDTO[30];
	private Clip clip;

	String codigos[] = new String[20];
	String Autores[] = new String[20];
	String generos[] = new String[20];
	String canciones[] = new String[20];
	private ArrayList<OrdenCancionesDTO> ordenCancionesDTO;

	public RegistroCancionesDAO() {
		ordenCancionesDTO = new ArrayList<OrdenCancionesDTO>();

		codigos[0] = "./Canciones/Aerosmith_-_Amazing.mp3";
		codigos[1] = "./Canciones/Bon_Jovi_-_Always.mp3";
		codigos[2] = "./Canciones/Eddie Van Halen - Eruption.mp3";
		codigos[3] = "./Canciones/First_Of_The_Year_(Equinox)_-_Skrillex_[OFFICIAL].mp3";
		codigos[4] = "./Canciones/Guns_N'_Roses_-_Welcome_To_The_Jungle.mp3";
		codigos[5] = "./Canciones/Kiss - I was made for loving you.mp3";
		codigos[6] = "./Canciones/Danny Ocean -  Me Rehúso.mp3";
		codigos[7] = "./Canciones/Queen - 'We Will Rock You'.mp3";
		codigos[8] = "./Canciones/Slayer - Black Magic.mp3";
		codigos[9] = "./Canciones/50 Cent - No Romeo No Juliet ft. Chris Brown (Official Music Video).mp3";
		codigos[10] = "./Canciones/Air Catcher - Twenty One Pilots.mp3";
		codigos[11] = "./Canciones/All Time Low - A Love Like War.mp3";
		codigos[12] = "./Canciones/Arctic Monkeys - Love Is A Laserquest.mp3";
		codigos[13] = "./Canciones/Bésame - Valentino Ft  MTZ Manuel Turizo - Video Lyric.mp3";
		codigos[14] = "./Canciones/Besándote-Piso 21.mp3";
		codigos[15] = "./Canciones/Cali Y El Dandee - La Estrategia.mp3";
		codigos[16] = "./Canciones/Carlos Vives, Sebastian Yatra - Robarte un Beso (Official Video).mp3";
		codigos[17] = "./Canciones/Abraham Mateo ft. Farruko, Christian Daniel - Loco Enamorado.mp3";
		codigos[18] = "./Canciones/Ozuna - Dile Que Tu Me Quieres.mp3";
		codigos[19] = "./Canciones/Passenger - Let Her Go.mp3";

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////7
		Autores[0] = "Aerosmith";
		Autores[1] = "Bon Jovi";
		Autores[2] = "ddie Van Halen";
		Autores[3] = "Skrillex";
		Autores[4] = "Guns N' Roses ";
		Autores[5] = "Kiss";
		Autores[6] = "Danny Ocean";
		Autores[7] = "Queen";
		Autores[8] = "Slayer";
		Autores[9] = "50 Cent";
		Autores[10] = "Twenty One Pilots";
		Autores[11] = "All Time Low";
		Autores[12] = "Arctic Monkeys";
		Autores[13] = "Valentino";
		Autores[14] = "Piso 21";
		Autores[15] = "Cali Y El Dandee";
		Autores[16] = "Carlos Vives, Sebastian Yatra";
		Autores[17] = "Abraham Mateo";
		Autores[18] = "Ozuna";
		Autores[19] = "Passenger";

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////7
		generos[0] = "Rock / Alternativo";
		generos[1] = "Rock";
		generos[2] = "Rock / Heavy Metal";
		generos[3] = "Dubstep / Electronica";
		generos[4] = "Rock";
		generos[5] = "Hard Rock / Rock";
		generos[6] = "Urbano / Pop Latino";
		generos[7] = "Rock";
		generos[8] = "Heavy Metal";
		generos[9] = "Hip Hop";
		generos[10] = "Pop / Alternativa";
		generos[11] = "Alternativa / Independiente";
		generos[12] = "Alternativa / Independiente";
		generos[13] = "Urbano / Pop Latino";
		generos[14] = "Urbano / Pop Latino";
		generos[15] = "Urbano / Pop Latino";
		generos[16] = "Vallenato / Pop";
		generos[17] = "Urbano";
		generos[18] = "Urbano";
		generos[19] = "Pop / Folk";

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////7
		canciones[0] = "Amazing";
		canciones[1] = "Always";
		canciones[2] = "Eruption";
		canciones[3] = "First Of The Year (Equinox)";
		canciones[4] = "Welcome To The Jungle";
		canciones[5] = "I Was Made For Loving You I Was Made For Loving You";
		canciones[6] = "Me Rehuso";
		canciones[7] = "We Will Rock You";
		canciones[8] = "Black Magic";
		canciones[9] = "No Romeo No Juliet";
		canciones[10] = "Air Catcher";
		canciones[11] = "A Love Like A War";
		canciones[12] = "Love Is A Laserquest";
		canciones[13] = "Besame";
		canciones[14] = "Besandote";
		canciones[15] = "La Estrategia";
		canciones[16] = "Robarte Un Beso";
		canciones[17] = "Loco Enamorado";
		canciones[18] = "Dile Que Tu Me Quieres";
		canciones[19] = "Let Her Go";
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////7
		cancione[0] = new RegistroCancionesDTO(generos[0], canciones[0], Autores[0], codigos[0]);
		cancione[1] = new RegistroCancionesDTO(generos[1], canciones[1], Autores[1], codigos[1]);
		cancione[2] = new RegistroCancionesDTO(generos[2], canciones[2], Autores[2], codigos[2]);
		cancione[3] = new RegistroCancionesDTO(generos[3], canciones[3], Autores[3], codigos[3]);
		cancione[4] = new RegistroCancionesDTO(generos[4], canciones[4], Autores[4], codigos[4]);
		cancione[5] = new RegistroCancionesDTO(generos[5], canciones[5], Autores[5], codigos[5]);
		cancione[6] = new RegistroCancionesDTO(generos[6], canciones[6], Autores[6], codigos[6]);
		cancione[7] = new RegistroCancionesDTO(generos[7], canciones[7], Autores[7], codigos[7]);
		cancione[8] = new RegistroCancionesDTO(generos[8], canciones[8], Autores[8], codigos[8]);
		cancione[9] = new RegistroCancionesDTO(generos[9], canciones[9], Autores[9], codigos[9]);
		cancione[10] = new RegistroCancionesDTO(generos[10], canciones[10], Autores[10], codigos[10]);
		cancione[11] = new RegistroCancionesDTO(generos[11], canciones[11], Autores[11], codigos[11]);
		cancione[12] = new RegistroCancionesDTO(generos[12], canciones[12], Autores[12], codigos[12]);
		cancione[13] = new RegistroCancionesDTO(generos[13], canciones[13], Autores[13], codigos[13]);
		cancione[14] = new RegistroCancionesDTO(generos[14], canciones[14], Autores[14], codigos[14]);
		cancione[15] = new RegistroCancionesDTO(generos[15], canciones[15], Autores[15], codigos[15]);
		cancione[16] = new RegistroCancionesDTO(generos[16], canciones[16], Autores[16], codigos[16]);
		cancione[17] = new RegistroCancionesDTO(generos[17], canciones[17], Autores[17], codigos[17]);
		cancione[18] = new RegistroCancionesDTO(generos[18], canciones[18], Autores[18], codigos[18]);
		cancione[19] = new RegistroCancionesDTO(generos[19], canciones[19], Autores[19], codigos[19]);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////7
	}

	public void AgregarOrdenRegistro(OrdenCancionesDTO x) {
		ordenCancionesDTO.add(x);
	}

	public String mostrarRegistro() {
		String linea = "";

		for (int i = 0; i < ordenCancionesDTO.size(); i++)
			linea += " " + ordenCancionesDTO.get(i).toString() + " ";
		return linea + " ";
	}

	public String Delete(OrdenCancionesDTO cancion) {
		int pos = buscarCancion(cancion);
		if (pos != -1) {
			cancion = null;
			ordenCancionesDTO.remove(pos);
		}
		return "Eliminado";
	}

	public String modificarRegistro(OrdenCancionesDTO cancion) {
		int pos = buscarCancion(cancion);
		if (pos != -1) {
			ordenCancionesDTO.set(pos, cancion);
		}
		return "editado";
	}

	public int buscarCancion(OrdenCancionesDTO cancion) {
		int pos = -1, i = 0;
		while (i < ordenCancionesDTO.size() && pos == -1) {
			if (cancion.getCodigoCancion() == ordenCancionesDTO.get(i).getCodigoCancion()) {
				pos = i;
			}
			i++;
		}
		return pos;
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void reproducirCancion(int x) {
		int ordenado[] = new int[20];
		String prueba1 = codigos[x];
		for (int i = 0; i < 20; i++) {
			ordenado[i] = x;
		}
		try {
			FileInputStream fileInputStream = new FileInputStream(prueba1);
			Player player = new Player(fileInputStream);
			player.play();
			System.out.println("reproduciendo");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JavaLayerException e) {
			e.printStackTrace();
		}
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public OrdenCancionesDTO escribirOrdenCancionesDTO(int numeroCancion) {

		String mensaje = "";
		OrdenCancionesDTO escrito = new OrdenCancionesDTO(numeroCancion);
		AgregarOrdenRegistro(escrito);

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaReg));
			out.writeObject(escrito);
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return null;

	}

	public String leerRegistroCancionesDTO() {
		String x = "";
		ObjectInputStream in;
		x = mostrarRegistro();

		try {
			in = new ObjectInputStream(new FileInputStream(rutaReg));

			in.close();

			System.out.println("sus datos en pantalla");

			System.out.println(x);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return x;

	}

	public String borrarRegistroCanciones(int cancion) {

		String mensaje = "Registro de Canción Eliminado!";

		String x = "";
		ObjectInputStream in;
		OrdenCancionesDTO staff;

		staff = new OrdenCancionesDTO(cancion);
		x = Delete(staff);

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaReg));
			out.writeObject(staff);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}

	public String EditarRegistroCanciones(int cancion) {
		String mensaje = "Registro de Canción Editado!";

		String x = "";
		OrdenCancionesDTO staff;

		staff = new OrdenCancionesDTO(cancion);
		x = modificarRegistro(staff);

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaReg));
			out.writeObject(staff);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;

	}

	public Clip getClip() {
		return clip;
	}

	public void setClip(Clip clip) {
		this.clip = clip;
	}

	public RegistroCancionesDTO[] getCancione() {
		return cancione;
	}

	public void setCancione(RegistroCancionesDTO[] cancione) {
		this.cancione = cancione;
	}

}
