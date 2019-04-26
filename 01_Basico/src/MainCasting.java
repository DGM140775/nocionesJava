
public class MainCasting {
	public static void main(String[] args) {
		double real = 5.9;
		int entero = (int)real; //tenemos que hacer el casting poniendo el (int) para que un real encaje en un entero
		System.out.println(entero);
		
		long numero = (int)Math.round(real);
		System.out.println(numero);
	}
}
