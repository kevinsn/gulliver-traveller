
public class Locadora {

	private static int contador = 1;
	private int idLocadora;
	private String nome;
	private String cnpj;
	private String logo;
	private Endereco endereco;
	private Avaliacao avaliacao; 
	
	public Locadora() {
		idLocadora = contador; 
		contador++;		
	}
	
	public Locadora(String nome, String cnpj, String logo, Endereco endereco, Avaliacao avaliacao) {
		this.idLocadora = contador;
		this.nome = nome;
		this.cnpj = cnpj;
		this.logo = logo;
		this.endereco = endereco;
		this.avaliacao = avaliacao;
		contador++;
	}

	public int getIdLocadora() {
		return idLocadora;
	}

	public void setIdLocadora(int idLocadora) {
		this.idLocadora = idLocadora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
		
}
