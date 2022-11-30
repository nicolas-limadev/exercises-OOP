package Exercicio01;

public class Main{
    public static void main(String[] args) {
        
        Janela quadrado = new Janela("Quadrado");
        Janela triangulo = new Janela("Triangulo");

        System.out.println("Status Quadrado\n");
        quadrado.abrir();
        quadrado.maximizar();
        quadrado.minimizar();
        quadrado.fechar();

        System.out.println("\n\n");
        System.out.println("Status Triangulo\n");
        triangulo.fechar();
        triangulo.minimizar();
        triangulo.abrir();
        triangulo.maximizar();
        
    }
        
       
}