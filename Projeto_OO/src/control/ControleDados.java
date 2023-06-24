package control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

import enums.GenLiterario;
import enums.QualidadeMaterial;
import model.Alimento;
import model.Estoque;
import model.Informatica;
import model.Livro;
import model.Maquiagem;
import model.Produto;
import model.Vestuario;

/**
 * Classe que serve de controle dos dados de todas as telas, sendo um parametro
 * necessario para inicializacao de todas, fica responsavel pela ligacao entre o
 * pacote model e a view
 * 
 * @author Bruno Henrique Duarte
 *
 */
public class ControleDados {
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Estoque estoque = new Estoque();
	private String pad = "dd/MM/yyyy";
	private DateTimeFormatter format = DateTimeFormatter.ofPattern(pad);

	/**
	 * Construtor da classe, onde e inicializado um produto de cada tipo possivel
	 * 
	 * @throws ParseException
	 */
	public ControleDados() throws ParseException {
		estoque.addProduto(
				new Alimento("Snickers", 4.99, 400, 1010, "Mars, Incorporated", sdf.parse("24/02/2024"), 90));
		estoque.addProduto(new Informatica("Nitro 5", 4999.99, 150, 101001, "Acer", 17, 512, "i7-11800H"));
		estoque.addProduto(new Maquiagem("Linha VF", 367.5, 100, 100100, "WePink", QualidadeMaterial.valueOf("Alta"),
				QualidadeMaterial.valueOf("Alta")));
		estoque.addProduto(new Vestuario("Jaqueta", 2500, 15, 10100100, "Gucci", "Couro", 46));
		estoque.addProduto(
				new Livro("Ecce-Homo", 25, 50, 010100, "L&PM Pocket", GenLiterario.valueOf("Filosofia"), 113));
	}

	/**
	 * Metodo de cadastro de alimento, recebe como parametro todos os atributos da
	 * classe Alimento e entao chama o metodo addProduto.
	 * 
	 * @param nome  Strinq que representa o nome do Produto a ser cadastrado
	 * @param preco double que representa o preco do Produto
	 * @param qtd   int que representa a quantidade do Produto
	 * @param cod   int que representa o codigo do Produto
	 * @param marca String que representa a marca do Produto
	 * @param data  Date que representa a data de validade do Alimento
	 * @param peso  double que representa o peso do Alimento
	 * 
	 * @see Alimento
	 * @see Produto
	 * @see Estoque#removeProduto(Produto)
	 */
	public void cadAlimento(String nome, double preco, int qtd, int cod, String marca, Date data, double peso) {
		estoque.addProduto(new Alimento(nome, preco, qtd, cod, marca, data, peso));
	}

	/**
	 * Metodo de cadastro de informatica, recebe como parametro todos os atributos
	 * da classe informatica e entao chama o metodo addProduto.
	 * 
	 * @param nome          Strinq que representa o nome do Produto a ser cadastrado
	 * @param preco         double que representa o preco do Produto
	 * @param qtd           int que representa a quantidade do Produto
	 * @param cod           int que representa o codigo do Produto
	 * @param marca         String que representa a marca do Produto
	 * @param tamanhoDaTela double que representa o tamanho da tela
	 * @param armazenamento int que representa o armazenamento
	 * @param processador   String que representa o nome do processador
	 * 
	 * @see Informatica
	 * @see Produto
	 * @see Estoque#removeProduto(Produto)
	 */
	public void cadInformatica(String nome, double preco, int qtd, int cod, String marca, double tamanhoDaTela,
			int armazenamento, String processador) {
		estoque.addProduto(new Informatica(nome, preco, qtd, cod, marca, tamanhoDaTela, armazenamento, processador));
	}

