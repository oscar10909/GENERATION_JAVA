import java.util.Scanner;
public class NumeroMayor {
	public static void main(String[] args) {
		int n1, n2, n3;
		int veces = 3;
		
		System.out.println("Introduce numero: ");
		Scanner sc = new Scanner(System.in); //pide info al usuario
		n1 = sc.nextInt();
		System.out.println("Introduce numero: ");
		Scanner sc1 = new Scanner(System.in); //pide info al usuario
		n2 = sc1.nextInt();
		System.out.println("Introduce numero: ");
		Scanner sc2 = new Scanner(System.in); //pide info al usuario
		n3 = sc2.nextInt();
		/*if(n1 > n2) {
			if(n1 > n3) {
				System.out.println("El numero mayor es: " + n1);
			}
			else {
				System.out.println("El numero mayor es: " + n3);
			}
		} else {
			if(n2 > n3) {
				System.out.println("El numero mayor es: " + n2);
			}
			else {
				System.out.println("El numero mayor es: " + n3);
			}
		}*/
		
		if(n1 >= n2 && n1 >= n3) {
				System.out.println("El numero mayor es: " + n1);
			
		} else if (n2 >= n1 && n2 >= n3) {
				System.out.println("El numero mayor es: " + n2);
		}else {
				System.out.println("El numero mayor es: " + n3);
		}
	}
}
