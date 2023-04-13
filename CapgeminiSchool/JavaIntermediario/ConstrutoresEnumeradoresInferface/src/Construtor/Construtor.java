package Construtor;

public class Construtor {
    public static void main(String[] args) {

        Aluno Jose = new Aluno(8,3,7);
        double resultado = Jose.calculoDeMedia();
        System.out.println(resultado);

    }
}
