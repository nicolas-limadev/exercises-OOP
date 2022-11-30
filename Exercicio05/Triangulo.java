package Exercicio05;

public class Triangulo {
    
    double altura;
    double base;

    public Triangulo(double altura, double base){

        this.altura = altura;
        this.base = base;
    }

    public double area(){

        double area = this.altura*this.base/2;
        return area;
    }
}
