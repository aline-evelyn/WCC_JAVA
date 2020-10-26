import java.util.Scanner;

public class Leitor {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print ( "Qual seu nome? ");
		String nome = leitor.next();
		System.out.print ( "Olá  " + nome + ", Qual a sua idade? ");
		String idade = leitor.next();
		System.out.print ( "Ah, então você tem " + idade + " anos " + nome + ".");

		
	}

}


