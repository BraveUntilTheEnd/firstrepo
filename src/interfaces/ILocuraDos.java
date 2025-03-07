package interfaces;

import www.LocuraDos;

public interface ILocuraDos {
	int getEdad();
	void setEdad(int nuevaEdad);
	int nacimientoCalculado();
	String getName();
	String getSurname();
	void getNombreCompleto(String nombre, String apellido);
	void getSuNombreCompleto(LocuraDos personita);
}
