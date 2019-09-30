package edu.upc.eetac.dsa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import edu.upc.eetac.dsa.*;


public class GestorFiguresTest {
    Figura[] array=null;

    @Before
    public void setUp() {
        this.array = new Figura[6];
        array[0] = new Cercle(2);
        array[1] = new Triangle(6,7);
        array[2]  = new Cercle(7.0);
        array[3] = new Rectangle(8,9);
        array[4] = new Cercle(14);
        array[5] = new Quadrat(5);
    }

    @Test
    public void testSuma() {
        System.out.println(array[3].getArea());
        Assert.assertEquals("Figuras", 72, array[3].getArea(),0.15);
        double area = GestorFigures.sumac(array);
        Assert.assertEquals("Figuras", 900, area,0.26 );
        System.out.println(area);

    }

    @Test
    public void testSort() {
        //GestorFigures.sort(array);
    }
}
