package ciclos;

import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Ingresa cualquier número positivo: ");
        num = console.nextInt();
                
        System.out.println("Tabla de multiplicar de  " + num);
        int resultado;
        int multi = 1;
        while(multi <= 10) {
        	resultado = multi*num;
        	System.out.println(num + " x " +multi + " = " + resultado);
        	multi++;
        }
       //Implementa un bucle while que imprima el resultado
    }
}


