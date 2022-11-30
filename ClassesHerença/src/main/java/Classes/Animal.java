package Classes;

public class Animal {
    // atributos
    private int idade;
    private String cobertura;
    private String nome;
    
    // construtor
    public Animal(){ // construtor padrão
        
    }
    public Animal(int i, String c, String n){ // construtor sobrecarregado
        idade = i;
        cobertura = c;
        nome = n;
    }
    
    public Animal(int i){ // construtor sobrecarregado
        idade = i;
        cobertura = "Pelos";
        nome = "Joao";
    }
   
    // métodos

    public int getIdade() {
        return idade;
    }

    public String getCobertura() {
        return cobertura;
    }

    public String getNome() {
        return nome;
    }
    
}
