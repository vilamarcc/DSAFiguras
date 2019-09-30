package edu.upc.eetac.dsa;

public class Rectangle extends Figura{

    private double base;
    private double altura;
    private double area;
    private String Nombre;

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
        double area = ((this.base)*(this.altura));
        return area;
    }

    //Contructores
    public Rectangle(double base, double altura){
        super(base*altura);
        this.base = base;
        this.altura = altura;
        this.Nombre = "Figura " + Double.toString(Math.round(Math.random()*((15-1)+1))+1);
    }

    public Rectangle(double base, double altura, String Nombre){
        super(base*altura);
        this.base = base;
        this.altura = altura;
        this.Nombre = Nombre;
    }

    public Rectangle(int base, int altura){
        super(base*altura);
        this.base = base;
        this.altura = altura;
        this.Nombre = "Figura " + Double.toString(Math.round(Math.random()*((15-1)+1))+1);
    }
}
