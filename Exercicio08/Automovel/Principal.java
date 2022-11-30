package Automovel;
import java.util.Scanner;



public class Principal {
    
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        Automovel obj1 = null;
        Automovel obj2 = null;

        System.out.println("Escreva o nome da marca: ");
        String marca = lerString();
        
        obj1 = new Carro(marca);
        obj2 = new Moto(marca);
        
        System.out.println("Escreva 1 pra Carro: ");
        System.out.println("Escreva 2 pra Moto: ");
        int numero = lerInt();

        if( numero == 1){
            
            System.out.println("Vc selecionou Carro!");
            obj1.freiar();

        } else if(numero == 2){

            System.out.println("Vc selecionou Moto!");
            obj2.freiar();

        }
        
    }

    public static String lerString(){

        try (Scanner leitor = new Scanner(System.in)) {
            String texto = leitor.next();
            return texto;
        }
    }

    public static int lerInt(){

        try (Scanner leitor = new Scanner(System.in)) {
            int num = leitor.nextInt();
            return num;
        }
    }
}
