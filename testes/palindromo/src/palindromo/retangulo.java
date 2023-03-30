package palindromo;

public class retangulo implements FormaGeometricas {

	private int base = 0;
	private int altura = 0;

	public retangulo() {
	}

	public retangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;

	}

	@Override
	public int areaTotal() {
		return base * altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}



}
