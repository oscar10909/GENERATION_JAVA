import java.util.Scanner;

public class ScannerBuffer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduce un n�mero");
		int n1 = sc.nextInt();
		
		System.out.println("Tu nombre es: " + nombre + ". Tu n�mero es: " + n1);
	}
}
