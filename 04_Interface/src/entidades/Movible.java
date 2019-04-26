package entidades;


/**
 * 
 * Interfaz que hace que los objetos se puedan mover. Cada objeto se movera
 * como corresponda
 *
 *@author DGM
 *@version 1.0
 *@since 24-04-2019
 *@see ve a est URL para mas documentacin
 * *
 */
public interface Movible {
	// no hace falta poner la palabra abstract ya que al ser un metodo de un interface, siempre es abastracto y publico
	//no podemos declarar atributos
	
	/**
	 * Este metodo hace que el  objeto se mueva de la manera mas lenta posible
	 */
	public void moverseLento();
	
	/**
	 * Este metodo hace que el  objeto se mueva de la manera mas rapida posible
	 * @param metros representa lo metros que se movera el objeto
	 * @return representa la posicion donde esta el objeto
	 */
	public void moverseRapido();
	
	public int moverse(int metros);
	
	
}
