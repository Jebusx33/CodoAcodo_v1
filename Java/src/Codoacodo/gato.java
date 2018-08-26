package Codoacodo;
//@author Jesus Arias

/*
 * 1. Crear una clase Gato en UML y en java; teniendo en cuenta que sus atributos son:
nombre, raza, color y sus métodos: maullar(), caminar(), saltar(), jugar(). Los
atributos son de visibilidad: private, de manera que requiere los métodos para poder
ver y modificar los atributos
*/
public class gato {
	private String nombre;
	private String raza;
	private String color;
	 @SuppressWarnings("unused")
	private void maullar() {
	}
	 @SuppressWarnings("unused")
	private void caminar() {
	}
	 @SuppressWarnings("unused")
	private void saltar() {
	}
	 @SuppressWarnings("unused")
	private void jugar() {
	} 
	 

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
