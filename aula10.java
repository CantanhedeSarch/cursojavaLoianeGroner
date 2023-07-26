package cursobasicojava;

import java.util.Scanner;

public class Aula10Variaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);		
		String digitado;
		int idade;

		System.out.println("Olá, me deixe te conhecer. ");
		System.out.print("Me diga seu nome: ");
			digitado=entrada.next();
			System.out.println("Prazer em te conhecer " + digitado + ". Qual sua idade?");
			    idade=entrada.nextInt();
			    
			    if ( idade < 50 ) {
			         System.out.println("Então " + digitado + " você tem " +idade + " anos. Você esta na flor da idade. Aproveite a vida!"); }
			    
			    else { System.out.println("Então " + digitado + " você tem " +idade + " anos. Você esta ficando velho, tome cuidado, e faça exames regularmente!"); }

	}
	}


