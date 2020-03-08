package fluzao;
import java.util.ArrayList;

public class Geo {
	
public static void main(String args[]) {
			
			ArrayList <Figura2D> figura = new ArrayList<>();
			figura.add(new Quadrado(7));
			figura.add(new Triangulo(5, 4));
			figura.add(new Losango(5, 9));
			figura.add(new Retangulo(8, 2));
			figura.add(new Circulo(6));
			figura.add(new Trapezio(9, 4, 5, 4));
			
			System.out.println(" Figuras 2D ");
			for (Figura2D fig:figura) {
				System.out.println("A área da figura é: "  + fig.area() + "cm²");
				
				if (fig instanceof Diagonal) {
					System.out.println("a diagonal vale: " + ((Diagonal)fig).calculaDiagonal());
					System.out.println("------------------------");
				} else {
					System.out.println("------------------------");
				}
			}
			
		}
	}



