package Exercicio02;
import java.util.Scanner;

public class registro {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite seu nome");
            String nome = scanner.nextLine();

            System.out.println("Digite o dia e mês de nascimento dd/MM");
            String datanasc = scanner.nextLine();

            System.out.println("Digite o ano de nascimento");
            int ano = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            pessoa pe = new pessoa(nome, datanasc, ano, altura);

            pe.Total();
        }
    }
}