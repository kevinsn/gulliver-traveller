
import java.text.ParseException;
import java.awt.HeadlessException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.JOptionPane;

public class Programa {

	DateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");	
	String resposta = "";
	static String[] tipoCadastro = {"Aluguel", "Endereço", "Cliente", "Avaliação", "Locadora", "Veiculo"};
	HashSet<String> cpfs = new HashSet<String>();
	
	public void cadastrarAluguel() throws HeadlessException, NumberFormatException, ParseException {
		// Aluguel
		ArrayList<Aluguel> listAluguel = new ArrayList<Aluguel>();
		do {        	
			listAluguel.add(
				new Aluguel(
						JOptionPane.showInputDialog("Digite o tipo de aluguel: "),
						formatoData.parse(JOptionPane.showInputDialog("Digite a sua data de retirada: ")),
						formatoData.parse(JOptionPane.showInputDialog("Digite a sua data de devolução: ")),
						Double.valueOf(JOptionPane.showInputDialog("Digite o km rodado: ")),
						Double.valueOf(JOptionPane.showInputDialog("Digite o valor: "))
						)
				);
			
			resposta = JOptionPane.showInputDialog("Digite <S> para continuar").toUpperCase();
		} while (resposta.equals("S"));
		
		listAluguel.forEach(
			item->System.out.println(
					"Tipo de Aluguel: " + item.getTipoAluguel() +
					"\ndataRetirada: " + item.getDataRetirada() +
					"\ndataDevolucao: " + item.getDataDevolucao() +
					"\nkmRodado: " + item.getKmRodado() +
					"\nvalor: " + item.getValor()
					)
			);      
	}
	
	public void cadastrarEndereco() {
		// Endereco	
		ArrayList<Endereco> listEndereco = new ArrayList<Endereco>();
		do {        	
			listEndereco.add(
				new Endereco(
						JOptionPane.showInputDialog("Digite o CEP: "),
						JOptionPane.showInputDialog("Digite o estado: "),
						JOptionPane.showInputDialog("Digite a cidade: "),
						JOptionPane.showInputDialog("Digite o bairro: "),
						JOptionPane.showInputDialog("Digite o tipo de logradouro: "),
						JOptionPane.showInputDialog("Digite o logradouro: "),
						Integer.valueOf(JOptionPane.showInputDialog("Digite o numero: "))
						));
			
			resposta = JOptionPane.showInputDialog("Digite <S> para continuar").toUpperCase();
		} while (resposta.equals("S"));
		
		listEndereco.forEach(
			item->System.out.println(
					"O CEP é: " + item.getCep() +
					"\nuf: " + item.getUf() +
					"\ncidade: " + item.getCidade() +
					"\nbairro: " + item.getBairro() +
					"\ntipoLogradouro: " + item.getTipoLogradouro() +
					"\nlogradouro: " + item.getLogradouro()+
					"\nnumero: " + item.getNumero()
					)
			); 
	}
	
	public void cadastrarCliente() throws HeadlessException, ParseException {
		// Cliente		
		ArrayList<Cliente> listCliente= new ArrayList<Cliente>();
				
		do {        	
			String cpfCliente = JOptionPane.showInputDialog("Digite o cpf: ");				
			if (!cpfs.contains(cpfCliente)) {
				cpfs.add(cpfCliente);
				Endereco enderecoCliente = criarEndereco();
				listCliente.add(
					new Cliente(
							JOptionPane.showInputDialog("Digite o nome: "),
							formatoData.parse(JOptionPane.showInputDialog("Digite a data de nascimento: ")),
							cpfCliente,
							JOptionPane.showInputDialog("Digite o celular: "),
							JOptionPane.showInputDialog("Digite o email: "),
							formatoData.parse(JOptionPane.showInputDialog("Digite a data da criação: ")),
							enderecoCliente
							));
				
				resposta = JOptionPane.showInputDialog("Digite <S> para continuar").toUpperCase();
			} else {
				resposta = "N";
			}
		} while (resposta.equals("S"));
		
		listCliente.forEach(
				item->System.out.println(
						"O nome é: " + item.getNome() +
						"\ndataNascimento: " + item.getDataNascimento() +
						"\ncpf: " + item.getCpf() +
						"\ncelular: " + item.getCelular() +
						"\nemail: " + item.getEmail() +
						"\ndataCriacao: " + item.getDataCriacao()
						)
				);
	}
	
