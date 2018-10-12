package entities;

public class Tercerizado extends Empregado {

	private Double valorAdicional;

	public Tercerizado() {
		super();
	}

	public Tercerizado(String nome, Double valorHora, Integer horasTrab, Double valorAdicional) {
		super(nome, valorHora, horasTrab);
		this.valorAdicional = valorAdicional;
	}

	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	@Override
	public double pagamento() {
		return super.pagamento() + valorAdicional;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("Funcionário tercerizado.");
		return sb.toString();
	}
	
	

}
