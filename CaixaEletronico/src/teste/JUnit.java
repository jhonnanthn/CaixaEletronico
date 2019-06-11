package teste;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controller.CedulaController;
import entity.Cedula;

public class JUnit {
	private Cedula cedula;
	
	@Before
    public void criarCedula() {
		System.out.println("Iniciar uma instancia de um objeto com o valor à sacar zerado.");
        cedula = new Cedula();
    }
	
	@Test
	public void test1() {
		System.out.println("Teste 1 - Deverá retornar success.");
        cedula = new Cedula(100.1);
		CedulaController cedulaController = new CedulaController(cedula);
		assertEquals("Entregar 1 nota de R$100.00; 0 de R$50.00; 0 de R$20.00; 0 de R$10.00", cedulaController.caixaEletronico());
	}

	@Test
	public void test2() {
		System.out.println("Teste 2 - Deverá retornar fail.");
        cedula = new Cedula(120.1);
		CedulaController cedulaController = new CedulaController(cedula);
		assertEquals("Entregar 2 nota de R$100.00; 0 de R$50.00; 0 de R$20.00; 0 de R$10.00", cedulaController.caixaEletronico());
	}
	
	@Test
	public void test3() {
		System.out.println("Teste 3 - Deverá retornar success.");
        cedula = new Cedula(300);
		CedulaController cedulaController = new CedulaController(cedula);
		assertEquals("Entregar 3 nota de R$100.00; 0 de R$50.00; 0 de R$20.00; 0 de R$10.00", cedulaController.caixaEletronico());
	}
	
	@Test
	public void test4() {
		System.out.println("Teste 4 - Deverá retornar fail.");
        cedula = new Cedula(400);
		CedulaController cedulaController = new CedulaController(cedula);
		assertEquals("Entregar 3 nota de R$100.00; 0 de R$50.00; 0 de R$20.00; 0 de R$10.00", cedulaController.caixaEletronico());
	}
	
	@After
    public void finalizarCedula() {
		System.out.println("Finalizar o teste, instanciando um objeto com o valor à sacar zerado.");
        cedula = new Cedula();
    }
}
