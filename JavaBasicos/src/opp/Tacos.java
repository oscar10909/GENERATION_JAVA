package opp;

public class Tacos {
	String tipoDeTortilla;
	String tipoDeGuisado;
	String tamanioDeTortilla;
	int numeroDeTortilla;
	float precio = 0.0f;
	
	//constructor nos ayuda a inicializar objetos
	//sobrecarga para 
	public Tacos() {
		
	}
	public Tacos(String tipoDeTortilla) { //(Argumentos, parametros)
		this.tipoDeTortilla = tipoDeTortilla;
	}
	public Tacos(String tipoDeTortilla, String tipoDeGuisado,
			int numeroDeTortilla, String tamanioDeTortilla,
			float precio) {
		this.tipoDeTortilla = tipoDeTortilla;
		this.tipoDeGuisado = tipoDeGuisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.precio = precio;
	}
	void preparar() {
		System.out.println("Preparando tu rico taco");
	}
	
	void vender() {
		System.out.println("Taco Vendido");
	}
	void ponerSalsa() {
		System.out.println("Agregando salsa de la que no pica");
	}
	void subirPrecio (float aumento) {
		precio = precio +aumento;
	}
	
	/*metodo que imprime el valor de los atributos*/
	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", tamanioDeTortilla="
				+ tamanioDeTortilla + ", numeroDeTortilla=" + numeroDeTortilla + ", precio=" + precio + "]";
	}
	
	
}
