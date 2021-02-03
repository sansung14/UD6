import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		int A;
	    Scanner teclado = new Scanner (System.in);
		System.out.println ("Introduce un numero:");
	    A = teclado.nextInt();
	    System.out.println("Cifras de "+A+" = "+cifras(A));
	}
	
	public static int cifras(int num1) {
		int length = String.valueOf(num1).length();
		return length;
		
	}

}
