import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		int A;
	    Scanner teclado = new Scanner (System.in);
		System.out.println ("Introduce un numero:");
	    A = teclado.nextInt();
	    System.out.println(primos(A));
	}
	
	public static boolean primos(int num1) {
		int contador = 2;
		boolean primo=true;
		while ((primo) && (contador!=num1)){
			if (num1 % contador == 0) {
		    	primo = false;
			}
			contador++;
		}
		return primo;
	}

}
