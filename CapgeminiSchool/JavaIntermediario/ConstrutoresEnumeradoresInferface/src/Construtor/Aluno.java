package Construtor;

public class Aluno {
    private double nota1;
    private double nota2;
    private double nota3;
    MATRICULA situacaoMatricula;

    public  Aluno (double nota1,double nota2,double nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public enum MATRICULA {
        MATRICULADO,
        PENDENTE,
        RECUSADO
    }

    public double calculoDeMedia() {
        double media = 0;
        media = (this.nota1+this.nota2+this.nota3)/3;
        if (media >= 7){
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
        System.out.print("O Valor da Média foi:");
        return media;
    }

    public enum STATUS{
        APROVADO,
        REPROVADO
    }
}
