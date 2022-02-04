package metodos;

public class PruebaMetodos {
	public static void main(String[] args) {
		Metodos.imprimirNomber("Oscar Sosa");
		
		//crear(instanciar) un objeto que contenera metodos y atributos
		Metodos metodoPrueba = new Metodos();
		
		metodoPrueba.a = 10;
		metodoPrueba.b = 26;
		
		metodoPrueba.sumar();
		
		//metodo con retorno: este tipo de metodo, se puede almacenar  dentro
		//de una variable
		int resultadoSuma = metodoPrueba.sumaConRetorno();
		System.out.println(resultadoSuma - 10);
		
		//metodo con argumento
		double multiplicacion = metodoPrueba.multiplicarConArgumentos(40, 20.5);
		System.out.println("El resultado de la multiplicacion es " + multiplicacion);
	}
}
