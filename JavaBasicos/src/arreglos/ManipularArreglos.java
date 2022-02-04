package arreglos;

public class ManipularArreglos {
	public static void main(String[] args) {
		
		int numeros[]; //creando variable
		numeros = new int[] {1, 6, 45, 53, 80, 102, 145, 326, 450, 892}; //creando arreglo
		
		int sumaTotal = 0;
		int sumaPar = 0;
		int sumaImpar = 0;
		
		for(int i =0; i < numeros.length;i++) {
			if(numeros[i] % 2 == 0) {
				sumaPar += numeros[i];
			}else {
				sumaImpar += numeros[i];
			}
			sumaTotal += numeros[i];
		}
		System.out.println("La suma total es: " + sumaTotal);
		System.out.println("La suma de los Impares es: " + sumaImpar);
		System.out.println("La suma de los Pares es: " + sumaPar);
	}
}
