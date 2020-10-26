import java.util.Scanner;


public class ContaToken {
	
	public void imprimiContaToken(String textoDigitado) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		textoDigitado = sc.nextLine();
		
		while(sc.hasNext() && i <5) {
			i++;
			
			System.out.println("Aqui está seu texto novo: " + textoDigitado);
			
		}
		sc.close();
	}

}
