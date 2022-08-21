
import java.util.Date;

public class Cliente {

	private int idCliente;
	private String nome;
	private Date dataNascimento;
	private String cpf;
	private String celular;
	private String email;
	private Date dataCriacao;
	private Endereco endereco;
	
	public Cliente() {
		
	}	

	public Cliente(int idCliente, String nome, Date dataNascimento, String cpf, String celular, String email,
			Date dataCriacao, Endereco endereco) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.celular = celular;
		this.email = email;
		this.dataCriacao = dataCriacao;
		this.endereco = endereco;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
		
}
