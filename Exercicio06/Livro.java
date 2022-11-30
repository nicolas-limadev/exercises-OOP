package Exercicio06;

public class Livro {
    
    private String titulo;
    private String autor;
    private int numeropag;


    public Livro(String titulo, String autor, int numeropag){

        this.titulo = titulo;
        this.autor = autor;
        this.numeropag = numeropag;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeropag() {
        return numeropag;
    }

    public void mostrar(){

        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Number of Pages: " + numeropag);
    }
}
