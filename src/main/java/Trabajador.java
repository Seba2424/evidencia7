import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;

public class Trabajador extends Persona {
	private String isapre;
	private String afp;
	public static ArrayList<Trabajador> trabajadores= new ArrayList<>();

	public Trabajador(String nombre, String apellido, String rut, String isapre, String afp) {
		super(nombre, apellido, rut);
		this.isapre = isapre;
		this.afp = afp;
	}

	public static ArrayList<Trabajador> getTrabajadores() {
		return trabajadores;
	}

	public static void agregarTrabajador(Trabajador trabajador) {
		trabajadores.add(trabajador);
	}

	public String getIsapre() {
		return this.isapre;
	}

	public void setIsapre(String isapre) {
		this.isapre = isapre;
	}

	public String getAfp() {
		return this.afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}
	@Override
	public String toString() {
		return nombre + ","+apellido + "," + rut + "," + isapre + "," + afp;
	}
}