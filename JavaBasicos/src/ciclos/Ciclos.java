package ciclos;

public class Ciclos {
	public static void main(String[] args) {
		int control = 0;
		while(control < 10) {
			System.out.println("Control = "+control);
			control++;
		}
		
		int control1 = 3;
		do {
			System.out.println("Control = "+control1);
			control1++;
		}while(control1 < 3);
		
		for(int i=0;i<3;i++) {
			System.out.println("Control = "+i);
		}
		
		//break & continue
		for(int i=0;i<10;i++) {
			if(i%2 == 0) {
				System.out.println("Control = "+i);
				break;
			}
		}
		
		for(int i=0;i<10;i++) {
			if(i%2 == 0) {
				continue;
			}
			System.out.println("Control = "+i);
		}
		for(int i=0;i<3;i++) {
			System.out.println("Control = "+i);
			continue;
		}
	}
}
