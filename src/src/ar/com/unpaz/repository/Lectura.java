package ar.com.unpaz.repository;

import java.util.List;
import ar.com.unpaz.models.Restaurantes;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Lectura {
	public List<Restaurantes> Leer(){
		List<Restaurantes> lectura = new ArrayList<Restaurantes>();
		try {
		File file = new File("C:\\Users\\diego\\OneDrive\\Desktop\\Restaurantes.txt");
		FileReader sFile = new FileReader(file);
		BufferedReader  bFile = new BufferedReader(sFile);
		String linea = "";
		while ((linea = bFile.readLine()) != null) {
			String[] columnas = linea.split(",");
			String ciudadRest;
			String nombreRest;
			int codPostalRest;
			int numEmpleaRest;
			ciudadRest = columnas[0];
			nombreRest = columnas[1];
			codPostalRest = Integer.parseInt(columnas[2].trim());
			numEmpleaRest = Integer.parseInt(columnas[3].trim());
			Restaurantes r = new Restaurantes(ciudadRest, nombreRest, codPostalRest, numEmpleaRest);
			lectura.add(r);
		}
		bFile.close();
		} catch(Exception e) {
			System.out.println(e.toString());	
		}		
		return lectura;
	}

}