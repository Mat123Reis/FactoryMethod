package triangulo;

public class Triangulo {

	private float ladoA;
	private float ladoB;
	private float ladoC;
	private String tpTriangulo;

	public Triangulo(float ladoA, float ladoB, float ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public String getTpTriangulo() {
		return tpTriangulo;
	}

	public void setTpTriangulo(String tpTriangulo) {
		this.tpTriangulo = tpTriangulo;
	}

	public float getLadoA() {
		return ladoA;
	}

	public void setLadoA(float ladoA) {
		this.ladoA = ladoA;
	}

	public float getLadoB() {
		return ladoB;
	}

	public void setLadoB(float ladoB) {
		this.ladoB = ladoB;
	}

	public float getLadoC() {
		return ladoC;
	}

	public void setLadoC(float ladoC) {
		this.ladoC = ladoC;
	}

	
	public String getTpFigura() {

		String resultado = "";

		/* setTpTriangulo("INEXISTENTE"); */
		if ((getLadoA() + getLadoB()) < getLadoC() || (getLadoA() + getLadoC()) < getLadoB()
				|| (getLadoB() + getLadoC()) < getLadoA()) {

			resultado = "INEXISTENTE";

			/* setTpTriangulo("Equilátero"); */
		} else if (ladoA == ladoB && ladoA == ladoC) {

			resultado = "Equilátero";

			/* setTpTriangulo("Isósceles"); */
		} else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {

			resultado = "Isósceles";
			
			/* setTpTriangulo("Escaleno"); */
		} else {

			resultado = "Escaleno";
			

		}

		return resultado;
	}

	
	public String toString() {
		return "Triangulo [ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + "] \nTriângulo: "
				+ getTpFigura();
	}

}
