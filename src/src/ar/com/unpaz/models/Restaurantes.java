package ar.com.unpaz.models;

public class Restaurantes {
	String nombreRest;
	String ciudadRest;
	int codPostalRest;
	int numEmpleaRest;
	
	public Restaurantes(String ciudadRest, String nombreRest, int codPostalRest, int numEmpleaRest) {
		this.ciudadRest = ciudadRest;
		this.nombreRest = nombreRest;
		this.codPostalRest = codPostalRest;
		this.numEmpleaRest = numEmpleaRest;
	}
	
	public String toString() {
		return "Ubicacion del Restaurante: " + ciudadRest + "\n"
				+ "Nombre Del Restaurante: " + nombreRest + "\n"
				+ "Codigo Postal Del Restaurante: " + codPostalRest + "\n"
				+ "Numero De Empleados: " + numEmpleaRest + "\n";
	}

}
