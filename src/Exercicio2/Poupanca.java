package Exercicio2;
public class Poupanca implements Tributar{
    private double saldo;

    public Poupanca(){
        this.saldo=600;
    }
    @Override
    public double tributosDsContas() {
        return 0;
    }
}