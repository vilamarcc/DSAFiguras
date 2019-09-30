package edu.upc.eetac.dsa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import edu.upc.eetac.dsa.*;

import java.util.Arrays;


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
        array[5] = new Quadrat(1);
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
        Assert.assertEquals("sort", Cercle.class, array[0].getClass());
        Assert.assertEquals("sort", Triangle.class, array[1].getClass());
        System.out.println(Arrays.asList(array));
        GestorFigures.sort(array);
        Assert.assertEquals("sort", Quadrat.class, array[0].getClass());
        Assert.assertEquals("sort", Cercle.class, array[1].getClass());
        Assert.assertEquals("sort", Triangle.class, array[2].getClass());

    }
}
