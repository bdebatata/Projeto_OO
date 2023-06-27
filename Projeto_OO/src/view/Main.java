package view;

import java.text.ParseException;
import java.util.Locale;

import control.ControleDados;

/**
 * Classe responsavel por inicializar a TelaInicial
 * 
 * @author Bruno Henrique Duarte
 * @version 1.0
 * @see TelaInicial
 * 
 */
public class Main {
	/**
	 * Metodo main que inicializa a TelaInicial, chamando seu construtor e passando
	 * como parametro uma nova instancia de ControleDados, chamando o construtor da
	 * classe ControleDados, alem disso usa o setDefault de Locale para melhor
	 * manipulacao numérica, sendo entao utilizado o ponto como padrao.
	 * 
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		TelaInicial tela = new TelaInicial(new ControleDados());
	}

}
