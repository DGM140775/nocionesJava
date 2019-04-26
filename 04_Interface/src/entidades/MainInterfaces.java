package entidades;

import java.util.ArrayList;

public class MainInterfaces {
	
	public static void main(String[] args) {
		Movible movible = new Coche();
		movible.moverseRapido();
		
		Persona p1 = new Persona();
		p1.setNombre("Silvestre");
		p1.setEdad(34);
		
		Coche p2 = new Coche();
		p2.setMarca("Renault");
		p2.setMatricula("1234 ABC");
		
		Persona p3 = new Persona();
		p3.setNombre("Piolin");
		p3.setEdad(12);
		
		Coche p4 = new Coche();
		p4.setMarca("Peugeot");
		p4.setMatricula("4567 XYZ");
		
		
		ArrayList<Movible> carrera = new ArrayList<>();
		carrera.add(p1);
		carrera.add(p2);
		carrera.add(p3);
		carrera.add(p4);
		
		for (Movible participante : carrera) {
			participante.moverseRapido();
			
		}
		
	}

}
