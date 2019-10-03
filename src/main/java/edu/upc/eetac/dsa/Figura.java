package edu.upc.eetac.dsa;

public abstract class Figura implements Comparable<Figura> {
    //Atributos
    private String Nombre;

    //Getters
    public abstract double getArea();

    //Constructores

    public String toString() {
       return this.getClass().getSimpleName()+":"+this.getArea();
    }

    public int compareTo(Figura f) {
        return (int)(this.getArea()-f.getArea());
    }






}



