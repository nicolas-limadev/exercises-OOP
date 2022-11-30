package Exercicio07;

public class Cliente extends Pessoa {
    
    String cpf;

    public Cliente(String nome, int idade, String cidade, String cpf) {
        super(nome, idade, cidade);
        this.cpf = cpf;
    }

    public void exibirDados(){
        super.exibirDados();
        System.out.println("CPF: " + cpf);
    }
}
