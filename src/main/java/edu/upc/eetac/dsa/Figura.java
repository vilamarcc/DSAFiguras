package edu.upc.eetac.dsa;

public abstract class Figura {
    //Atributos
    private String Nombre;
    private double Area;

    //Getters and setters
    public double getArea() {
        return this.Area;
    }

    public void setArea(double area) {
        this.Area = area;
    }

    public String getName(){
        return this.Nombre;
    }

    public void setName(String Name){
        this.Nombre = Name;
    }

    public void Figura(String Name, double area) {

        this.Nombre = Name;
        this.Area = area;
    }

    //Constructores
    public Figura(double area){

        this.Nombre = "Figura " + Double.toString(Math.round(Math.random()*((15-1)+1))+1);
        this.Area = area;
    }
    public Figura(double area, String Nombre){
        this.Nombre = Nombre;
        this.Area = area;
    }






}



