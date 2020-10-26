import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);
		  System.out.println("Qual a sua linguagem preferida? ");
		  String linguagem = entrada.nextLine();
		  switch (linguagem) {
		     case "Java":
		       System.out.println("Melhor escolha! Essa linguagem é orientada a objetos!");
		      break;
		     case "C":
		       System.out.println("Esse linguagem é estruturada!");
		      break;
		     default:
		       System.out.println("Linguagem inválida");
		  }
		}

}
