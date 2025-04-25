package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Maximos;

class TestMaximos {

	@Test
	void testMaximoDe2EnterosPositivos() {
		Maximos mx1 = new Maximos ();
		//Calculamos el resultado que nos da el metodo
		int numObtenida = mx1.MaximoDe2EnterosPositivos (2, 1);
		//Hardcodeamos el resultado que sabemos que deberia dar
		int numEsperada = 2;
		assertEquals(numEsperada, numObtenida); //Si es correcto saldra verde sino rojo
	}

	@Test
	void testMaximoDe3EnterosPositivos() {
		Maximos mx1 = new Maximos ();
		//Calculamos el resultado que nos da el metodo
		int numObtenida = mx1.MaximoDe3EnterosPositivos (2, 1, 5);
		//Hardcodeamos el resultado que sabemos que deberia dar
		int numEsperada = 5;
		assertEquals(numEsperada, numObtenida); //Si es correcto saldra verde sino rojo
	}

}
