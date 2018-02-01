
public class Factura {

	public static void main(String[] args) {
		//Declaración de constante
		final double IVA = 1.21; 
		
		int importe1 = 1000;
		int importe2 = 1500;
		int importe3 = 2000;
		int importe4 = 2500;
		int importe5 = 3000;
		int importe6 = 850;
		int importe7 = 5000;
		int importe8 = 8000;
		int importe9 = 10000;
		
		System.out.println("El total de la factura1 es: " + (importe1 * IVA));
		System.out.println("El total de la factura2 es: " + (importe2 * IVA));
		System.out.println("El total de la factura3 es: " + (importe3 * IVA));
		System.out.println("El total de la factura4 es: " + (importe4 * IVA));
		System.out.println("El total de la factura5 es: " + (importe5 * IVA));
		System.out.println("El total de la factura6 es: " + (importe6 * IVA));
		System.out.println("El total de la factura7 es: " + (importe7 * IVA));
		System.out.println("El total de la factura8 es: " + (importe8 * IVA));
		System.out.println("El total de la factura9 es: " + (importe9 * IVA));
		
	}
}
