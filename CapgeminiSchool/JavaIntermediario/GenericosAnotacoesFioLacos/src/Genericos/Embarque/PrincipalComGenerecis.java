package Genericos.Embarque;
import Genericos.Controle.AeronavesComGenerics;
import java.util.Scanner;

public class PrincipalComGenerecis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AeronavesComGenerics<String> air = new AeronavesComGenerics<>();
        System.out.println("Informe o Número de Aeronaves");
        int nrAeronaves = sc.nextInt();

        //adicionando voos
        for (int i = 0; i < nrAeronaves; i++){
            String nrVoo = sc.next();
            air.addVoo(nrVoo);
        }

        air.primeiroVoo();
        String x = (String) air.primeiroVoo();
        System.out.println("O Primeiro a Decolar é o Voo:" + x);
        air.listaVoos();
        sc.close();

    }
}
