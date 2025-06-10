package ar.com.unpaz.inicio;

import java.util.List;

import ar.com.unpaz.models.Restaurantes;
import ar.com.unpaz.repository.*;

public class Inicio {
	public static void main(String[] args) {
		Lectura lectura = new Lectura();
		List<Restaurantes> lista = lectura.Leer();
		for (Restaurantes r: lista) {
			System.out.println(r);
		}
	}
}