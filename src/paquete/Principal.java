package paquete;

import java.util.Scanner;

public class Principal {

	public static int indiceCocheMBarato(Vehiculo coches[]) {
		float precio;
		int indice = 0;
	
		
		precio=coches[0].getPrecio();
		
		for(int i =0; i<coches.length; i++) {
			if(coches[i].getPrecio()<precio) {
				precio = coches[i].getPrecio();
				indice = i;
			}
		}
		
		return indice;
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String marca, modelo;
		float precio;
		int nVehiculos, indiceBarato;

		System.out.print("Digita la cantidad de vehiculos: \n");
		nVehiculos = entrada.nextInt();

		Vehiculo coches[] = new Vehiculo[nVehiculos];

		for (int i = 0; i < nVehiculos; i++) {
			entrada.nextLine();
			System.out.println("Digite las características del Coche " + (i + 1) + ":");
			System.out.println("Introduzca Marca :");
			marca = entrada.nextLine();
			System.out.println("Introduzca el modelo :");
			modelo = entrada.nextLine();
			System.out.println("Introduzca el precio :");
			precio = entrada.nextInt();

			coches[i] = new Vehiculo(marca, modelo, precio);
		}
		
		indiceBarato = indiceCocheMBarato(coches);
		System.out.println("\nEl coche más barato es: ");
		System.out.println(coches[indiceBarato].mostrarDatos());

	}

}
