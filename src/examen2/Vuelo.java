package examen2;

import java.util.ArrayList;
import java.util.Scanner;

public class Vuelo {
	
	//Atributos
	private int id = 0;
	private static int contador;
	private Avion avion;
	private String origen;
	private String destino;
	
	//Constructores
	public Vuelo() {
		
	}
	
	public Vuelo(Avion avion, String origen, String destino) {
		this.avion = avion;
		this.origen = origen;
		this.destino = destino;
		this.id = contador++;
	}

	//Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	//toString
	@Override
	public String toString() {
		return "Vuelo [id=" + id + ", avion=" + avion + ", origen=" + origen + ", destino="
				+ destino + "]";
	}
	
	//Métodos
	public static Vuelo solicitarDatos() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce los datos del avion del vuelo.");
		Avion avion = Avion.solicitarDatos();
		
		System.out.println("Introduce el origen del vuelo:");
		String origen = teclado.nextLine();
		
		System.out.println("Introduce el destino del vuelo:");
		String destino = teclado.nextLine();
		
		Vuelo nuevoVuelo = new Vuelo(avion, origen, destino);
		
		return nuevoVuelo;
	}
	
	public static void añadirVuelo(ArrayList<Vuelo> lista) {
		lista.add(Vuelo.solicitarDatos());
	}
	
	public static int buscarVueloById(ArrayList<Vuelo> lista) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el id del vuelo que quieres buscar:");
		int id = Integer.parseInt(teclado.nextLine());
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean eliminarVuelo(ArrayList<Vuelo> lista) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el id del vuelo que quieres eliminar:");
		int id = Integer.parseInt(teclado.nextLine());
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				lista.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public static void buscarVueloByDestino(ArrayList<Vuelo> lista) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el destino del vuelo que quieres buscar:");
		String destino = teclado.nextLine();
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getDestino().equals(destino)) {
				System.out.println(lista.get(i).toString());
			}
		}
	}
	
}
