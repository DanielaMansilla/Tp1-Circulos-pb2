package ar.edu.unlam.tp1circulos;

import org.junit.Assert;
import org.junit.Test;

public class Tp1CirculoTest {

	@Test
	public void crearCirculoConRadio2() {
		Tp1Circulo circuloRadio2 = new Tp1Circulo(2.00);
		Assert.assertEquals(2.00, circuloRadio2.getRadio(), 2);

	}

	@Test
	public void crearCirculoConRadio3Coma7() {
		Tp1Circulo circuloRadio3Coma7 = new Tp1Circulo(3.7);
		Assert.assertEquals(3.7, circuloRadio3Coma7.getRadio(), 2);

	}

	@Test
	public void crearCirculoConRadio5() {
		Tp1Circulo circuloRadio5 = new Tp1Circulo(5.00);
		Assert.assertEquals(5.00, circuloRadio5.getRadio(), 2);
	}

	@Test
	public void crearCirculoConRadio10Coma9() {
		Tp1Circulo circuloRadio10 = new Tp1Circulo(10.9);
		Assert.assertEquals(10.9, circuloRadio10.getRadio(), 2);
	}

	// Ejercicio 2

	@Test
	public void queElPerimetroDeUnCirculoConRadio9Coma8sea61Coma67() {
		Tp1Circulo perimetroDelCirculo1 = new Tp1Circulo(9.8);
		Assert.assertEquals(61.57, perimetroDelCirculo1.getPerimetro(), 2);
	}

	@Test
	public void queElPerimetroDeUnCirculoConRadio16Coma6sea865104Coma30() {
		Tp1Circulo perimtroDelCirculo2 = new Tp1Circulo(16.6);
		Assert.assertEquals(104.30, perimtroDelCirculo2.getPerimetro(), 2);
	}
}