	public void cadastrarAvaliacao() {
		// Avaliacao	
		ArrayList<Avaliacao> listAvaliacao = new ArrayList<Avaliacao>();
		do {        	
			listAvaliacao.add(
				new Avaliacao(
						JOptionPane.showInputDialog("Digite a descrição: "),
						Double.valueOf(JOptionPane.showInputDialog("Digite a nota: "))
					));
			
			resposta = JOptionPane.showInputDialog("Digite <S> para continuar").toUpperCase();
		} while (resposta.equals("S"));
		
		listAvaliacao.forEach(
			item->System.out.println(
					"A descrição é: " + item.getDescricao() +
					"\nnota: " + item.getNota()
					)
			); 
	}
	
	public void cadastrarLocadora() {
		// Locadora	
		ArrayList<Locadora> listLocadora = new ArrayList<Locadora>();
		
		Endereco enderecoLocadora = criarEndereco();
		Avaliacao avaliacaoLocadora = criarAvaliacao();
		
		do {        	
			listLocadora.add(
				new Locadora(
						JOptionPane.showInputDialog("Digite o nome: "),
						JOptionPane.showInputDialog("Digite o cnpj: "),
						JOptionPane.showInputDialog("Digite o logo: "),
						enderecoLocadora,
						avaliacaoLocadora
					));
			
			resposta = JOptionPane.showInputDialog("Digite <S> para continuar").toUpperCase();
		} while (resposta.equals("S"));
		
		listLocadora.forEach(
			item->System.out.println(
					"O nome é: " + item.getNome() +
					"\ncpnj: " + item.getCnpj() +
					"\nlogo: " + item.getLogo()
					)
			); 
	}
	
	public void cadastrarVeiculo() {
		// Veiculo	
		ArrayList<Veiculo> listVeiculo = new ArrayList<Veiculo>();
		
		do {        	
			listVeiculo.add(
				new Veiculo(
						JOptionPane.showInputDialog("Digite a marca: "),
						JOptionPane.showInputDialog("Digite o modelo: "),
						JOptionPane.showInputDialog("Digite a cor: "),
						JOptionPane.showInputDialog("Digite o ano: "),
						JOptionPane.showInputDialog("Digite a placa: "),
						JOptionPane.showInputDialog("Digite o chassi: "),
						Double.valueOf(JOptionPane.showInputDialog("Digite o km: ")),
						JOptionPane.showInputDialog("Digite o link da imagem: ")
					));
			
			resposta = JOptionPane.showInputDialog("Digite <S> para continuar").toUpperCase();
		} while (resposta.equals("S"));
		
		listVeiculo.forEach(
			item->System.out.println(
					"A marca é: " + item.getMarca() +
					"\nmodelo: " + item.getModelo() +
					"\nano: " + item.getAno() +
					"\nplaca: " + item.getCor() +
					"\nchassi: " + item.getChassi() +
					"\nkm: " + item.getKm() +
					"\nimagem: " + item.getImagem()
					)
			); 
	}

	private Endereco criarEndereco() {
		Endereco endereco = new Endereco(
				JOptionPane.showInputDialog("Digite o CEP: "),
				JOptionPane.showInputDialog("Digite o estado: "),
				JOptionPane.showInputDialog("Digite a cidade: "),
				JOptionPane.showInputDialog("Digite o bairro: "),
				JOptionPane.showInputDialog("Digite o tipo de logradouro: "),
				JOptionPane.showInputDialog("Digite o logradouro: "),
				Integer.valueOf(JOptionPane.showInputDialog("Digite o numero: "))
				);
		return endereco;
	}
	
	private Avaliacao criarAvaliacao() {
		Avaliacao avaliacao = new Avaliacao(
				JOptionPane.showInputDialog("Digite a descrição: "),
				Double.valueOf(JOptionPane.showInputDialog("Digite a nota: "))
				);
		return avaliacao;
	}
	
	public static void main(String[] args) throws ParseException {

		Programa programa = new Programa();
		int opcaoSelecionado = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Opção de cadastro", 0, 0, null, tipoCadastro, tipoCadastro[0]);
		
		if (opcaoSelecionado == 0) {
			programa.cadastrarAluguel();
		} else if (opcaoSelecionado == 1) {
			programa.cadastrarEndereco();
		} else if (opcaoSelecionado == 2) {
			programa.cadastrarCliente();
		} else if (opcaoSelecionado == 3) {
			programa.cadastrarAvaliacao();
		} else if (opcaoSelecionado == 4) {
			programa.cadastrarLocadora();
		} else if (opcaoSelecionado == 5) {
			programa.cadastrarVeiculo();
		}        
		
	}

}
