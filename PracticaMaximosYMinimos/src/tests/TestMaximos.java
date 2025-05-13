package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Maximos;

class TestMaximos {
	static Maximos mx1;
	
	@BeforeAll
	static void setup() {
		 mx1 = new Maximos ();
	}
	
	@Test
	void testException() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> mx1.MaximoDe2EnterosPositivos (-2, 1));
		String mensajeEsperado = "Alguno de los numeros es menor que 0";
		String mensajeObtenido = exception.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}
	
	@Test
	void testException2() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> mx1.MaximoDe3EnterosPositivos (-3, 3, 1));
		String mensajeEsperado = "Alguno de los numeros es menor que 0";
		String mensajeObtenido = exception.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}

	@Test
	void testMaximoDe2EnterosPositivos() {
		//Calculamos el resultado que nos da el metodo
		int numObtenida = mx1.MaximoDe2EnterosPositivos (2, 1);
		//Hardcodeamos el resultado que sabemos que deberia dar
		int numEsperada = 2;
		assertEquals(numEsperada, numObtenida); //Si es correcto saldra verde sino rojo
	}

	@Test
	void testMaximoDe3EnterosPositivos() {
		//Calculamos el resultado que nos da el metodo
		int numObtenida = mx1.MaximoDe3EnterosPositivos (2, 1, 5);
		//Hardcodeamos el resultado que sabemos que deberia dar
		int numEsperada = 5;
		assertEquals(numEsperada, numObtenida); //Si es correcto saldra verde sino rojo
	}

}
