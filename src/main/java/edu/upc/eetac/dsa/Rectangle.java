package edu.upc.eetac.dsa;

public class Rectangle extends Figura{

    private double base;
    private double altura;
    private double area;

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

    //Calculo de Area
    public double getArea(){
        double area = ((this.base)*(this.altura));
        return area;
    }

    //Contructores
    public Rectangle(double base, double altura){
        this.base = base;
        this.altura = altura;
    }


    public Rectangle(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

}
