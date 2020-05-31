package cuentaapp;

public class Cuenta {
    
    private String titular;
    private double cantidad;
    
    public Cuenta(String titular) {
        this(titular, 0);
    }
    public Cuenta(String titular, double cantidad){
        this.titular =titular;
        if(cantidad < 0){
            this.cantidad=0;
        }else{
            this.cantidad=cantidad;
        }
    }
    
    //Metodos
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public double getCantidad(){
        return cantidad;
    }
    public void setCantidad(double cantidad){
        this.cantidad= cantidad;
    }
    
    //ingresar dinero en la cuenta, 
    //solo si la cantidad es mayor que 0
    public void ingresar(double cantidad){
        if (cantidad > 0){
            this.cantidad += cantidad;
        }
    }
    public void retirar(double cantidad){
        if(this.cantidad - cantidad < 0){
            this.cantidad = 0;
        }else{
            this.cantidad -= cantidad;
        }
    }
    
    public String toString(){
        return "El titular " + titular + " tiene " + cantidad + " quetzales en la cuenta";
    }
            
}