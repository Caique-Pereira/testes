package palindromo;

public class trinagulo implements FormaGeometricas {
	

	private int base = 0;
	private int altura = 0;

	public trinagulo() {
	}

	public trinagulo(int base, int altura) {
		this.base = base;
		this.altura = altura;


	}

	@Override
	public int areaTotal() {
		return (base * altura)/2;
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
