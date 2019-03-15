package code;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MinimoComunMultiploTest {

	MinimoComunMultiplo MCM;
	
	
	@Before
	public void iniciaCalculadora() {
		System.out.println("Before");
		this.MCM=new MinimoComunMultiplo();
	}
	
	
	
	@Test
	public void testSuma() {
		System.out.println("Probando la Suma: ");
		int resultado = MCM.candidatosMcM()
		assertEquals(9, resultado);
	}

}
