package faculdade;

import java.util.Objects;

public class Real extends Moeda {
	double real;
	double valorConvertido;

	//construtor
	public Real(double real) {
		super(real);
		this.real = real;
	}
	
	//Conversão de string para aparecer as informações ao invés do local da memória.
	@Override
	public String toString() {
		return "Real - " + real;
	}
	
	//Gerar hashcode() e equals() para que o sistema possa diferenciar no método cofrinho.remover(moeda);
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(real);
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
		Real other = (Real) obj;
		return Double.doubleToLongBits(real) == Double.doubleToLongBits(other.real);
	}
	
	//Método com o real multiplicado por 1, só para deixar constatado que o real já é o valor correto.
	public double converter() {
		valorConvertido = real * 1;
		return valorConvertido;
	}
	
}
