package control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Random;

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
	private Random r = new Random();

	/**
	 * Construtor da classe, onde e inicializado um produto de cada tipo possivel com seus atributos aleatorios
	 * 
	 * @throws ParseException
	 */
	public ControleDados() throws ParseException {
		estoque.addProduto(new Alimento("Produto 1", Math.random() * 200, r.nextInt(101), geraCodAleatorio(),
				"Marca do Produto 1", geraDataAleatoria(), r.nextInt(1001)));

		estoque.addProduto(new Informatica("Produto 2", Math.random() * 50000, r.nextInt(101), geraCodAleatorio(),
				"Marca do Produto 2", r.nextInt(4)+17, r.nextInt(1000), "Processador"));

		estoque.addProduto(new Maquiagem("Produto 3", Math.random() * 200, r.nextInt(101), geraCodAleatorio(),
				"Marca do Produto 3", qualidadeAleatoria(), qualidadeAleatoria()));

		estoque.addProduto(new Vestuario("Produto 4", Math.random() * 2000, r.nextInt(101), geraCodAleatorio(),
				"Marca do Produto 4", "Couro", r.nextInt(21)+30));

		estoque.addProduto(new Livro("Produto 5", Math.random() * 200, r.nextInt(101), geraCodAleatorio(),
				"Marca do Produto 5", generoAleatorio(), r.nextInt(1500)));
	}

	/**
	 * Metodo para geracao de um codigo pseudoaleatorio para ser usado
	 * 
	 * @return codInt Codigo aleatorio composto somente por 5 digitos entre 0 e 1
	 */
	public int geraCodAleatorio() {
		StringBuilder cod = new StringBuilder();
		for (int i = 0; i < 5; i++) {
			int bit = r.nextInt(2);
			cod.append(bit);
		}
		int codInt = Integer.parseInt(String.valueOf(cod));
		return codInt;
	}

	/**
	 * Metodo para geracao de uma data pseudoaleatoria para ser usada no construtor
	 * para gerar Produtos pseudoaleatorios
	 * 
	 * @return dataAleatoria Data pseudoaleatoria
	 * @throws ParseException
	 */
	public Date geraDataAleatoria() throws ParseException {
		StringBuilder data = new StringBuilder();
		StringBuilder dd = new StringBuilder();
		StringBuilder mm = new StringBuilder();
		int dia = r.nextInt(30) + 1;
		int mes = r.nextInt(12) + 1;
		int ano = r.nextInt(2040 - 2024 + 1) + 2024;
		if (dia < 10) {
			dd.append(0);
			dd.append(dia);
		} else
			dd.append(dia);
		if (mes < 10) {
			mm.append(0);
			mm.append(mes);
		} else
			mm.append(mes);
		data.append(dd);
		data.append("/");
		data.append(mm);
		data.append("/");
		data.append(ano);
		Date dataAleatoria = sdf.parse(String.valueOf(data));
		return dataAleatoria;
	}

	/**
	 * Metodo para geracao de um genero literario pseudoaleatorio dentre o conjunto
	 * enumerado GenLiterario, para ser usada no construtor com dados
	 * pseudoaleatorios
	 * 
	 * @return genAleatorio Genero aleatorio
	 * @see GenLiterario
	 */
	public GenLiterario generoAleatorio() {
		GenLiterario[] generos = GenLiterario.values();
		GenLiterario genAleatorio = generos[r.nextInt(generos.length)];
		return genAleatorio;
	}

	/**
	 * Metodo para geracao de uma qualidade pseudoaleatoria dentre o conjunto
	 * enumerado QualidadeMaterial, para ser usada no construtor com dados
	 * pseudoaleatorios
	 * 
	 * @return qualidade Qualidade do material aleatoria
	 * @see QualidadeMaterial
	 */
	public QualidadeMaterial qualidadeAleatoria() {
		QualidadeMaterial[] qualidades = QualidadeMaterial.values();
		QualidadeMaterial qualidade = qualidades[r.nextInt(qualidades.length)];
		return qualidade;
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
