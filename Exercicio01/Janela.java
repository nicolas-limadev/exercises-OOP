package Exercicio01;

public class Janela {
    
    String nome;
    boolean aberto;
    boolean maximizado;

    public Janela(String nome){

        this.nome = nome;
        this.aberto = true;
        this.maximizado = true;
    }

    public void abrir(){

        if(this.aberto == true){
        System.out.println("Janela está Aberta");

        } else {
            this.aberto = true;
            System.out.println("Abrindo Janela..");
            System.out.println("Janela está Aberta");
        }
        
    }

    public void fechar(){

        if(this.aberto == false){
        System.out.println("Janela está Fechada");

        } else {
            this.aberto = false;
            System.out.println("Fechando Janela..");
            System.out.println("Janela está Fechada");
        }
    }

    public void maximizar(){
        
        if(this.maximizado == true){
        System.out.println("Janela está maximizada");

        } else {
            this.maximizado = true;
        System.out.println("Janela está maximizando..");
        System.out.println("Janela está maximizada");
        }

    }

    public void minimizar(){

        if(this.maximizado == false){
        System.out.println("Janela está minimizada");

        } else {
            this.maximizado = false;
        System.out.println("Janela está minimizando..");
        System.out.println("Janela está minimizada");

        }
    }
}
