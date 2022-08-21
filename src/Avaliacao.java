
public class Avaliacao {

	private int idAvaliacao;
	private String descricao;
	private Double nota;
	
	public Avaliacao() {
		
	}
	
	public Avaliacao(int idAvaliacao, String descricao, Double nota) {
		this.idAvaliacao = idAvaliacao;
		this.descricao = descricao;
		this.nota = nota;
	}
	
	public int getIdAvaliacao() {
		return idAvaliacao;
	}
	public void setIdAvaliacao(int idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}	
	
}
