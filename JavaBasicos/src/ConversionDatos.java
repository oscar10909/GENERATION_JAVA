
public class ConversionDatos {
	public static void main(String[] args) {
		byte numeroByte = 10;
		short numeroShort = numeroByte;
		int numeroInt = numeroShort;
		long numeroLong = numeroInt;
		int otroInt = (int) numeroLong;
		short otroShort = (short) otroInt;
		
		short n1 = 123;
		short n2 = 7343;
		int n3 = 12;
		int n4 = 33;
		short suma = (short) (n1 + n2); //esto JAVA lo representa como tipo de dato int
		//a menos que le digamos lo contrario
		byte suma2 = (byte) (n3+n4);
		int suma3 = (n3+n4);
		short suma4 = (short) (n1+n3);
	}
}
