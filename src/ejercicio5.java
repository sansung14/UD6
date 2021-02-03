import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		int A;
	    Scanner teclado = new Scanner (System.in);
		System.out.println ("Introduce un numero:");
	    A = teclado.nextInt();
	    System.out.println(binario(A));
	}
	
	public static int binario(int num1) {
		int exp=0;
        int binario=0;
        int digito;
        while(num1!=0){
                digito = num1 % 2;           
                binario = (int) (binario + digito * Math.pow(10, exp));                                                   
                exp++;
                num1 = num1/2;
        }
        return binario;
	}

}
