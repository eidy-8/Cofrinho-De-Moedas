package faculdade;

//Scanner importado para que o usuário possa digitar no console.
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Menu principal para o usuário escolher uma das opções numeradas que aparecerá na tela do console.
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		//Cofrinho instanciado.
		Cofrinho cofrinho = new Cofrinho();
		
		System.out.println("Cofrinho:");
		System.out.println("1-Adicionar");
		System.out.println("2-Remover");
		System.out.println("3-Listar");
		System.out.println("4-Calcular");
		System.out.println("0-Encerrar");
		opcao=teclado.nextInt();
		
		int tipoMoeda=0;
		//Variável para referenciar.
		Moeda moeda;
		//Loop criado.
		while(opcao!=0) {
			
			switch(opcao) {
			
			//Caso o usuário escolha a opção 1, aparecerá 3 tipos de moedas para escolher adicionar no cofrinho.
			case 1:
				tipoMoeda=0;
				while(tipoMoeda>3 || tipoMoeda<=0) {
					System.out.println("Escolha Moeda:");
					System.out.println("1-Real");
					System.out.println("2-Euro");
					System.out.println("3-Dolar");
					tipoMoeda = teclado.nextInt();
				}
				//Para cada tipo de moeda que o usuário escolher, o sistema pedirá o valor da moeda que deseja inserir.
				moeda =null;
				if(tipoMoeda==1) {
					System.out.println("Digite o valor:");
					double real = teclado.nextDouble();
					moeda = new Real(real);
				}
				if(tipoMoeda==2) {
					System.out.println("Digite o valor:");
					double euro = teclado.nextDouble();
					moeda = new Euro(euro);
				}
				if(tipoMoeda==3) {
					System.out.println("Digite o valor:");
					double dolar = teclado.nextDouble();
					moeda = new Dolar(dolar);
				}
				
				//O método que adiciona moedas será chamado.
				cofrinho.adicionar(moeda);
					
				break;
			
				//Caso o usuário escolha a opção 2, aparecerá, como na opção 1, os 3 tipos de moedas para escolher remover do cofrinho.
			case 2:
				tipoMoeda=0;
				while(tipoMoeda>3 || tipoMoeda<=0) {
					System.out.println("Escolha Moeda:");
					System.out.println("1-Real");
					System.out.println("2-Euro");
					System.out.println("3-Dolar");
					tipoMoeda = teclado.nextInt();
				}
				//O usuário deve escolher o exato valor do tipo de moeda que deseja remover, para que o sistema possa identificar que deseja tirar o valor na memória do cofrinho.
				moeda =null;
				if(tipoMoeda==1) {
					System.out.println("Digite o valor:");
					double real = teclado.nextDouble();
					moeda = new Real(real);
				}
				if(tipoMoeda==2) {
					System.out.println("Digite o valor:");
					double euro = teclado.nextDouble();
					moeda = new Euro(euro);
				}
				if(tipoMoeda==3) {
					System.out.println("Digite o valor:");
					double dolar = teclado.nextDouble();
					moeda = new Dolar(dolar);
				}
				
				//O metódo que remove moedas será chamado.
				cofrinho.remover(moeda);
				
	
				break;
			case 3:
				//Caso o usuário escolha a opção 3, o método que lista todas as moedas com seus respectivos valores será chamado.
				cofrinho.listagemMoedas();
				
				break;
				
			case 4:
				//Caso o usuário escolha a opção 4, o método que mostra o total de moedas convertidas em real será chamado.
				cofrinho.totalConvertido();
				
				//Mensagem de erro caso o usuário digite um valor diferente definido em "opcao".
				break;
			default:
				System.out.println("Opcao Invalida!");
				
			}
			
			//O menu principal aparecerá novamente em loop se o usuário digitar valores não definidos.
			System.out.println("Cofrinho");
			System.out.println("1-Adicionar");
			System.out.println("2-Remover");
			System.out.println("3-Listar");
			System.out.println("4-Calcular");
			System.out.println("0-Encerrar");
			opcao=teclado.nextInt();
			
		}
	}
}


