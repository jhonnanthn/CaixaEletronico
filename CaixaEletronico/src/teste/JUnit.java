package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;

import controller.CedulaController;
import entity.Cedula;

public class JUnit {
	private Cedula cedula;
	
	@Before
    public void criarCedula() {
        cedula = new Cedula(100.1);
    }
	
	@Test
	public void test1() {
		CedulaController cedulaController = new CedulaController(cedula);
		assertEquals("Entregar 1 nota de R$100.00; 0 de R$50.00; 0 de R$20.00; 0 de R$10.00", cedulaController.caixaEletronico());
	}

	@Test
	public void test2() {
		CedulaController cedulaController = new CedulaController(cedula);
		assertEquals("Entregar 2 nota de R$100.00; 0 de R$50.00; 0 de R$20.00; 0 de R$10.00", cedulaController.caixaEletronico());
	}
	
	@Test
	public void test3() {
		CedulaController cedulaController = new CedulaController(cedula);
		assertEquals("Entregar 3 nota de R$100.00; 0 de R$50.00; 0 de R$20.00; 0 de R$10.00", cedulaController.caixaEletronico());
	}
	
	@AfterAll
	public void test4() {
		CedulaController cedulaController = new CedulaController(cedula);
		assertEquals("0", cedulaController.saldo());
	}
}
