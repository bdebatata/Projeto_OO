package programa;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import control.ControleDados;
import model.Alimento;
import model.Estoque;
import view.TelaInicial;


public class Program {

	public static void main(String[] args) throws ParseException {
		
		TelaInicial tela = new TelaInicial(new ControleDados());
	}
}

