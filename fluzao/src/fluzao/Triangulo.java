package fluzao;

public class Triangulo extends Poligono {

	public Triangulo(int base, int altura) {
		super(base, altura);
	}
	
	@Override
	public double area() {
		return super.area() / 2;
	}
}
