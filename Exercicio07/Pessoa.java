package Exercicio07;

public class Pessoa {
    
    String nome;
    int idade;
    String cidade;

public Pessoa(String nome, int idade, String cidade){

    this.nome = nome;
    this.idade = idade;
    this.cidade = cidade;
}

    public void exibirDados(){

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Cidade: " + this.cidade);
    }
}
