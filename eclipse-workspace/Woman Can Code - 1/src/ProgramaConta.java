
public class ProgramaConta {
	  public static void main(String[] args) {
		  Conta minhaConta;
		  
	      minhaConta = new Conta();
	      
	      minhaConta.titular = "Aline";
	      minhaConta.saldo = 1000;
	      minhaConta.saca(1000.00);
	      minhaConta.deposita(1300.00);
	      
	      System.out.println("Saldo atual: " + minhaConta.saldo);
	      System.out.println("Titular: " + minhaConta.titular); 
	  }
	  
	    }


