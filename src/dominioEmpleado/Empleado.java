package dominioEmpleado;

public abstract class Empleado {
	
	private String nombre;
	private int edad;
	private double salario;
	public final int plus = 300;
	
    public Empleado(String nombre,int edad,double salario) {
    	this.nombre = nombre;
    	this.edad=edad;
    	this.salario =salario;
    	
    }
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public int getPlus() {
		return plus;
	}
	
	public void agregarPlus() {
		double total = this.getSalario()+this.getPlus();
		this.setSalario(total);
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", plus=" + plus + "]";
	}
	
	public abstract void plus();
	
	



}
