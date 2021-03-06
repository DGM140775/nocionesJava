package entidades;

import java.util.ArrayList;

public class MainHerencia {
	
	public static void main(String[] args) {
		Empleado empleado = new Programador();
		empleado.setDni("1122334455S");
		empleado.setNombre("Bud");
		empleado.setNomina(1000);
		
		Jefe jefe = new Jefe();
		jefe.setDni("6677889900R");
		jefe.setNombre("Terence");
		jefe.setNomina(1600);
		jefe.setIncentivos(300);
		
		Director director = new Director();
		director.setDni("0099887766X");
		director.setNombre("Harry");
		director.setNomina(2500);
		
		ArrayList<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(empleado);
		listaEmpleados.add(jefe);
		
		director.setListaEmpleados(listaEmpleados);
		
		ArrayList<Empleado> empresa = new ArrayList<>();
		empresa.add(empleado);
		empresa.add(jefe);
		empresa.add(director);		
		
		calcularSueldo(empresa);
		
		Empleado empleado1 = empresa.get(1);
		System.out.println(empleado1.getNombre());
		if (empresa.get(1) instanceof Jefe) {//nos aseguramos que en la posicin 1 del array es un Jefe y no otro tipo
			Jefe jefe1 = (Jefe)empresa.get(1);
			System.out.println(jefe1.getIncentivos());
		}
		
		
	}	
		public static void calcularSueldo(ArrayList<Empleado> empresa) {
			for (Empleado e : empresa) { // Para cada empleado del array empresa
				System.out.println(e);
				System.out.println(e.calcularSueldo());
			}	
		}
					
}
