import java.util.Scanner;
public class PedirNombre {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		char letra;
		System.out.println("Las letras de tu nombre son: ");
		for (int i = 0; i < nombre.length(); i++){
			if(nombre.charAt(i) != ' '){
				letra = nombre.charAt(i);
				System.out.println(letra);
			}
		}
	}
}
