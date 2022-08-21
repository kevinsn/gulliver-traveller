
public class Avaliacao {

	private static int contador = 1;
	private int idAvaliacao;
	private String descricao;
	private Double nota;
	
	public Avaliacao() {
		idAvaliacao = contador; 
		contador++;
		
	}
	
	public Avaliacao(String descricao, Double nota) {
		this.idAvaliacao = contador; 
		this.descricao = descricao;
		this.nota = nota;
		contador++;
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
