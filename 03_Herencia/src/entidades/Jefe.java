package entidades;

public class Jefe extends Empleado{
	private double incentivos;
	
	
	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		return getNomina() + incentivos;
	}

	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}

	@Override
	public String toString() {
		return "Jefe [incentivos=" + incentivos + ", nombre=" + getNombre() +"]";
	}
	
	
	
	
}
