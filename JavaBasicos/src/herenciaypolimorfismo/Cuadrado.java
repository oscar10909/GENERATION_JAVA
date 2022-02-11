package herenciaypolimorfismo;

public class Cuadrado extends FiguraGeometrica{
	public Cuadrado(){
		super("Cuadrado");
		//acceder a constructor de clase padre
	}

	@Override
	public float calcularArea() {
		return getAlto()*getLargo();
	}

	@Override
	public float perimetro() {
		return (getAlto()+getLargo())*2;
	}
	
//	public Cuadrado(float lado) {
//		super("Cuadrado", lado);
//	}
}
