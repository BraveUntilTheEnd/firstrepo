package ar.com.Diego.model;

import java.util.Scanner;
import ar.com.Diego.inicio.*;
import java.util.ArrayList;

public class Menu {
	public void mostrarMenu() {
		System.out.println("----------- Bienvenido al Menu Principal --------------" + "\n" 
		+ "Opcion 1: Ingresar Numero a la Lista \n"
		+ "Opcion 2: Mostrar Lista de Numeros \n"
		+ "Opcion 3: Eliminar Lista \n"
		+ "Opcion 4: Cerrar Programa");
						
	}
	
	public void Elegir(ArrayList<Integer> acumulador, Scanner teclado) {
		boolean iniciar = true;
		try {
			//String prueba = Integer.toString(decision);
			while (iniciar) {
				mostrarMenu();
				String validar = teclado.nextLine();
				int decision = Integer.parseInt(validar);
				switch (decision) {
					case  1: {
						agregarNumero(acumulador, teclado);
						break;
					} case 2: {
						mostrarLista(acumulador);
						break;
					} case 3: {
						//borrarLista();
						break;
					} case 4: {
						System.out.println("Muchas Gracias por Utilizar Nuestra Aplicación");
						iniciar = false;
						break;
					}
					default:
						System.out.println("Opcion Inválida " + validar + "\n Vuelva a Elegir");
						}
					}
			} catch(NumberFormatException e) {
				System.out.println("Error: Opcion Inválida " );
			}
	}
	
	public void agregarNumero(ArrayList<Integer> acumulador, Scanner teclado) {
		boolean valor = true;
		while (valor) {
			System.out.println("Ingrese el Numero a Acumular: \n" +
					"Vacio para Volver al Menu");
			try {
				String entrada = teclado.nextLine();
				int valoracion = Integer.parseInt(entrada);
				if (entrada.isEmpty()){
					System.out.println("Volviendo al Menu Principal... \n \n");
					return;
				} else if (!entrada.isEmpty()){
					agregar(acumulador, valoracion);
					agregarOtroMas(acumulador, teclado);
					valor = false;
					return;
				}
			} catch(NumberFormatException e) {
				System.out.println("Error:" + teclado + " Valor Ingresado Incorrecto ");
				return;
			}
		}
	}
	
	public void agregar(ArrayList<Integer> acumulador,int temporal) {
		acumulador.add(temporal);
	}
	
	public void agregarOtroMas(ArrayList<Integer> acumulador, Scanner teclado) {
		boolean valor = true;
		while (valor) {
			System.out.println("Desea Agregar Otro Numero? S/N");
			String respuesta = teclado.next() ;
			if (respuesta.equalsIgnoreCase("S")) {
				agregarNumero(acumulador,teclado);
			} else if  (respuesta.equalsIgnoreCase("N")){
				System.out.println("Volviendo al Menu Principal");
				valor = false;
				return;
			} else {
				System.out.println("Valor: " + respuesta + " no Válido \n" +
			"Volviendo al Menu Principal ");
				break;
			}
		}
	}
	
	public void mostrarLista(ArrayList<Integer> acumulador) {
		for (int i = 0; i < acumulador.size(); i++ ) {
			System.out.println(acumulador.get(i));	
		}
		
	}
	public void borrarElemento () {
		
	}
}
