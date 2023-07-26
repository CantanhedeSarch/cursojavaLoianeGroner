package cursobasicojava;

import java.util.Scanner;

public class Aula12LeituraDeDados {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Olá, qual seu nome completo? ");
		  String seunome=entrada.nextLine();
		  
		  	System.out.println("Olá " +seunome+ ", é um prazer te conhecer");
		    
       	System.out.println("me diga como gosta de ser chamado: ");
			  String apelido =entrada.next();
			  
			  	System.out.println( apelido+ ", então te chamarei assim.");
			  	
		System.out.println("Me conte mais sobre você " +apelido+ ", qual sua idade? ");
		   int idade =entrada.nextInt();//é necessário colocar observação no front que é apenas numeros.
		 
		    int ano = 2023;
			int nascimento = ano - idade;
		   
		   System.out.println( apelido+ " então você é de " +nascimento );
		   
		   
		   System.out.println("Fala mais " +apelido+ ", qual sua altura? ");
		     double altura =entrada.nextDouble();
		     System.out.println( apelido+ " você tem " +altura+ "de altura.");
			    
		     
	}

}
