import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println ("Introduce la longitud del array:");
		int posiciones = teclado.nextInt();
		int lista[];
		lista = Meter(posiciones);
		System.out.println ("Introduce el digito final a mostrar:");
		int digito = teclado.nextInt();
		Mostrar(lista, posiciones, digito);

	}
	
	
	public static int[] Meter(int posiciones) {
		int num[]= new int[posiciones];
		for(int i=0;i<posiciones;i++) {
			 num[i] = (int)((Math.random() * 300)+1);

		}
		return num;

	}

	public static void Mostrar(int[] num1, int posiciones, int digito) {
		System.out.println ("Lista original: ");
		for(int i=0;i<posiciones;i++) {
			System.out.print (num1[i]+" ");
		}
		System.out.println ("");
		int[] lista = new int[posiciones];
		int contador = 0;
		for(int i=0;i<posiciones;i++) {
			if(num1[i]%10==digito) {
				lista[contador] = num1[i];
				contador++;
			}
		}
		System.out.println ("Lista difinitiva acabados en "+digito+":");
		for(int i=0;i<contador;i++) {
			System.out.print (lista[i]+" ");
		}
	}

}
