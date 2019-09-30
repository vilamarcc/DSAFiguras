package edu.upc.eetac.dsa;

public abstract class GestorFiguresImpl  {

    public static void main(String[] args) {
	Figura[] array;
	array = new Figura[6];

	array [0] = new Cercle(2);
	array[1] = new Triangle(6,7);
	array[2]  = new Cercle(7.0);
	array [3] = new Rectangle(8,9);
	array [4] = new Cercle(14);
	array [5] = new Quadrat(5);

	System.out.println(array[3].getArea());

		double area = GestorFigures.sumac(array);
		System.out.println(area);
		//GestorFigures.sort(array);
    }
}
