import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		double A;
		int B;
	    Scanner teclado = new Scanner (System.in);
		System.out.println ("Introduce la cantidad en euros a convertir:");
	    A = teclado.nextDouble();
	    System.out.println ("1. Dolares");
	    System.out.println ("2. Yenes");
	    System.out.println ("3. Libras");

	    System.out.println ("Introduce el numero de la moneda a convertir:");
	    B = teclado.nextInt();
	    moneda(A,B);
	    
	}
	
	public static void moneda(double num1, int num2) {
		double dolares = 1.20;
		double yenes = 126.305;
		double libras = 0.8811;
		switch (num2) {
		case 1:
			System.out.println(num1+" € són "+(num1*dolares)+" $");
			break;
		case 2:
			System.out.println(num1+" € són "+(num1*yenes)+" yenes");
			break;
		case 3:
			System.out.println(num1+" € són "+(num1*libras)+" libras");
			break;
		}
		
	}

}
