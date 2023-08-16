package cursobasicojava;

public class Aula18ComandoBreakEContinue_GoTo {

	public static void main(String[] args) {
		// go to não é boas praticas
//rotulos são apenas identificações de blocos de codigos
		
		for(int i=0; i<=4; i++) {
			rot1:{
				rot2:{
					rot3:{
						if(i==1) {
							break rot1;
						}
						if(i==2) {
							break rot2;
					}
						if(i==3) {
							break rot3;
				}
						System.out.println("rotulo3");
			}
					System.out.println("rotulo2");		
		}
				System.out.println("rotulo1");
				
			}
			System.out.println(i);
		}
	}}
