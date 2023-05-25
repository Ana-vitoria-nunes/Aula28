package Exercicio2;
public class Main {
    public static void main(String[] args) {
        SeguroDeVida seguroDeVida=new SeguroDeVida();
        Poupanca poupanca=new Poupanca();
        ContaCorrente contaCorrente=new ContaCorrente();

        System.out.println("Tributo da conta corrente: "+contaCorrente.tributosDsContas());
        System.out.println("Tributo da conta poupança: "+poupanca.tributosDsContas());
        System.out.println("Tributo do seguro de vida: "+seguroDeVida.tributosDsContas());
    }
}
