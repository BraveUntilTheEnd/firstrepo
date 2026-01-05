package ar.com.Diego.inicio;
import java.util.ArrayList;
import java.util.Scanner;

//import java.util.Scanner;
import ar.com.Diego.model.Menu;

public class Inicio {
	public static void main(String[] args) { 
		 Scanner teclado = new Scanner(System.in);
		Menu menu = new Menu();
		ArrayList<Integer> acumulador = new ArrayList<>();
		menu.Elegir(acumulador, teclado);
		/*
		
		int temporal;
		boolean valor = true;
		while (valor) {
			System.out.println("Ingrese el numero a acumular: ");
			temporal = ingreso.nextInt();
			String valoracion = Integer.toString(temporal);
			if (valoracion.isEmpty()){
				valor = false;
				ingreso.close();
				break;
			} else if (!valoracion.isEmpty()) {
				Acumulador.add(temporal);
				System.out.println(Acumulador);
				
			}	
		}
		
 	}*/
	}
}
