package faculdade;

import java.util.Objects;

public class Dolar extends Moeda {
	double dolar;
	double valorConvertido;

	//construtor
	public Dolar(double dolar) {
		super(dolar);
		this.dolar = dolar;
	}
	
	//Conversão de string para aparecer as informações ao invés do local da memória.
	@Override
	public String toString() {
		return "Dolar - " + dolar;
	}
	
	//Gerar hashcode() e equals() para que o sistema possa diferenciar no método cofrinho.remover(moeda);
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(dolar);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dolar other = (Dolar) obj;
		return Double.doubleToLongBits(dolar) == Double.doubleToLongBits(other.dolar);
	}
	
	//Método para converter o dólar para real com a cotação atual.
	public double converter() {
		valorConvertido = dolar * 5;
		return valorConvertido;
	}
	
}
