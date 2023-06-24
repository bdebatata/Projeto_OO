package unitTesting;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;
import java.time.LocalDate;

import org.junit.Test;

import control.ControleDados;
/**
 * Classe responsavel pelos testes com o verificador de data
 * 
 * @author Bruno Henrique Duarte
 * @version 1.0
 * 
 * @see ControleDados
 */
public class TesteCheckData {
	/**
	 * Teste realizado para data com dia invalido
	 * @throws ParseException Pode retornar a ParseException devido o uso do metodo parse
	 * 
	 * @see LocalDate#parse(CharSequence, java.time.format.DateTimeFormatter)
	 * @see ParseException
	 */
	@Test
	public void DataDiaErrado() throws ParseException {
		ControleDados dados = new ControleDados();
		assertFalse(dados.CheckData("41/02/2000"));
	}
	/**
	 * Teste realizado para data com dia negativo
	 * @throws ParseException Pode retornar a ParseException devido o uso do metodo parse
	 * 
	 * @see LocalDate#parse(CharSequence, java.time.format.DateTimeFormatter)
	 * @see ParseException
	 */
	@Test
	public void DataDiaNegativo() throws ParseException {
		ControleDados dados = new ControleDados();
		assertFalse(dados.CheckData("-41/02/2000"));
	}
	/**
	 * Teste realizado para data com mes invalido
	 * @throws ParseException Pode retornar a ParseException devido o uso do metodo parse
	 * 
	 * @see LocalDate#parse(CharSequence, java.time.format.DateTimeFormatter)
	 * @see ParseException
	 */
	@Test
	public void DataMesErrado() throws ParseException {
		ControleDados dados = new ControleDados();
		assertFalse(dados.CheckData("15/42/2000"));
	}
	/**
	 * Teste realizado para mes negativo
	 * @throws ParseException Pode retornar a ParseException devido o uso do metodo parse
	 * 
	 * @see LocalDate#parse(CharSequence, java.time.format.DateTimeFormatter)
	 * @see ParseException
	 */
	@Test
	public void DataMesNegativo() throws ParseException {
		ControleDados dados = new ControleDados();
		assertFalse(dados.CheckData("41/-02/2000"));
	}
	/**
	 * Teste realizado para formato de data invalido 
	 * @throws ParseException Pode retornar a ParseException devido o uso do metodo parse
	 * 
	 * @see LocalDate#parse(CharSequence, java.time.format.DateTimeFormatter)
	 * @see ParseException
	 */
	@Test
	public void DataFormatoInvalido() throws ParseException {
		ControleDados dados = new ControleDados();
		assertFalse(dados.CheckData("41022000"));
	}
	/**
	 * Teste realizado para data valida 
	 * @throws ParseException Pode retornar a ParseException devido o uso do metodo parse
	 * 
	 * @see LocalDate#parse(CharSequence, java.time.format.DateTimeFormatter)
	 * @see ParseException
	 */
	@Test
	public void Data() throws ParseException {
		ControleDados dados = new ControleDados();
		assertTrue(dados.CheckData("02/02/2004"));
	}
}
