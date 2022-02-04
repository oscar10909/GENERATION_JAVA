// solicitar el total de una compra por consola.
		// si la cuenta es de menos de 1000
		// sila cuenta es de 1001 - 4999 10%
		// si la cuenta es de 5001 a 9999 20%
		// si la copra es de 10000 o más 30%
import java.text.DecimalFormat;
import java.util.Scanner;
public class DescuentoCompra {
	public static void main(String[] args) {
		double total;
		double desc10 = 0.1d;
		double desc20 = 0.2d;
		double desc30 = 0.3d;
		double totalf;
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(3);
		
		System.out.println("¿Cual es tu compra total?: ");
		Scanner sc = new Scanner(System.in); //pide info al usuario
		total = sc.nextDouble();

		/*
		 * if(total >= 10000) { totalf = total*(1-desc30);
		 * System.out.println("Tu compra tiene un descuento del 30%, tu total es: " +
		 * df.format(totalf)); } else if(total >= 5000 && total < 10000){ totalf =
		 * total*(1-desc20);
		 * System.out.println("Tu compra tiene un descuento del 20%, tu total es: " +
		 * df.format(totalf)); } else if(total >= 1000 && total < 5000 ) { totalf =
		 * total*(1-desc10);
		 * System.out.println("Tu compra tiene un descuento del 10%, tu total es: " +
		 * df.format(totalf)); } else {
		 * System.out.println("No hay descuento, tu compra es de: " + total); }
		 */
		
		if(total < 1000) {
			System.out.println("No hay descuento, tu compra es de: " + total);
		} else if(total >= 1000 && total < 5000){
			totalf = total*(1-desc10);
			System.out.println("Tu compra tiene un descuento del 10%, tu total es: " + df.format(totalf));
		} else if(total >= 5000 && total < 10000) {
			totalf = total*(1-desc20);
			System.out.println("Tu compra tiene un descuento del 20%, tu total es: " + df.format(totalf));
		} else if(total >= 10000){
			totalf = total*(1-desc30);
			System.out.println("Tu compra tiene un descuento del 30%, tu total es: " + df.format(totalf));
		}
		
	}
}
