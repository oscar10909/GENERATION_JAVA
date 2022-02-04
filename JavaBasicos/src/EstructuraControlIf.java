import java.util.Scanner;
public class EstructuraControlIf {
	//estructura de control de flujo
	/*Sirve para toma de decisiones, cambiar el flujo 
	 * del programa, evaluando una condición y a partir
	 * de esta realiza una acción u otra*/
	public static void main(String[] args) {
//		if() {
//			
//		}else {
//			
//		}
		System.out.println("Introduce tu edad: ");
		Scanner sc = new Scanner(System.in); //pide info al usuario
		int edad = sc.nextInt();
		if(edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
		
		//pedir 3 num al usuario y mostrar mensaje con numero
		//mayor
	}
}
