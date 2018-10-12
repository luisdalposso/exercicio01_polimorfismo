package entities;

public class Empregado {

	private String nome;
	private Double valorHora;
	private Integer horasTrab;

	public Empregado() {
	}

	public Empregado(String nome, Double valorHora, Integer horasTrab) {
		this.nome = nome;
		this.valorHora = valorHora;
		this.horasTrab = horasTrab;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Integer getHorasTrab() {
		return horasTrab;
	}

	public void setHorasTrab(Integer horasTrab) {
		this.horasTrab = horasTrab;
	}

	public double pagamento() {
		return valorHora * horasTrab;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("FUNCIONÁRIO: ");
		sb.append(nome + ", Horas Trabalhadas: ");
		sb.append(horasTrab + ", Valor da Hora: R$");
		sb.append(valorHora + "\n");
		sb.append("Ganhos totais:");
		sb.append(pagamento());
		return sb.toString();
	}

}
