package herenciaypolimorfismo;

public class Triangulo extends FiguraGeometrica {
	public Triangulo() {
		super("Triangulo");
	}
	
	
	//polimorfismo, hacer que un método actua de formas diferentes
	@Override //metodo al que se le aplica polimorfismo
	public float calcularArea() {
		return (getAlto()*getLargo())/2;
	}


	@Override
	public float perimetro() {
		return getLargo()*3;
	}
}
