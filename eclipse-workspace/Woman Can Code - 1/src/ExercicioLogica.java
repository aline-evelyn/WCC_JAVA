import java.util.Scanner;

public class ExercicioLogica {
	//inicializa��o do programa Java
	public static void main(String args[])
	{
		
		//chama e/ou cria Scanner para obter dados a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
        int local;
		
		
		System.out.print("Digite o primeiro n�mero:   \n");
		number1 = input.nextInt();
		
		System.out.print("Digite o segundo n�mero:    \n");
		number2 = input.nextInt();
		
		System.out.print("Digite o terceiro n�mero:   \n");
		number3 = input.nextInt();
		
		 if (number1 > number2)
	    	   local = number1;
	       else
	    	   local = number2;
	       
	       if(local > number3)
	    	   System.out.printf("O n�mero maior �: %d", local);
	       else
	           System.out.printf("O n�mero maior �: %d", number3);
		
		
	}
	
}
