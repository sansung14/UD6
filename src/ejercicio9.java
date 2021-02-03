import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
	    Scanner teclado = new Scanner (System.in);
		System.out.println ("Introduce la longitud del array:");
		int posiciones = teclado.nextInt();
		int lista[];
		lista = Meter(posiciones);
		Mostrar(lista, posiciones);
	    
	}
	
	
	public static int[] Meter(int posiciones) {
		int num[]= new int[posiciones];
		for(int i=0;i<posiciones;i++) {
			 num[i] = (int)(Math.random() * 9);
		}
		return num;

	}
	
	public static void Mostrar(int[] num1, int posiciones) {
		for(int i=0;i<posiciones;i++) {
			System.out.println ("Indice "+(i+1)+" = "+num1[i]);
		}
	}
	

}
