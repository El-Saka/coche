
/** 1. Crear una clase coche. **/
public class coche {
	
/** 2. Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene. **/	
	int numeroP=0;
	
	coche(){
		
		System.out.println("Constructor coche");
		
	}
	
	/** 3. Una función que incremente el número de puertas que tiene el coche. **/
	
	public void agregarP() {
		numeroP++;	
		System.out.println("Se agrego una puerta");
	}
	
	/** 5. Mostrar el número de puertas que tiene el objeto.**/
	
	public void mostrarP() {
		System.out.println("La Cantidad de puertas Es: " + numeroP);
	}

}
