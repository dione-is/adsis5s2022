package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestesIntrodutórios {

	public Double memoria ;
	
	@Test
	public void teste_de_soma() {
		CalculadoraMinha calc = new CalculadoraMinha();
		double total = calc.Somar(10, 10.0);		
		assertEquals(20, total, 0);
		
		total = calc.Somar(15, 77.10);		
		assertEquals(92.10, total, 0);

	}
	@Test
	public void teste_de_Subtrair() {
		CalculadoraMinha calc = new CalculadoraMinha();
		double total = calc.Subtrair(30, 10.0);		
		assertEquals(20, total, 0);
		
		total = calc.Subtrair(20, 10.0);		
		assertEquals(10.0, total, 0);
	}
	@Test
	public void teste_de_Multiplicar() {
		CalculadoraMinha calc = new CalculadoraMinha();
		double total = calc.Multiplicar(10, 10.0);		
		assertEquals(100, total, 0);
		
		total = calc.Multiplicar(5, 2);		
		assertEquals(10.0, total, 0);
	}
	@Test
	public void teste_de_Dividir() {
		CalculadoraMinha calc = new CalculadoraMinha();
		double total = calc.Dividir(30, 2.0);		
		assertEquals(15, total, 0);
		
		total = calc.Dividir(40, 4.0);		
		assertEquals(10, total, 0);
	}
	
	@Test(expected = DivisaoPorZeroException.class)
	public void Teste_divisao_por_zero() {
		CalculadoraMinha calc = new CalculadoraMinha();
		double total = calc.Dividir(30, 0);		
		assertEquals(0, total, 0);
	}
	
	@Test
	public void Teste_Com_Memoria() {
		CalculadoraMinha calc = new CalculadoraMinha();
		double total = calc.Somar(10, 10);
		calc.getMemorizar(total);
		
		total = calc.Somar(15, 15);
		total = calc.Somar(202, 20);
		
		double memoria = calc.getMemorizar();
		
		assertEquals(222, total, 0);
	}
	
	@Test(Expected= MemoriaNaoExisteException.class)
	public void Teste_sem_Memoria() {
		CalculadoraMinha calc = new CalculadoraMinha();
		double memoria = calc.getMemorizar();
	}
}
