package cursobasicojava;

public class Aula17LoopFOR_MaisVariaveis {

	public static void main(String[] args) {
		//no caso de mais variaveis é separado por virgula.
		//nesse caso é determinado que o bloco continuara sendo executado enquanto i<j.

		for(int i=0, j=10 ; i<j ; i++, j-- ) {
			
			System.out.println("i= " +i + " ; j= "+j );
		}
		
	}

}
