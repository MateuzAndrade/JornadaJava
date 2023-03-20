import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Pessoa objetoPessoa = new Pessoa();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu Nome");
        objetoPessoa.nome = leitor.next();
        System.out.println("Informe seu Peso");
        objetoPessoa.peso = leitor.nextFloat();
        System.out.println("Informe sua Altura");
        objetoPessoa.altura = leitor.nextFloat();

        System.out.println("Olá "+objetoPessoa.nome+" Seu IMC é:"+objetoPessoa.calcularIMC());

    }
}