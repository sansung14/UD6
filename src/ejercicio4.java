import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		int A;
	    Scanner teclado = new Scanner (System.in);
		System.out.println ("Introduce un numero:");
	    A = teclado.nextInt();
	    System.out.println(factorial(A));
	}

	public static int factorial(int num1) {
		int factorial = 1;
		while (num1!=0) {
			  factorial=factorial*num1;
			  num1--;
		}
		return factorial;
	}
}
