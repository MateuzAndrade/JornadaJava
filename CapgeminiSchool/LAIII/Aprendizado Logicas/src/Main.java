public class Main {
    public static void main(String[] args)
    {

        int idade = 19;

        if ( idade >= 18){
            System.out.println("Pode Entrar na Festa");
            if (idade >= 18){
                System.out.println("Pode Utilizar o Bar");
            }
        } else {
            System.out.println("Não pode entrar na Festa");
        }
    }
}