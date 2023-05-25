package Exercicio2;

public class ContaCorrente implements Tributar{
    private double saldo;

    public ContaCorrente(){
        this.saldo=50.0;
    }
    @Override
    public double tributosDsContas() {
        return saldo*0.01;
    }
}
