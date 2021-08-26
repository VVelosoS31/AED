import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author vveloso
 *
 */
class ArranjoTest {

	@Test
	void test() {
		Arranjo ar = new Arranjo();
		
		assertEquals(510, ar.menor(), "O menor é 510");
		
		assertEquals(940, ar.maior(), "O maior é 940");
		
		assertEquals(7540, ar.soma(), "A soma é 7540");
		
		assertEquals(0, ar.repeticoes(3), "3 aparece 0 vezes");
		
		assertEquals(1, ar.repeticoes(790), "790 aparece 1 vez");
		
		assertEquals(2, ar.repeticoes(940), "940 aparece 2 vezes");
	}

}
