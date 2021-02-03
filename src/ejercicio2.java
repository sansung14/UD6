import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		int A;
		int B;
	    Scanner teclado = new Scanner (System.in);
		System.out.println ("Introduce el primer numero a comenzar:");
	    A = teclado.nextInt();
	    System.out.println ("Introduce el ultimo numero a mostrar:");
	    B = teclado.nextInt();
	    aleatorio(A,B);
	}
	
	public static int aleatorio(int num1, int num2) {
		for(int i=num1;i<=num2;i++) {
		    System.out.println(i);
		}
		return num1;		
	}

}
