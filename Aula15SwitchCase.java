package cursobasicojava;

import java.util.Scanner;

public class Aula15SwitchCase {

	public static void main(String[] args) {
		//Alternativa para varios if-else alinhados.
		

	Scanner entrada=new Scanner(System.in);
		
	System.out.println("Digite um dia da semana (1-7)");	
		int diaSemana= entrada.nextInt();
		
		/*if(diaSemana == 1 ) {
			System.out.println("Domingo");
		
		}else if(diaSemana == 2 ) {
			System.out.println("Segunda");
		
		}else if(diaSemana == 3) {
			System.out.println("Terça");
	
		}else if(diaSemana == 4) {
			System.out.println("Quarta");
	
		}else if(diaSemana == 5) {
			System.out.println("Quinta");
	
		}else if(diaSemana == 6) {
			System.out.println("Sexta");
	
		}else if(diaSemana == 7) {
			System.out.println("Sabado");
	
		}else {
			System.out.println("Não é uma dia da semana válido");
		}
		*/
	// agora a mesma coisa com switch case 
		
		switch(diaSemana) {
		case 1: System.out.println("Domingo"); break;//o break funciona como uma quebra da execução do bloco de código.
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("Terça"); break;
		case 4: System.out.println("Quarta"); break;
		case 5: System.out.println("Quinta"); break;
		case 6: System.out.println("Sexta"); break;
		case 7: System.out.println("Sabado"); break;
		default:System.out.println("Não é um dia da semana valido.");//Funciona como o else 
		
		
		}
		
	}

}
