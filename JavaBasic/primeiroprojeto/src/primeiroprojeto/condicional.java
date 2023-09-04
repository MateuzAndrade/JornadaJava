package primeiroprojeto;

public class condicional {

	public static void main(String[] args) {
		int idade = 28;
		boolean vivo = true;
		
		if (idade >= 18 && vivo) {
			System.out.println("Maior de 18 anos, acesso LIBERADO.");
		}if(idade < 18 && vivo) {
			System.out.println("Menor de 18 anos, acesso NEGADO.");
		}
		
		int dia = 1;
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");			
			break;
		case 2:
			System.out.println("Segunda Feira");

		default:
			System.out.println("ERRO DIA INVALIDO");
			break;
		}

	}
}
