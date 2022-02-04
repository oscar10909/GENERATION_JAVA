import java.util.Scanner;

public class OperacionMenu {
	public static void main(String[] args) {
		//solicitar al usuario, dia de la semana y mostrar
		//mensaje
		System.out.println("Introduce el primer numero: ");
		Scanner sc = new Scanner(System.in);
		float n1 = sc.nextFloat();
		System.out.println("Introduce el segundo numero: ");
		float n2 = sc.nextFloat();
		sc.nextLine(); //limpiar el buffer de entrada
		System.out.println("Introduce la operación que deseas hacer: ");
		String operacion = sc.nextLine();
		
		sc.close();

		float resultado;
		switch(operacion.toLowerCase()) {
		case "suma":
			resultado= n1+n2;
			System.out.println("La suma da como resultado: " + resultado);
			break;
		case "resta":
			resultado = n1-n2;
			System.out.println("La resta da como resultado: " + resultado);
			break;
		case "multiplicacion":
			resultado= n1*n2;
			System.out.println("La suma da como resultado: " + resultado);
			break;
		case "division":
			resultado= n1/n2;
			System.out.println("La suma da como resultado: " + resultado);
			break;
		default:
			System.out.println("Esta no es una operación valida");
		}
	}
}
