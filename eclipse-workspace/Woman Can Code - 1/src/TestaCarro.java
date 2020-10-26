
public class TestaCarro {
    public static void main(String[] args) {
        Carro meuCarro;
        meuCarro = new Carro();
        meuCarro.cor = "Verde";
        meuCarro.modelo = "Fusca";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 80;
        meuCarro.pegaMarcha();
       

        // liga o carro
        meuCarro.liga();

        // acelera o carro
        meuCarro.acelera(20);
        System.out.println("Minha velocidade é: " + meuCarro.velocidadeAtual);
        System.out.println("Minha marcha é: " + meuCarro.pegaMarcha());
    }
}
