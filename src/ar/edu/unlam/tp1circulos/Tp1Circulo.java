package ar.edu.unlam.tp1circulos;

public class Tp1Circulo {
	private Double radio;

	public Tp1Circulo(Double radio) {

		this.radio = radio;

	}

	public Double getPerimetro() {

		return Math.PI * 2 * this.radio;
	}

	public Double getRadio() {
		return this.radio;
	}

}
