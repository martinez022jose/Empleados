package dominioEmpleado;

public class Main {

	public static void main(String[] args) {
		
		//Ejemplo para ver el funcionamiento
		Comercial persona1 = new Comercial("Carlos",22,2000,100);
	    Repartidor persona2 = new Repartidor("Lucas",20,3000,"zona 3");
	    
	    persona1.plus();
	    persona2.plus();
	    
	    System.out.println(persona1);
	    System.out.println(persona2);
		
	}

}
