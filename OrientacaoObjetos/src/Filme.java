
public class Filme {
	// Inserir caracteristicas comuns a todos os filmes
	// Objetos é a referencia para a construção de um item

	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacao;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public double getSomaDasAvaliacao() {
		return somaDasAvaliacao;
	}

	public void setSomaDasAvaliacao(double somaDasAvaliacao) {
		this.somaDasAvaliacao = somaDasAvaliacao;
	}

	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}

	public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
		this.totalDeAvaliacoes = totalDeAvaliacoes;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	Filme(String nome, int anoDeLançamento, boolean incluidoNoPlano, double avaliacao, int totalDeAvaliacoes,
			int duracaoEmMinutos) {
		this.nome = nome;
		this.anoDeLancamento = anoDeLançamento;
		this.incluidoNoPlano = incluidoNoPlano;
		this.totalDeAvaliacoes = totalDeAvaliacoes;
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	void exibeFichaTecnica() {

		System.out.println("Nome do Filme: " + nome);
		System.out.println("Ano de Lançamento: " + anoDeLancamento);
	}

	void avalia(double nota) {
		somaDasAvaliacao += nota;
		totalDeAvaliacoes ++;
	}
	
	double mediaAvaliacoes() {
		return somaDasAvaliacao/totalDeAvaliacoes;
	}
	
}
