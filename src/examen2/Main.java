package examen2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Aeropuerto aeropuerto1 = new Aeropuerto();
		aeropuerto1.setCapacidad(500);
		aeropuerto1.setNombre("Barajas");

		boolean salir = false;

		while (!salir) {

			System.out.println("1.-Añadir Vuelo.");
			System.out.println("2.-Ver lista de Vuelos según destino.");
			System.out.println("3.-Eliminar Vuelo.");
			System.out.println("4.-Comprobar capacidad.");
			System.out.println("5.-Salir.");

			String choice = teclado.nextLine();

			switch (choice) {
			case "1":
				Vuelo.añadirVuelo(aeropuerto1.getListaVuelos());
				break;
			case "2":
				Vuelo.buscarVueloByDestino(aeropuerto1.getListaVuelos());
				break;
			case "3":
				if (Vuelo.eliminarVuelo(aeropuerto1.getListaVuelos())) {
					System.out.println("El vuelo ha sido eliminado.");
				}
				else {
					System.out.println("No se ha encontrado el vuelo introducido.");
				}
				break;
			case "4":
				if (aeropuerto1.comprobarCapacidad()) {
					System.out.println("La suma de todos los pasajeros de los aviones de los vuelos del"
							+ " aeropuerto, supera la capacidad máxima del aeropuerto.");
				}
				else {
					System.out.println("La suma de todos los pasajeros de los aviones de los vuelos"
							+ " del aeropueto, NO supera la capacidad máxima del aeropuerto.");
				}
				break;
			case "5":
				salir = true;

			}
		}

	}

}
