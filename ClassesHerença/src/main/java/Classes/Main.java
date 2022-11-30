package Classes;

public class Main {
    
    public static void main(String[] args) {
        
        Animal animal = new Animal(12, "Pelos", "Felix");

        System.out.println("Nome: " + animal.getNome());
        System.out.println("Idade: " + animal.getIdade());
        System.out.println("Cobertura: " + animal.getCobertura());

        Mamifero cachorro = new Cachorro();

        cachorro.Nascer();

        Ave galinha = new Galinha();

        galinha.Ovo();
        galinha.Voar();

    }
}
