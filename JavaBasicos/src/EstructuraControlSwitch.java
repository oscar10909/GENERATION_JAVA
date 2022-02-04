import java.util.Scanner;

public class EstructuraControlSwitch {
	public static void main(String[] args) {
		//solicitar al usuario, dia de la semana y mostrar
		//mensaje
		System.out.println("Introduce un día de la semana: ");
		Scanner sc = new Scanner(System.in);
		String dia = sc.nextLine();

		sc.close();
		
		switch(dia.toLowerCase()) {
		case "lunes":
			System.out.println("Ya mero es viernes");
			break;
		case "martes":
			System.out.println("Lunes chiquito. Esto esta cansado, pero ya casi");
			break;
		case "miercoles":
			System.out.println("Miercoles pero a que costo");
			break;
		case "jueves":
			System.out.println("Juebebes de sed peligrosa");
			break;
		case "viernes":
			System.out.println("Viernes de fiesta para morir");
			break;
		default:
			System.out.println("Este no es un día de la semana");
			break;
		}
	}
	
}
