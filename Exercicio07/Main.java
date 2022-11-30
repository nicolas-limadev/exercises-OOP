package Exercicio07;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Nicolas", 19, "Alagoinhas");
        Cliente cliente = new Cliente("Nicolas", 18, "Salvador", "000.000.000-32");
        Funcionario funcionario = new Funcionario("Raphael", 50, "Toronto", 12722);

        pessoa.exibirDados();
        System.out.println("============");
        cliente.exibirDados();
        System.out.println("============");
        funcionario.exibirDados();
        System.out.println("============");
    }
}
