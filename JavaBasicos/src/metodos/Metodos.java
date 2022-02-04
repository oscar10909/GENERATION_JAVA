package metodos;

public class Metodos {
	//metodo = funcion
	//atributos de la clase
	int a, b;
	//metodo void (Vacio)
	public void sumar() {
		int resultado = a+b;
		System.out.println("El resultado de sumar " + a + " + " + b + " es " + resultado);
	}
	
	//metodo con retorno de valores
	public int sumaConRetorno() {
		//int resultado = a+b;
		//return resultado;
		return a+b;
	}
	
	//argumentos
	//suma(argumentos)
	public double multiplicarConArgumentos(int arg1, double arg2) {
		int c = arg1;
		double d = arg2;
		return c*d;
	}
	
	//metodo estático: pertenece a la clase, no necesita de un objeto
	public static void imprimirNomber(String nombre) {
		System.out.println("Mi nombre es: "+nombre);
	}
}
