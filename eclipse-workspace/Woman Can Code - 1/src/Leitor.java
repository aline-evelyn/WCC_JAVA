import java.util.Scanner;

public class Leitor {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print ( "Qual seu nome? ");
		String nome = leitor.next();
		System.out.print ( "Ol�  " + nome + ", Qual a sua idade? ");
		String idade = leitor.next();
		System.out.print ( "Ah, ent�o voc� tem " + idade + " anos " + nome + ".");

		
	}

}


