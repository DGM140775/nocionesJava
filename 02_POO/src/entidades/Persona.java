package entidades;

public class Persona {
	//las dos visibilidades mas importantes son public y private
	//y se pueden dar tanto a atributos como a metodos
	//con public podemos acceder desde cualquier otra clase
	//con private solo podemos acceder desde la propia clase
	public String nombre;
	public int edad;
	public double peso;
	private int metros;
	public Direccion direccion;
	
	//los atributos se inicializan a null si son referencias
	// y a 0 si son primitivos o a false si son booleans
	
	
	//Todos los objetos tienen un constructor
	//constructor por defecto	
	public Persona() {
		
	}
	public Persona(String nombre, int edad, double peso, int metros) {
		super(); //palabra resevada que invoca al constructor padre
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.metros = metros;
	}
	
	public void andar(int metros) {
		//con this hacemos una referencia al propio objeto, en este caso al atributo.
		this.metros += metros;
	}
	
	public int getMetros() {
		return metros; 
	}
	
	
	
}
