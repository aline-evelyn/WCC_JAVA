import javax.swing.JOptionPane;

public class CalculoIMC {
	
	public static void main(String args[]) {
		IMC a = new IMC();
		
		float ResultadoIMC;
		String peso = JOptionPane.showInputDialog("Digite o Peso");
		
		float peso = Float.parseFloat(peso);
		String altura = JOptionPane.showInputDialog("Digite a Altura");
		
		float altura = Float.parseFloat(altura);
		ResultadoIMC = a.CalculoImc(peso, altura);
		System.out.println(ResultadoIMC);
		
		if (ResultadoIMC <= 18.5)
			System.out.println("Abaixo do peso normal");
		
		if (18.5 < ResultadoIMC && ResultadoIMC <=25)
			System.out.println("Peso normal");
		
		if (25< ResultadoIMC && ResultadoIMC <= 30);
		System.out.println("Acima do peso normal");
		
		if (ResultadoIMC > 30)
			System.out.println("Obesidade");
			
	}

}
