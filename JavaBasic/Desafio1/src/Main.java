import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		String cliente;
		String conta = "Corrente";
		String dadosConta;
		String opcoesSistema;
		int opcao = 0;
		double saldo = 0;
		
		System.out.println("""
				-------------------------------------
				------ BEM VINDO AO BANCO JAVA ------
				-------------------------------------
				*************************************
				Cadastro de Cliente em Conta Corrente
				*************************************
				Nome do Cliente:
				""");
		cliente = leitura.nextLine();
		System.out.println("Cadastro Realizado com SUCESSO!");
		
		dadosConta = ("""
				*************************************
				Cliente
				Nome:"""+cliente+"""
				
				Conta:"""+ conta +"""
				
				Saldo:R$"""+ saldo +"""
						
				*************************************
				""");
		
		System.out.print(dadosConta);
		
		opcoesSistema = ("""
				------------------------
				Opções
				
				1 - Visualizar Saldo
				2 - Saque
				3 - Deposito
				4 - Fechar Sistema
				------------------------
				""");
		
		while (opcao != 4) {
			System.out.println(opcoesSistema);
			opcao = leitura.nextInt();
			double valor;
			
			
			switch (opcao) {
			case 1:
				System.out.print("O saldo de sua Conta: R$ ");
				System.out.println(saldo);
				break;
			case 2:
				System.out.println("Informe o valor do saque");
				valor = leitura.nextDouble();
				if(saldo >= valor) {
					saldo -= valor;
					System.out.println("Novo saldo de sua conta é :R$ " + saldo);
				}else {
					System.out.println("Valor Invalido!");
				}

				break;
			case 3:
				System.out.println("Informe o valor a ser depositado");
				valor = leitura.nextDouble();
				
				if (valor >= 0) {
					saldo += valor;
					System.out.println("Novo saldo de sua conta é :R$ " + saldo);
				} else {
					System.out.println("Valor Invalido!");
				}
				break;
			case 4:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Digite uma Opção Válida");
				break;
			}
			
			
		}
		
		

		
		
	}

}
