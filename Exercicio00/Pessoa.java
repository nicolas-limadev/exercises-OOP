package Exercicio00;

public class Pessoa {

    private String nome;
    private int idade;
    private double peso;
    int num;


    public Pessoa(int num, String nome, int idade, double peso){


        this.num = num;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void setPessoa(String pessoa) {

        this.nome = pessoa.toUpperCase();
    }

    public int getNum() {
        return num;
    }
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }
    
    public void apresentarpessoa(){

        System.out.println("id: " + num);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }
}
