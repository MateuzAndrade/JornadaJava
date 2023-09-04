package primeiroprojeto;

import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		System.out.println("Digite seu nome");
		Scanner leitura = new Scanner(System.in);
		String nome = leitura.nextLine();
		System.out.println(nome);
	}
}
