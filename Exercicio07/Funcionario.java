package Exercicio07;

public class Funcionario extends Pessoa{
    
    int matricula;

    public Funcionario(String nome, int idade, String cidade, int matricula) {
        super(nome, idade, cidade);
        
        this.matricula = matricula;
    }

    public void exibirDados(){
        super.exibirDados();
        System.out.println("Matricula: " + matricula);
    }

}
