package primeiroprojeto;

import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double media = 0;
		double nota;
		
		for(int i = 0; i < 3; i++){
			System.out.println("Digite a nota dos Aluno");
			nota = leitura.nextDouble();
			media += nota;
			System.out.println(media);
			}
		double resultado = media/3;
		System.out.println("Media de notas: " + resultado);
	}
}
