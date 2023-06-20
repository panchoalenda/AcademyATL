package poo.models;

import javax.xml.transform.Source;

public class Cuenta {

    private  String titular;
    private double cantidad;

    public Cuenta() {
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
        System.out.println("Datos INICIALES de la cuenta:" + mostrar());

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad){
       if (cantidad > 0){
           this.cantidad+=cantidad;
           System.out.println( "Operación de Depósito Exitosa");
            System.out.println("Datos de la cuenta después del DEPOSITO:" + mostrar());
       }else {
           System.err.println("No se pudo realizar el Deposito");
       }
    }
    public void retirar(double cantidad){
        if (cantidad <= this.cantidad){
            this.cantidad-=cantidad;
            System.err.println("Operación de Extracción Exitosa");
            System.out.println("Datos de la cuenta después del RETIRO:" + mostrar());
        }else {
            System.err.println("No se pudo realizar la Extracción");
        }
    }



    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTitular de la Cuenta: ").append(this.titular)
          .append("\n")
          .append("Saldo en $: ").append(this.cantidad);

        return sb.toString();
    }
}
