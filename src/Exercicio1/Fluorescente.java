package Exercicio1;
public class Fluorescente extends FabricaLampada implements Lampada{
    @Override
    public String getligar() {
        return "Lampada ligada";
    }
    @Override
    public String getdesligar() {
        return "Lampada desligada";
    }
}
