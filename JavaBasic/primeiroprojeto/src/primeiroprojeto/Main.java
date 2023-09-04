package primeiroprojeto;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bem Vindo ao Screen Match");
		System.out.println("Filme: Top Gun: Maverick");
		
		int anoDeLancamento = 2022;
		System.out.println("Ano de Lançamento: "+ anoDeLancamento);
		boolean incluidoNoPlano = true;
		System.out.println(incluidoNoPlano);
		double notaDoFilme = 9.0;
		System.out.println(notaDoFilme);
		String filme = "Mavercik";
		System.out.println(filme);
		
		double nota1 = 6.3;
		double nota2 = 8.5;
		double nota3 = 7.0;
		
		double media = (nota1+nota2+nota3)/3;
		System.out.println(media);
		System.out.println(Math.floor(media));
		String mensagem = """
                Olá, mundo!
                Este é um Text Block.
                Ele permite escrever textos com múltiplas linhas
                sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                """;
		System.out.println(mensagem);
		
		
		int conversao = (int)(media);
		System.out.println(conversao);
		
		
		
	}

}
