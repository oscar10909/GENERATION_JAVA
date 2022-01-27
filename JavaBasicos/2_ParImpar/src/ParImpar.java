import java.util.Scanner;
public class ParImpar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número entero: ");
		int numero = sc.nextInt();
		
		String resultado = (numero % 2 == 0) ? ("Es par") : ("Es impar");
		
		System.out.println(resultado);
		System.out.println(numero);
	}
}



