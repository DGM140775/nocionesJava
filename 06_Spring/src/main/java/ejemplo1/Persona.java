package ejemplo1;

/*
 * normalmente una clase que queramos que sea manejada por Spring, debe tener el constructor
 * por defecto.
 * Tambien debe seguir la convencion javaBean (getter y setter publicos)
 */

public class Persona {
	private String nombre;
	private int edad;
	private double peso;
	
		
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	

}
