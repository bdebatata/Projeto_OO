package view;

import java.text.ParseException;


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
	 * classe ControleDados.
	 * 
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		TelaInicial tela = new TelaInicial(new ControleDados());
	}

}
