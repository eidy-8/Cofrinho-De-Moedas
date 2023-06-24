package faculdade;

//Arraylist importado.
import java.util.ArrayList;

public class Cofrinho {
		//As moedas ficarão memorizadas no Arraylist.
		private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
		
		//O método receberá o parâmetro Moeda e será adicionado com o ".add".
		public void adicionar(Moeda c) {
			listaMoedas.add(c);
		}
		
		//O método removerá a partir de um objeto.
		public void remover(Moeda c) {
			listaMoedas.remove(c);
		}
		
		public void listagemMoedas() {
			//Para cada moeda c na listaMoedas haverá uma impressão na tela.
			for(Moeda c : listaMoedas) {
				System.out.println(c);
			}
		}
		
		//O método totalConvertido() irá calcular todas as moedas em memória já convertidas.
		public double totalConvertido() {
			double total=0;
			for(Moeda c : listaMoedas) {
				total += c.converter();
			}
			System.out.println(total);
			return total;
		}
		
	}
	


