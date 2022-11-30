package Exercicio02;
public class pessoa {

    private String nome;
    private String datanasc;
    private int ano;
    private double altura;
    public int anoatual;

    public pessoa(String nome, String datanasc, int ano, double altura) {

        this.nome = nome;
        this.datanasc = datanasc;
        this.ano = ano;
        this.altura = altura;
        anoatual = 2022;
        return;
    }

    public String getNome() {
        return nome;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public int getAno() {
        return ano;
    }

    public double getAltura() {
        return altura;
    }

    public void Total() {
        System.out.println("Seu nome é: " + getNome());
        System.out.println("Sua idade de nascimento é: " + getDatanasc() + "/" + getAno());
        System.out.println("Você tem ou irá ter esse Ano: " + (anoatual - getAno()) + " Anos");
        System.out.println("Sua altura é: " + getAltura());

    }
}
