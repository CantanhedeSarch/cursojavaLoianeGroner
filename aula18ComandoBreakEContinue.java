package cursobasicojava;

import java.util.Scanner;

public class Aula18ComandoBreakEContinue {

	public static void main(String[] args) {
		
		// break para sair do loop
		
		Scanner scan= new Scanner(System.in);
		 
		System.out.println("Entre com um número ");
		int num=scan.nextInt();
		System.out.println("Entre com um limite ");
		int max=scan.nextInt();
		
		for(int i = num; i<=max; i++) {
			System.out.println(i);
		
		 if( i % 7==0) {
			 System.out.println(" o valor de i é: " + i);
			 break;
			 
		 }
		}
	}
	
