
public class MainSentenciasControl {
	public static void main(String[] args) {
		//condicionales
		int numero = 10;
		if(numero > 10) {
			System.out.println("el numero es mayor que 10");
		}else if (numero < 10) {
			System.out.println("el numero es menor que 10");			
		}else {
			System.out.println("El numero es 10");
		}
		
		if (true || false) { //OR
			
		}
		
		if (true && false) { //AND
			
		}
		
		if (!true) { //Negacion
			
		}
		
		//bucles
		
		//inicializacin de la variable, condicin de bucle, incremento de bucle		
		for (int i=0;i<=10;i++) {
			System.out.println(i);
		}
		
		int numero2 = 0;
		while (numero2<=10) {
			System.out.println(numero2);
			numero2++;
		}
		
		String diaSemana = "martes";
		switch (diaSemana) { //ponemos a valorar la variable
		case "lunes":
			System.out.println("El dia de la semana es lunes");
			break; //con el break rompemos la sentencia switch
			//la ejecucin continuar hasta que se encuentre un brea
		case "martes":
			System.out.println("El dia de la semana es martes");
			break; 
		default:
			break;
		}
		
		
	}
	
}