package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Minimos;

class TestMinimos {

	@Test
	void testMinimoDe2EnterosPositivos() {
		Minimos min1 = new Minimos ();
		//Calculamos el resultado que nos da el metodo
		int numObtenida = min1.MinimoDe2EnterosPositivos (2, 1);
		//Hardcodeamos el resultado que sabemos que deberia dar
		int numEsperada = 1;
		assertEquals(numEsperada, numObtenida); //Si es correcto saldra verde sino rojo
	}

	@Test
	void testMinimoDe3EnterosPositivos() {
		Minimos min1 = new Minimos ();
		//Calculamos el resultado que nos da el metodo
		int numObtenida = min1.MinimoDe3EnterosPositivos (8, 2, 22);
		//Hardcodeamos el resultado que sabemos que deberia dar
		int numEsperada = 2;
		assertEquals(numEsperada, numObtenida); //Si es correcto saldra verde sino rojo
	}

}
