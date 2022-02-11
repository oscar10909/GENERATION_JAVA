package herenciaypolimorfismo;

public abstract class FiguraGeometrica {
	//clases abstractas: clases que pueden contener o no
	//metodos abstractos.
	//no pueden generar objetos, se usan para heredar, una superplantilla
	
	private String nombre;
	private float alto;
	private float largo;
	
	//constructor
	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
	}
	
	/*
	 * public FiguraGeometrica(String nombre, float alto) { this.nombre = nombre;
	 * this.alto =alto; }
	 */
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getAlto() {
		return alto;
	}


	public void setAlto(float alto) {
		this.alto = alto;
	}


	public float getLargo() {
		return largo;
	}


	public void setLargo(float largo) {
		this.largo = largo;
	}


	/*
	 * public float calcularArea() { return alto*largo; }
	 */
	//les voy a decir que calculen el área pero no les
	//voy a decir como, obligo a clases hijas a que 
	//implementen los métodos
	public abstract float calcularArea();
	
	public abstract float perimetro();
}
