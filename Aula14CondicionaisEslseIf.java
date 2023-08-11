package cursobasicojava;

import java.util.Scanner;

public class Aula14CondicionaisEslseIf {

	public static void main(String[] args) {
		//Ao fazer compras note os vaores Barato <= 10
		//10< valor<15- pedir desconto
		//15<valor<17-pesquisar mais
	   //>=17- muito caro

	Scanner entrada= new Scanner(System.in);	
		
		System.out.println("Declare o valor do produto para analise de preço."); 
	    	double preço=entrada.nextDouble();
			
		if(preço <= 10) {
					System.out.println("É barato, pode comprar!");
	
		} else if(preço >10 && preço<15) {
			System.out.println("Tente pedir um desconto.");
        
		}	else if(preço >15 && preço<17) {
			System.out.println("Pesquise em outras lojas.");
       
		}	else {
			System.out.println("Muito caro, corre daí. Esses valores são um assalto!!!!");
        }	
		

	}

}
