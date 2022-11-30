package Pessoa;

public class PessoaJuridica extends Pessoa {
    
    public String cnpj;

    public PessoaJuridica(String n, int i, String cnpj){

        super(n, i);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
}
