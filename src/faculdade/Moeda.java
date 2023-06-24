package faculdade;

//Objects importado.
import java.util.Objects;

//Classe abstrata para não ser instanciada.
public abstract class Moeda {
	double valor;
	double valorConvertido;
	
	//Gerar hashcode() e equals() para que o sistema possa diferenciar no método cofrinho.remover(moeda).
	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	//Construtor criado
	public Moeda(double valor) {
		super();
		this.valor = valor;
	}
	
	public double converter() {
		return valorConvertido;
	}
	
	}




