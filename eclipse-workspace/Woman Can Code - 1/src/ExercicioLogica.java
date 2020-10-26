import java.util.Scanner;

public class ExercicioLogica {
	//inicialização do programa Java
	public static void main(String args[])
	{
		
		//chama e/ou cria Scanner para obter dados a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
        int local;
		
		
		System.out.print("Digite o primeiro número:   \n");
		number1 = input.nextInt();
		
		System.out.print("Digite o segundo número:    \n");
		number2 = input.nextInt();
		
		System.out.print("Digite o terceiro número:   \n");
		number3 = input.nextInt();
		
		 if (number1 > number2)
	    	   local = number1;
	       else
	    	   local = number2;
	       
	       if(local > number3)
	    	   System.out.printf("O número maior é: %d", local);
	       else
	           System.out.printf("O número maior é: %d", number3);
		
		
	}
	
}
