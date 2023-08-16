package cursobasicojava;

public class Aula16LoopsWhileeDoWhile {

	public static void main(String[] args) {
		int i= 1; //pode ser usado tbm count ou cont
		
		int max=10;
		
		//comando while
		System.out.println("Iniciando contagem..." +max);
		
		while(i< max) {
			System.out.println("Valor de i: " +i);
			i++;// i=i+1; ou i+=1;
		}
		System.out.println("Valor final é " +i);//valor 11
		
		//a expressão de whilw diz que enquanto algo for verdadeiro ser executado o bloco de codigo e quando não ira parar
	
	
		//comando do-while
		//faça  algo enquanto a expressão for verdadeira
		
		do {i++;
			System.out.println("valor de i: " +i);
		}while(i < 15);
	System.out.println("Valor final é " +i);
	
	
	//while primeiro avalia a expressão e depois executa o bloco de codigo.
	//do-while primeiro executa o bloco de codigo e depois avalia a expressão 
	}
	

}
