package Automovel;
public class Carro extends Automovel {


    public Carro(String marca){

        super(marca);
    }

    public void OutroMetodo(){
        System.out.println("Funciona outro metodo");
    }

    @Override
    public void freiar(){
        super.freiar();
        System.out.println("Pisando no pedal do freio!");
    }
}
