package edu.upc.eetac.dsa;

public class Cercle extends Figura{
    private String Nombre;
    private double Radio;

    //Getters y setters


    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setRadio(double radio) {
        this.Radio = radio;
    }

    public double getRadio() {
        return this.Radio;
    }

    //Calculo de area

    public double getArea(){

        double radio = this.Radio;
        double area = (Math.PI)*(Math.pow(radio,2));
        return area;
    }

    //Constructores

    public Cercle(double radio){
        super((Math.PI)*(Math.pow(radio,2)));
        this.Radio = radio;
        this.Nombre = "Figura " + Double.toString(Math.round(Math.random()*((15-1)+1))+1);
    }

    public Cercle(double radio, String Nombre){

        super((Math.PI)*(Math.pow(radio,2)));
        this.Radio = radio;
        this.Nombre = Nombre;
    }

    public Cercle(int radio){

        super((Math.PI)*(Math.pow(radio,2)));
        this.Radio = radio;
        this.Nombre = "Figura " + Double.toString(Math.round(Math.random()*((15-1)+1))+1);
    }
}
