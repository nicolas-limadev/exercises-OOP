package Automovel;
public class Moto extends Automovel {
    
    public Moto(String marca){

        super(marca);
    }
    
    @Override
    public void freiar(){
        super.freiar();
        System.out.println("Pisando na marcha da direita");
    }
}
