package Construtor;
public class Construtor {
    public static void main(String[] args) {

        Aluno Jose;
        Jose = new Aluno(8,6,7);
        double resultado = Jose.calculoDeMedia();
        System.out.println(resultado);
        Jose.situacaoMatricula = Aluno.MATRICULA.MATRICULADO;
        System.out.println("O Aluno está: " + Jose.situacaoMatricula);

    }
}
