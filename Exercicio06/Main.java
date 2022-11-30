package Exercicio06;

public class Main {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro("O homem", "Nicolau", 200);

        livro1.mostrar();

        System.out.println("===========");

        Livro livro2 = new Livro("A Mulher", "Nicole", 100);

        livro2.mostrar();

        System.out.println("===========");

        Livro livro3 = new Livro("A Dev", "Nicklima", 800);

        livro3.mostrar();

        System.out.println("===========");


    }
}
