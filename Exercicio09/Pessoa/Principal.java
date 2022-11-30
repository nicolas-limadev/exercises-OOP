package Pessoa;

public class Principal {
    public static void main(String[] args) {
        
        PessoaJuridica obj1 = new PessoaJuridica("Carlos", 50, "341341/342");
        PessoaFisica obj2 = new PessoaFisica("Nicolas", 10, "333.444.452.-42");

        System.out.println(obj1.n + " " + obj1.i + " " + obj1.getCnpj());
        System.out.println(obj2.n + " " + obj2.i +" " + obj2.getCpf());
    }
}
