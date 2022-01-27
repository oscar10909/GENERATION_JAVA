package operadores;

public class Operadores {
	public static void main(String[] args) {
		//operadores aritmeticos
		int a = 10; int b = 20;
		int c = a + b;
		System.out.println(c);
		String str1 = "El resultado de la suma es: ";
		System.out.println(str1 + c);
		//resta
		System.out.println("El resultado de la resta es: " + (a-b) );
		//division
		int division = c/b;
		System.out.println("El resultado de la division es: " + division);
		double div2 = (double) a/b;
		//por lo menos 1 de los datos debe ser double
		System.out.println("El resultado de la division es: " + div2);
		//multiplicacion
		double multi =  c*a;
		System.out.println("El resultado de la division es: "+multi);
		//modulo
		double modulo = (double) a%c;
		System.out.println("El módulo de la operación es: " + modulo);
		/*operador asignación*/
		int d=5, e;
		e = 6;
		System.out.println(d + ", " + e);
		
		/*operadores de declaración compuesta*/
		int f = 0, g= 5;
		f += 5;
		System.out.println(f);
		
		/*Operadores relacionales*/
		int h = 15, i = 25;
		String j = "Hola";
		System.out.println(h>i); //false
		System.out.println(i != h);
		/*Operador unitario*/
		int k=0, l=0;
		k++;
		System.out.println(k);
		System.out.println(--l);
		System.out.println(++k);
		
		/*precedencia de operaciones*/
		int operacion = (4 + 5) * 6 / 3; //14
		System.out.println(operacion);
		int x = 0, y = 0;
		int operacion2 = ++x + y--;
		//x = 1, y = 0
		System.out.println(operacion2); //1
		
		/*operador ternario*/
		int edad = 18, valor1 = 0, valor2 = 1;
		int resultado = (edad <= 18) ? (valor1=10) : (valor2=0);
		System.out.println(resultado);
		
		/*Operadores logicos*/
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(true || false);//true
		System.out.println(true && !false);//false
	}
}
