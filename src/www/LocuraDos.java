package www;

import interfaces.ILocuraDos;

public class LocuraDos implements ILocuraDos{
	int edad;
	String name;
	String surName;
	public LocuraDos(int tuEdad) {
		this.edad = tuEdad;
	}

	public LocuraDos(int tuEdad, String nombre, String apellido) {
		this.edad = tuEdad;
		this.name = nombre;
		this.surName = apellido;
	}
	public void getNombreCompleto(String nombre, String apellido) {
		System.out.println(nombre + " " + apellido);
	}
	public void getSuNombreCompleto(LocuraDos  ladron) {
		System.out.println(ladron.getName() + " " + ladron.getSurname());
	}
	
	public int getEdad(){
		return this.edad;
	}

	public void setEdad(int nuevaEdad) {
		this.edad = nuevaEdad;
	}

	public int nacimientoCalculado() {
		int fechaNasc = 2025 - this.edad;
		return fechaNasc;
	}

	public String getName() {
		return this.name;
	}
	
	public String getSurname() {
		return this.surName;
	}
}
