package dominioEmpleado;

public class Comercial extends Empleado {
	private double comision;

	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre,edad,salario);
		this.comision = comision;
	}
	public void setComision(double comision) {
		this.comision=comision;
	}
	
	public double getComision() {
		return comision;
	}
	
	@Override
	public String toString() {
		return super.toString()+"comision"+comision;
	}
	
	@Override
	public void plus(){
		if(super.getEdad()>30 && this.getComision()>200) {
			super.agregarPlus();
		}
	}

}
