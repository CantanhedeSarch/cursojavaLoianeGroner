package cursobasicojava;

public class Aula19Vetores_Arrays {

	public static void main(String[] args) {
		// estrutura de dados simples
		//lista ordenada de dados
		//problem: armazenar a temperatura diaria por 1 anoo
//digitar a variavel e dps adiciona o array
		
		double tempD000=31.3;
		double tempD001=31.3;
		double tempD002=32;
		double tempD003=33.7;
		double tempD004=34;
		double tempD005=35;
		double tempD006=32.8;
		
		double[]temperaturas = new double[365];
		
		temperaturas[0]=31.3;
		temperaturas[1]=31.3;
		temperaturas[2]=32;
		temperaturas[3]=33.7;
		temperaturas[4]=34;
		temperaturas[5]=35;
				System.out.println("o valor da temperatura do dia 2 é:" +temperaturas[2]);
				System.out.println("o tamanho do array: "+temperaturas.length);
				System.out.println("valores do array: "+temperaturas);
				
				for(int i=0;i<temperaturas.length; i++) {
					System.out.println("a temperatura do dia  "+ (i+1) + " é " +temperaturas[i]);
					
				}
				
	}

}
