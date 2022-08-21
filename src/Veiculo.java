
public class Veiculo {

	private int idVeiculo;
	private String marca;
	private String modelo;
	private String cor;
	private String ano;
	private String placa;
	private String chassi;
	private Double km;
	private String imagem;
	
	public Veiculo() {
		
	}
	
	public Veiculo(int idVeiculo, String marca, String modelo, String cor, String ano, String placa, String chassi,
			Double km, String imagem) {
		this.idVeiculo = idVeiculo;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.placa = placa;
		this.chassi = chassi;
		this.km = km;
		this.imagem = imagem;
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public Double getKm() {
		return km;
	}

	public void setKm(Double km) {
		this.km = km;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
}
