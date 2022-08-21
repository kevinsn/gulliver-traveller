
import java.text.ParseException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Programa {

	public static void main(String[] args) throws ParseException {

		// Formato da data
		DateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
		
		// Aluguel
		Date dataRetirada = formatoData.parse("2022-08-14");
		Date dataDevolucao = formatoData.parse("2022-09-14");
		
		Aluguel aluguel = new Aluguel(1, "Tipo 1", dataRetirada, dataDevolucao, 107.0, 574.99);
				
		// Cliente		
		Date dataNascimento = formatoData.parse("2000-10-10");
		Endereco enderecoCliente = new Endereco(1, "12345-123", "SP", "São Paulo", "Vila Mariana", "Rua", "da Mariana", 170);
				
		Cliente cliente = new Cliente(1, "Kevin", dataNascimento, "11111111111", "11 98765-4321", "kevin@kevin.com", new java.util.Date(System.currentTimeMillis()), enderecoCliente);

		// Locadora
		Endereco enderecoLocadora = new Endereco(1, "12345-678", "SP", "São Paulo", "Paulista", "Rua", "das Palmeiras", 100);
		Avaliacao avaliacaoLocadora = new Avaliacao(1, "Muito bom", 10.0);
		
		Locadora locadora = new Locadora(1, "Loka Dora", "111111111111114", "gulliver.io.br/logo_123", enderecoLocadora, avaliacaoLocadora);

		// Veiculo
		Veiculo veiculo = new Veiculo(1, "Ferrari", "Spider", "Vermelho", "2022", "123456", "123456789", 100.0, "gulliver.io.br/img_veiculo_123");
		
	}

}
