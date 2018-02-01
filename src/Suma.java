public class Suma {

	// variable miembro de la clase
	static int numero1 = 50; 

	public static void main(String[] args) {
		// variables locales
		int numero2 = 30, suma = 0; 
		suma = numero1 + numero2;
		System.out.println("LA SUMA ES: " + suma);
	}
	
	public void imprimeValor () {
		System.out.println(numero1);
	}
}
