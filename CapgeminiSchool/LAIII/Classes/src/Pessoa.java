import java.sql.SQLOutput;

public class Pessoa {
    String nome;
    float peso;
    float altura;

    public float calcularIMC()
    {
        float IMC;
        IMC = peso / (altura*altura);
        if (IMC >= 35){
            System.out.println("Obesidade de II Grau");
        }
        return  IMC;
    }
}
