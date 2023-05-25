package Exercicio1;

import java.util.Scanner;

public class FabricaLampada {

    private String tipoI;
    private String tipoF;

    public FabricaLampada(){
        this.tipoI="Incandesente";
        this.tipoF="Fluorescente";
    }
    Scanner scanner=new Scanner(System.in);
    public String getligar() {

        return "Lampada ligada";
    }
    public String getdesligar() {
        return "Lampada desligada";
    }
    public void getconstruir(){
        System.out.println("Qual lampada deseja criar?\n Digite 1-Incandesente ou 2-Fluorescente");
        int entrada=scanner.nextInt();

        if(entrada==1){
            System.out.println("Lampada "+tipoI+" criada");
        }
        else if (entrada==2) {
            System.out.println("Lampada "+tipoF+" criada");
        }
        else {
            System.out.println("Opcão invalida");
        }
    }
    public void getligarOuDesligar(){
        System.out.println("Você deseja ligar ou desligar a lampâda?\nDigete 1-para ligar, 2-para desligar");
        int entrada=scanner.nextInt();
        if(entrada==1){
            System.out.println(getligar());
        }
        else if (entrada==2) {
            System.out.println(getdesligar());
        }
        else {
            System.out.println("Você não ligou nem deslidou a lampada");
        }
    }
}
