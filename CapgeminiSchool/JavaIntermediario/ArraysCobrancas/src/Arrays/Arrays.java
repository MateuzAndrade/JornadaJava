package Arrays;

public class Arrays {
    public static void main(String[] args) {
        //Iniciando o Array
        int [] number = {1,2,3,4};
        //Passando o array item a item
        for (int contador = 0 ;contador < number.length; contador ++) {
            System.out.println(number[contador]);
        }
        // Exemplo de Array de string
        String [] names = {"Mateus","Carlos","Jose"};
        //Passando o array item a item
        for( int i = 0 ; i < names.length; i ++){
            System.out.println(names[i]);
        }

    }
}