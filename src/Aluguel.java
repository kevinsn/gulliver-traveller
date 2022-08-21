
import java.util.Date;

public class Aluguel {

	private static int contador = 1;
	private int idAluguel;
	private String tipoAluguel;
	private Date dataRetirada;
	private Date dataDevolucao;
	private Double kmRodado;
	private Double valor;	
	
	public Aluguel() {
		idAluguel += contador;
		contador++;
	}
	
	public Aluguel(String tipoAluguel, Date dataRetirada, Date dataDevolucao, Double kmRodado,
			Double valor) {
		this.idAluguel += contador;
		this.tipoAluguel = tipoAluguel;
		this.dataRetirada = dataRetirada;
		this.dataDevolucao = dataDevolucao;
		this.kmRodado = kmRodado;
		this.valor = valor;
		contador++;
	}

	public int getIdAluguel() {
		return idAluguel;
	}

	public void setIdAluguel(int idAluguel) {
		this.idAluguel = idAluguel;
	}

	public String getTipoAluguel() {
		return tipoAluguel;
	}

	public void setTipoAluguel(String tipoAluguel) {
		this.tipoAluguel = tipoAluguel;
	}

	public Date getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Double getKmRodado() {
		return kmRodado;
	}

	public void setKmRodado(Double kmRodado) {
		this.kmRodado = kmRodado;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
