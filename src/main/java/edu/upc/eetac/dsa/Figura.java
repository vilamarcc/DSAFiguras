package edu.upc.eetac.dsa;

public abstract class Figura implements Comparable<Figura> {
    //Atributos
    private String Nombre;

    //Getters and setters
    public abstract double getArea(); /* {
        return this.Area;
    }*/

    //Constructores

    public String toString() {
       return this.getClass().getSimpleName()+":"+this.getArea();
    }

    public int compareTo(Figura f) {
        return (int)(this.getArea()-f.getArea());
    }






}



