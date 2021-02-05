import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println ("Introduce la longitud de los 2 arrays:");
		int posiciones = teclado.nextInt();
		int lista[];
		int lista2[];
		lista = Meter(posiciones);
		lista2 = lista;		
		lista = Meter(posiciones);
		Mostrar(lista, lista2, posiciones);
	    
	}
	
	
	public static int[] Meter(int posiciones) {
		int num[]= new int[posiciones];
		for(int i=0;i<posiciones;i++) {
			 num[i] = (int)(Math.random() * 9);
		}
		return num;

	}
	
	public static void Mostrar(int[] num1,int[] num2, int posiciones) {
		int array[]= new int[posiciones];
		System.out.println ("Lista 1:");
		for(int i=0;i<posiciones;i++) {
			array[i]=num1[i]*num2[i];
			System.out.print (num1[i]+" ");
		}
		System.out.println ("");
		System.out.println ("Lista 2:");

		for(int i=0;i<posiciones;i++) {
			array[i]=num1[i]*num2[i];
			System.out.print (num2[i]+" ");
		}
		System.out.println ("");
		System.out.println ("Lista multiplicada:");
		for(int i=0;i<posiciones;i++) {
			array[i]=num1[i]*num2[i];
			System.out.print (array[i]+" ");
		}
	}
}


