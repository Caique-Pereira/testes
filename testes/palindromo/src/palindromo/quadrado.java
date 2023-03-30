package palindromo;

public class quadrado implements FormaGeometricas {

	private int lado = 0;
	public quadrado() {
	}

	public quadrado(int lado) {
		this.lado = lado;

	}

	@Override
	public int areaTotal() {	
		return lado * lado;
	}

	public int getBase() {
		return lado;
	}

	public void setBase(int base) {
		this.lado = base;
	}

}
