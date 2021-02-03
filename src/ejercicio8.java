import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		int lista[];
		lista = Meter();
		Mostrar(lista);
	    
	}
	
	
	public static int[] Meter() {
		int num[]= new int[10];
	    Scanner teclado = new Scanner (System.in);
		for(int i=0;i<10;i++) {
			 System.out.println ("Introduce el numero:");
			 num[i] = teclado.nextInt();
		}
		return num;

	}
	
	public static void Mostrar(int[] num1) {
		for(int i=0;i<10;i++) {
			System.out.println ("Indice "+(i+1)+" = "+num1[i]);
		}
	}
	

}
