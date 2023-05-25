package Exercicio2;

public class SeguroDeVida implements Tributar {

    private double saldo;

    public SeguroDeVida(){
        this.saldo=100;
    }
    @Override
    public double tributosDsContas() {
        return saldo*42;
    }
}