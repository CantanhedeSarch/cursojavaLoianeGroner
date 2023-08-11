package cursobasicojava;

import java.util.Scanner;

public class Aula14CondicionaisIfeElse {

	public static void main(String[] args) {
		// if é uma condicional execultada quando verdadeira e else execultada caso if seja falso
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Qual sua idade? "); 
	int idade = entrada.nextInt() ;
		
		if(idade>=18) {
			System.out.println("Você é maior de idade!");
			
		}
		
		else {
			System.out.println("Não é maior de idade!");
		}
		
		
		
		
	}

}
