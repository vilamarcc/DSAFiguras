package edu.upc.eetac.dsa;

import java.util.Arrays;

// interface
public interface GestorFigures  {

    //public double sumac(Figura[] l);
    //public void sort(Figura[] l);


   public static double sumac(Figura[] l) {

        double areaTotal=0;
        for(Figura f: l){
            areaTotal += f.getArea();
        }
        return areaTotal;
    };
    public static void sort(Figura[] l){
         Arrays.sort(l);
    }

}