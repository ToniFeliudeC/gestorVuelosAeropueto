package examen2;

import java.util.Scanner;

public class Avion {
	
	//Atributos
	private String id;
	private int pasajeros;
	
	//Constructores
	public Avion() {
		
	}
	
	public Avion(String id, int pasajeros) {
		this.id = id;
		this.pasajeros = pasajeros;
	}

	//Getters & Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	//toString
	@Override
	public String toString() {
		return "Avion [id=" + id + ", pasajeros=" + pasajeros + "]";
	}
	
	//M�todos
	public static Avion solicitarDatos() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el id del avi�n:");
		String id = teclado.nextLine();
		
		System.out.println("Introduce el n�mero de pasajeros del avi�n:");
		int pasajeros = Integer.parseInt(teclado.nextLine());
		
		Avion nuevoAvion = new Avion(id, pasajeros);
		
		return nuevoAvion;
	}
	
	
	
	
	
}
