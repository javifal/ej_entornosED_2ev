package code;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VerificaNumerosAmigosTest {

	VerificaNumerosAmigos VNA;
	
	@Before
	public void iniciaCalculadora() {
		System.out.println("Before");
		this.VNA=new VerificaNumerosAmigos();
	}
	
	
	
	@Test
	public void testSuma() {
		System.out.println("Probando la Suma: ");
		boolean resultado = VNA.comprobarSiAmigos(220, 284);
		assertEquals(true, resultado);

	}
}