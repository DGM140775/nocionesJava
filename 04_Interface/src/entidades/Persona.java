package entidades;

public class Persona extends Object implements Movible {
	
	private String nombre;
	private int edad;
	private int posicion;
	
	
	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
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

	@Override
	public void moverseLento() {
		System.out.println("Soy la persona " + nombre + " y me muevo 5 metros");
		posicion = 5;
		
	}

	@Override
	public void moverseRapido() {
		System.out.println("Soy la persona " + nombre + " y me muevo 20 metros");
		posicion = 20;
		
	}

	@Override
	public int moverse(int metros) {
		System.out.println("Soy la persona " + nombre + " y me muevo " + metros + " metros");
		posicion +=metros;
		return posicion;
		
	}
	
	
	

}
