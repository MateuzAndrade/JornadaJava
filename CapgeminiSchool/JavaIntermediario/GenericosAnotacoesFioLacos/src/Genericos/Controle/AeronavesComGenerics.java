package Genericos.Controle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AeronavesComGenerics<T> {
    private List<T> listaAeronaves = new ArrayList();

    public void addVoo(T nrVoo){
        //ListaAeronaves.add
        listaAeronaves.add(nrVoo);
    }
    public T primeiroVoo(){
        if (listaAeronaves.isEmpty()) {
            throw new IllegalStateException("List is Empty");
        }
        return  listaAeronaves.get(0);
    }
    public void listaVoos(){
        System.out.print("[");
        if (!listaAeronaves.isEmpty()){
            System.out.println(listaAeronaves.get(0));
        }
        for (int i = 1; i < listaAeronaves.size(); i++){
            System.out.println(" " + listaAeronaves.get(i));
        }
        System.out.print("]");
    }

}
