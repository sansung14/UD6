import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		int A;
		System.out.println ("1. Circulo:");
		System.out.println ("2. Triangulo:");
		System.out.println ("3. Cuadrado:");
		System.out.println ("Introduce el numero de la figura:");
	    Scanner teclado = new Scanner (System.in);
	    A = teclado.nextInt();
	    switch(A) {
	    	case 1:
	    		double radio;
	    		System.out.println ("Introduce el radio del circulo:");
	    	    radio = teclado.nextDouble();
	    		System.out.println ("El area del circulo és: "+circulo(radio));
	    		break;
	    	case 2:
	    		double base;
	    		double altura;
	    		System.out.println ("Introduce la base del triangulo:");
	    	    base = teclado.nextDouble();
	    	    System.out.println ("Introduce la altura del triangulo:");
	    	    altura = teclado.nextDouble();
	    		System.out.println ("El area del triangulo és: "+triangulo(base,altura));
	    		break;
	    	case 3:
	    		double lado;
	    		System.out.println ("Introduce el lado del cuadrado:");
	    	    lado = teclado.nextDouble();
	    		System.out.println ("El area del circulo és: "+cuadrado(lado));
	    		break;
	    }
	    	

	}
	
	
	public static double circulo(double num1) {
			double resultado=Math.pow(num1, 2)*Math.PI;
			return resultado;
	}
	
	public static double triangulo(double num1, double num2) {
		double resultado=(num1*num2)/2;
		return resultado;
	}
	
	public static double cuadrado(double num1) {
		double resultado=num1*num1;
		return resultado;
	}
	
}

