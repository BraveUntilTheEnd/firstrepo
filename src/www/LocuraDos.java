package www;

import interfaces.ILocuraDos;

public class LocuraDos implements ILocuraDos{
	int edad;
	
	public LocuraDos(int tuEdad) {
		this.edad = tuEdad;
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
}
