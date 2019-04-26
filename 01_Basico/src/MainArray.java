
public class MainArray {
	public static void main(String[] args) {
		int numero = 5;
		int[] arrayNumeros = new int[5];
		//este tipo de arrays son estaticos, es decir
		//una vez inicializado el array a un tamanio, siempre sera ese tamanio
		arrayNumeros[0] = 23;
		arrayNumeros[1] = 45;
		
		for (int i=0;i < arrayNumeros.length; i++) {
			System.out.println(arrayNumeros[i]);
		}
		
		//otra forma de hacerlo ms optima
		for (int i: arrayNumeros) {
			System.out.println(i);
		}
		
	}
}