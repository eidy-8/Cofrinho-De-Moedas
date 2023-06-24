package faculdade;

import java.util.Objects;

public class Euro extends Moeda {
	double euro;
	double valorConvertido;
	
	//construtor
	public Euro(double euro) {
		super(euro);
		this.euro = euro;
	}
	
	//Conversão de string para aparecer as informações ao invés do local da memória.
	@Override
	public String toString() {
		return "Euro - " + euro;
	}
	
	//Gerar hashcode() e equals() para que o sistema possa diferenciar no método cofrinho.remover(moeda);
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(euro);
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
		Euro other = (Euro) obj;
		return Double.doubleToLongBits(euro) == Double.doubleToLongBits(other.euro);
	}
	
	//Método para converter o euro para real com a cotação atual.
	public double converter() {
		valorConvertido = euro * 5.4;
		return valorConvertido;
	}

}
