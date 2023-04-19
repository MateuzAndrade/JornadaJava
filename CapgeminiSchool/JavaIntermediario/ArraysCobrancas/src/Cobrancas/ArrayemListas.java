package Cobrancas;

import java.util.ArrayList;

public class ArrayemListas {
    public static void main(String[] args) {
        ArrayList carros = new ArrayList<>();
        ArrayList number = new ArrayList<>();


        //adicionando itens
        carros.add("Celta");
        carros.add("Fox");
        carros.add("Kombi");
        System.out.println(carros);
        
        for (int contador = 0 ; contador < carros.size(); contador ++){
            System.out.println(carros.get(contador));
        }

        carros.remove(0);
        System.out.println(carros);

        carros.remove("Fox");
        System.out.println(carros);

        carros.clear();
        System.out.println(carros);

    }
}