package herenciaypolimorfismo.animales;

public class Perro extends Animal implements Mascota, Jugar{

	@Override
	public void jugar() {
		System.out.println("Estoy jugando con la pelota");
		
	}

	@Override
	public void correr() {
		System.out.println("Estoy persiguiendo un auto");
	}

	@Override
	public void baniar() {
		System.out.println("No me gusta el agua");
	}

	@Override
	public void moverLaColita() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jugarConCaja() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ensuciarse() {
		// TODO Auto-generated method stub
		
	}
	
	

	

}
