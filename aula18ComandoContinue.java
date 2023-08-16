package cursobasicojava;

import java.util.Scanner;

public class Aula18ComandoContinue {

	public static void main(String[] args) {
		// o continue ele continua o loop

		Scanner scan= new Scanner(System.in);
		 
		System.out.println("Entre com um número ");
		int num=scan.nextInt();
		System.out.println("Entre com um limite ");
		int max=scan.nextInt();
		
		for(int i = num; i<=max; i++) {
			System.out.println(i);
		
		 if( i % 7==0) {
			 continue;
		 }
		 
		 System.out.println(" o valor de i é: " + i);
		}
	}

}
