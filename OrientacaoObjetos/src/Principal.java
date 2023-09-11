import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {

	public static void main(String[] args) {
		Filme meuFilme = new Filme();
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(7);
		meuFilme.avalia(7.5);
		meuFilme.avalia(6.5);
		meuFilme.setDuracaoEmMinutos(150);
		meuFilme.setNome("Rei Leão");
		Filme novoFilme = new Filme();
		novoFilme.setNome("Avatar");
		novoFilme.setDuracaoEmMinutos(200);

		System.out.println(meuFilme.getSomaDasAvaliacao());
		System.out.println(meuFilme.getTotalDeAvaliacoes());
		System.out.println(meuFilme.mediaAvaliacoes());

		System.out.println(meuFilme.getAnoDeLancamento());
		meuFilme.setAnoDeLancamento(2008);
		System.out.println(meuFilme.getAnoDeLancamento());

		
		
		
		Serie lost = new Serie();
		lost.setNome("Lost");
		lost.exibeFichaTecnica();
		lost.setTemporadas(11);
		lost.setEpisodeosPorTemporada(5);
		lost.setMinutosPorEpisodeo(50);
		System.out.println(lost.getDuracaoEmMinutos());
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(novoFilme);
		calculadora.inclui(lost);
		System.out.println(calculadora.getTempoTotal());
		

	}

}
