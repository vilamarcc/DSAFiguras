package edu.upc.eetac.dsa;

public class Triangle extends Figura {
    private double base;
    private double altura;
    private String Nombre;


    //Getters y setters

    public double getBase(){
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base){
        this.base = base;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getNombre(){
        return this.Nombre;
    }

    //Calculo de Area
    public double getArea(){
        double area = ((this.base)*(this.altura))/2;
        return area;
    }

    //Contructores
    public Triangle(double base, double altura){
        //super(((base)*(altura))/2);
        this.base = base;
        this.altura = altura;
        this.Nombre = "Figura " + Double.toString(Math.round(Math.random()*((15-1)+1))+1);
    }

    public Triangle(int base, int altura){
        //super(((base)*(altura))/2);
        this.base = base;
        this.altura = altura;
        this.Nombre = "Figura " + Double.toString(Math.round(Math.random()*((15-1)+1))+1);
    }

}
