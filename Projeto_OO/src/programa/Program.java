package programa;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import controlador.ControleDados;
import modelo.Alimento;
import modelo.Estoque;
import visao.TelaInicial;


public class Program {

	public static void main(String[] args) throws ParseException {
		
		TelaInicial tela = new TelaInicial(new ControleDados());
	}
}

