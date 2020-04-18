package dominioEmpleado;

public class Repartidor extends Empleado{
    private String zona;
	
    public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre,edad,salario);
		this.zona=zona;
		
	}
	
	public void setZona(String zona) {
		this.zona = zona;
	}
	
	public  String getZona() {
		return zona;
	}
	
	@Override
	public String toString() {
		return super.toString() + "zona=" + zona;
	}

	@Override
	public void plus(){
		if(super.getEdad()<25 && this.getZona()=="zona 3"){
		super.agregarPlus();
		}
	}
	
}
