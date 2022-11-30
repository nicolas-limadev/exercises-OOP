package Exercicio03;

public class Main {
    public static void main(String[] args) {

        User usuarioA = new User();

        usuarioA.SetFname("Nicolas");
        usuarioA.SetLname("Batista");

        System.out.println(usuarioA.getFname() + " " + usuarioA.getLname());

        User usuarioB = new User();

        usuarioB.SetFname("Gabriel");
        usuarioB.SetLname("Souza");

        System.out.println(usuarioB.getFname() + " " + usuarioB.getLname());
    }

}
