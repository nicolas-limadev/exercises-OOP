package Automovel;
public class Automovel {

    protected String marca;

    public Automovel(String marca) {

        this.marca = marca;
    }
    
    public void freiar(){
        System.out.println("Freiando " + marca + "...");
    }
}
