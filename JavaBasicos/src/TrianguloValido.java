import java.util.Scanner;
public class TrianguloValido {
	public static void main(String[] args) {
		int ang1, ang2, ang3;
		
		System.out.println("Introduce un �ngulo interno: ");
		Scanner sc = new Scanner(System.in); //pide info al usuario
		ang1 = sc.nextInt();
		System.out.println("Introduce un �ngulo interno: ");
		Scanner sc1 = new Scanner(System.in); //pide info al usuario
		ang2 = sc1.nextInt();
		System.out.println("Introduce un �ngulo interno: ");
		Scanner sc2 = new Scanner(System.in); //pide info al usuario
		ang3 = sc2.nextInt();
		int trian = ang1+ang2+ang3;
		if(trian == 180) {
			System.out.println("La suma de los �ngulos internos de tu tri�ngulo es: " + trian);
		} else {
			System.out.println("Tu tri�ngulo no es v�lido");
		}
		
	}

}
