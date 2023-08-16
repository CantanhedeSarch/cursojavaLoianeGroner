package cursobasicojava;

public class Aula17LoopFor_ParteAusentes {

	public static void main(String[] args) {
		
		// variaveis ausentes usando count e cont
		 
		int count=0;
		
		for(; count <10 ;) {
			System.out.println("valor de count: " + count);
			count += 2;
		}
		
		//mesma coisa
		
		for(int cont=0;cont<10 ;cont+=2 ) {
			System.out.println("valor de cont: " + cont);
			
		}
	}

}
