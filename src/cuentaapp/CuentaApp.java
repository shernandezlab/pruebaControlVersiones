package cuentaapp;

public class CuentaApp {

    public static void main(String[] args) {
        
        Cuenta cuenta_1 = new Cuenta("Fernando");
        Cuenta cuenta_2 = new Cuenta("Samuel", 300);
        
        cuenta_1.ingresar(300);
        cuenta_2.ingresar(400);
        
        cuenta_1.retirar(500);
        cuenta_2.retirar(400);
        
        System.out.println(cuenta_1);
        System.out.println(cuenta_2);
    }
    
}
