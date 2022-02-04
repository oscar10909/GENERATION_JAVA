import java.util.Scanner;
public class TrianguloValido {
	public static void main(String[] args) {
		int ang1, ang2, ang3;
		
		System.out.println("Introduce un ángulo interno: ");
		Scanner sc = new Scanner(System.in); //pide info al usuario
		ang1 = sc.nextInt();
		System.out.println("Introduce un ángulo interno: ");
		Scanner sc1 = new Scanner(System.in); //pide info al usuario
		ang2 = sc1.nextInt();
		System.out.println("Introduce un ángulo interno: ");
		Scanner sc2 = new Scanner(System.in); //pide info al usuario
		ang3 = sc2.nextInt();
		int trian = ang1+ang2+ang3;
		if(trian == 180) {
			System.out.println("La suma de los ángulos internos de tu triángulo es: " + trian);
		} else {
			System.out.println("Tu triángulo no es válido");
		}
		
	}

}
