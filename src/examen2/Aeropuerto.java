package examen2;

import java.util.ArrayList;

public class Aeropuerto {
	
	//Atributos
	private String nombre;
	private ArrayList<Vuelo> listaVuelos = new ArrayList<Vuelo>();
	private int capacidad;
	
	//Constructores
	public Aeropuerto() {
		
	}
	
	public Aeropuerto(String nombre, ArrayList<Vuelo> listaVuelos, int capacidad) {
		this.nombre = nombre;
		this.listaVuelos = listaVuelos;
		this.capacidad = capacidad;
	}

	//Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Vuelo> getListaVuelos() {
		return listaVuelos;
	}

	public void setListaVuelos(ArrayList<Vuelo> listaVuelos) {
		this.listaVuelos = listaVuelos;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	//toString
	@Override
	public String toString() {
		return "Aeropuerto [nombre=" + nombre + ", listaVuelos=" + listaVuelos + ", capacidad=" + capacidad + "]";
	}
	
	//Métodos
	public boolean comprobarCapacidad() {
		int suma = 0;
		for (int i = 0; i < listaVuelos.size(); i++) {
			suma += listaVuelos.get(i).getAvion().getPasajeros();
		}
		return suma > capacidad;
	}
}