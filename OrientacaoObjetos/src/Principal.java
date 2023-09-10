
public class Principal {

	public static void main(String[] args) {
		Filme meuFilme = new Filme("Cronicas de Narnia",2005,true,0,0,0);
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(7);
		meuFilme.avalia(7.5);
		meuFilme.avalia(6.5);
		
		System.out.println(meuFilme.getSomaDasAvaliacao());
		System.out.println(meuFilme.getTotalDeAvaliacoes());
		System.out.println(meuFilme.mediaAvaliacoes());
			

	}

}
