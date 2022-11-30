package Pessoa;
public class PessoaFisica extends Pessoa {

    public String cpf;

    public PessoaFisica(String n, int i, String cpf){

        super(n, i);
        this.cpf = cpf;

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}
