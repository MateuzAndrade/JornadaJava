
public class Filme {
	//Inserir caracteristicas comuns a todos os filmes
	//Objetos é a referencia para a construção de um item
	
	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double avaliacao;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;
	
	Filme(String nome, int anoDeLançamento, boolean incluidoNoPlano, double avaliacao, int totalDeAvaliacoes,int duracaoEmMinutos){
		this.nome = nome;
		this.anoDeLancamento = anoDeLançamento;
		this.incluidoNoPlano = incluidoNoPlano;
		this.avaliacao = avaliacao;
		this.totalDeAvaliacoes = totalDeAvaliacoes;
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	void exibeFichaTecnica() {
		
		System.out.println("Nome do Filme: " + nome);
		System.out.println("Ano de Lançamento: " + anoDeLancamento);
	}
}
