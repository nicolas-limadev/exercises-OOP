package Classes;

public class Ave extends Animal{

    public Ave() { 
    }

    public Ave(int i, String c, String n){ // construtor sobrecarregado
        super(i, c, n); // repassa os parâmetros para o construtor da classe pai
    }
    
    public void Ovo(){
        System.out.println("Ave.PorOvo");
    }
    
    public void Voar(){
        System.out.println("Ave.Voar");
    }
    
}
