package Exercicio05;

public class Main {
    public static void main(String[] args) {

        Triangulo triangulo1 = new Triangulo(2, 4);

        System.out.println("Área do primeiro triângulo: " + triangulo1.area());

        Triangulo triangulo2 = new Triangulo(4, 8);

        System.out.println("Área do segundo triângulo: " + triangulo2.area());

        Triangulo triangulo3 = new Triangulo(8, 16);

        System.out.println("Área do terceiro triângulo: " + triangulo3.area());

    }
}
