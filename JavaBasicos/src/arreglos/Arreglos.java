package arreglos;

public class Arreglos {
	public static void main(String[] args) {
		//solo un tipo de dato, especificar tamaño o cantidad
		//de elementos que va a contener
		
		//first way
		int numeros[]; //creando variable
		numeros = new int[4]; //creando arreglo
		
		//second way
		String[] nombres = new String[4];
		
		//third way
		String []nombreFrutas = new String[] {"Manzana", "Platano", "Uvas", "Peras"};
		
		numeros[0] = 10;
		numeros[1] = 8;
		numeros[2] = 100;
		numeros[3] = 200;
		
		nombres[0] = "Juan";
		nombres[1] = "Pedro";
		nombres[2] = "Antonio";
		
		System.out.println(numeros[0]);
		System.out.println(numeros);
		
		for(int i =0; i < numeros.length;i++) {
			System.out.println("Elemento de números: " + numeros[i]);
			System.out.println("Elemento de nombre: " + nombres[i]);
			System.out.println("Elemento de frutas: " + nombreFrutas[i]);
		}
	}
}