	/**
	 * Metodo de cadastro de Vestuario, recebe como parametro todos os atributos da
	 * classe Vestuario e entao chama o metodo addProduto.
	 * 
	 * @param nome     Strinq que representa o nome do Produto a ser cadastrado
	 * @param preco    double que representa o preco do Produto
	 * @param qtd      int que representa a quantidade do Produto
	 * @param cod      int que representa o codigo do Produto
	 * @param marca    String que representa a marca do Produto
	 * @param material Strinq que representa o material do Vestuario
	 * @param tamanho  int que representa o tamanho do Vestuario
	 * 
	 * @see Vestuario
	 * @see Produto
	 * @see Estoque#removeProduto(Produto)
	 */
	public void cadVestuario(String nome, double preco, int qtd, int cod, String marca, String material, int tamanho) {
		estoque.addProduto(new Vestuario(nome, preco, qtd, cod, marca, material, tamanho));
	}

	/**
	 * Metodo de cadastro de Livro, recebe como parametro todos os atributos da
	 * classe Livro e entao chama o metodo addProduto.
	 * 
	 * @param nome   Strinq que representa o nome do Produto a ser cadastrado
	 * @param preco  double que representa o preco do Produto
	 * @param qtd    int que representa a quantidade do Produto
	 * @param cod    int que representa o codigo do Produto
	 * @param marca  String que representa a marca do Produto
	 * @param genero GenLiterario que representa o gênero do Livro
	 * @param qtdPag int que representa a quantidade de paginas do Livro
	 * 
	 * @see Livro
	 * @see Produto
	 * @see GenLiterario
	 * @see Estoque#removeProduto(Produto)
	 */
	public void cadLivro(String nome, double preco, int qtd, int cod, String marca, GenLiterario genero, int qtdPag) {
		estoque.addProduto(new Livro(nome, preco, qtd, cod, marca, genero, qtdPag));
	}

	/**
	 * Metodo de cadastro de Maquiagem, recebe como parametro todos os atributos da
	 * classe Maquiagem e entao chama o metodo addProduto.
	 * 
	 * @param nome         Strinq que representa o nome do Produto a ser cadastrado
	 * @param preco        double que representa o preco do Produto
	 * @param qtd          int que representa a quantidade do Produto
	 * @param cod          int que representa o codigo do Produto
	 * @param marca        String que representa a marca do Produto
	 * @param durabilidade QualidadeMaterial que representa a qualidade da
	 *                     durabilidade da Maquiagem
	 * @param pigmentacao  QualidadeMaterial que representa a qualidade da
	 *                     pigmentacao da Maquiagem
	 * 
	 * @see Maquiagem
	 * @see QualidadeMaterial
	 * @see Estoque#removeProduto(Produto)
	 */
	public void cadMaquiagem(String nome, double preco, int qtd, int cod, String marca, QualidadeMaterial durabilidade,
			QualidadeMaterial pigmentacao) {
		estoque.addProduto(new Maquiagem(nome, preco, qtd, cod, marca, durabilidade, pigmentacao));
	}

	/**
	 * Metodo que remove um produto do estoque, chama o metodo removeProduto
	 * 
	 * @param produto produto a ser removido
	 * @see Estoque#removeProduto(Produto)
	 */
	public void remove(Produto produto) {
		estoque.removeProduto(produto);
	}

	/**
	 * Metodo que busca no estoque um produto
	 * 
	 * @param nome O nome do produto a ser buscado
	 * @return caso exista no estoque retorna o Produto, caso constrário nulo
	 */
	public Produto pesquisa(String nome) {
		if (estoque.busca(nome) == null) {
			return null;
		} else
			return estoque.busca(nome);
	}

	// Get
	public Estoque getEstoque() {
		return estoque;
	}

	/**
	 * Metodo de validacao de data de validade, onde e usado um formatador do tipo
	 * DataTimeFormatter e um parse, caso o bloco try nao retorne um erro ele
	 * retorna true, caso contrario retorna falso 
	 * 
	 * @param data Data de validade a ser validada
	 * @return booleano no qual true representa data valida e false invalida
	 * 
	 * @see LocalDate
	 * @see LocalDate#parse(CharSequence, DateTimeFormatter)
	 */
	public boolean CheckData(String data) {
		try {
			LocalDate date = LocalDate.parse(data, format);
			return true;
		} catch (DateTimeParseException e) {
			return false;
		}
	}

}
