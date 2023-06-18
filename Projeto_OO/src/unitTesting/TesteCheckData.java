package unitTesting;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;

import org.junit.Test;

import control.ControleDados;

public class TesteCheckData {
	@Test
	public void DataDiaErrado() throws ParseException {
		ControleDados dados = new ControleDados();
		assertFalse(dados.CheckData("41/02/2000"));
	}
	@Test
	public void DataDiaNegativo() throws ParseException {
		ControleDados dados = new ControleDados();
		assertFalse(dados.CheckData("-41/02/2000"));
	}
	@Test
	public void DataMesErrado() throws ParseException {
		ControleDados dados = new ControleDados();
		assertFalse(dados.CheckData("15/42/2000"));
	}
	@Test
	public void DataMesNegativo() throws ParseException {
		ControleDados dados = new ControleDados();
		assertFalse(dados.CheckData("41/-02/2000"));
	}
	@Test
	public void DataFormatoInvalido() throws ParseException {
		ControleDados dados = new ControleDados();
		assertFalse(dados.CheckData("41022000"));
	}
	@Test
	public void Data() throws ParseException {
		ControleDados dados = new ControleDados();
		assertTrue(dados.CheckData("02/02/2004"));
	}
}
