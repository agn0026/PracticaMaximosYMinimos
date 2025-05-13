package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Minimos;

class TestMinimos {
	static Minimos min1;
	
	@BeforeAll
	static void setup() {
		min1 = new Minimos ();
	}
	
	@Test
	void testException() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> min1.MinimoDe2EnterosPositivos (-2, 1));  //Minimos.MinimoDe2EnterosPositivos(-3, 1);
		String mensajeEsperado = "Alguno de los numeros es menor que 0";
		String mensajeObtenido = exception.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}
	
	@Test
	void testException2() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> min1.MinimoDe3EnterosPositivos (-3, 3, 1));
		String mensajeEsperado = "Alguno de los numeros es menor que 0";
		String mensajeObtenido = exception.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}

	@Test
	void testMinimoDe2EnterosPositivos() {
		//Calculamos el resultado que nos da el metodo
		int numObtenida = min1.MinimoDe2EnterosPositivos (2, 1);
		//Hardcodeamos el resultado que sabemos que deberia dar
		int numEsperada = 1;
		assertEquals(numEsperada, numObtenida); //Si es correcto saldra verde sino rojo
	}

	@Test
	void testMinimoDe3EnterosPositivos() {
		//Calculamos el resultado que nos da el metodo
		int numObtenida = min1.MinimoDe3EnterosPositivos (8, 2, 22);
		//Hardcodeamos el resultado que sabemos que deberia dar
		int numEsperada = 2;
		assertEquals(numEsperada, numObtenida); //Si es correcto saldra verde sino rojo
	}

}
