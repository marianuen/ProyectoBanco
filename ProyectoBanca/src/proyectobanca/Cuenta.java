/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanca;

/**
 *
 * @author maria
 */
public class Cuenta {
     private int numCuenta;
    private int saldo;
    private int limiteRetiradaCajero;
    private int limitePagoInternet;
    private String fechaApertura;
    private int totalCompra;

    public Cuenta(int numCuenta, int saldo, int limiteRetiradaCajero, int limitePagoInternet, String fechaApertura) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.limiteRetiradaCajero = limiteRetiradaCajero;
        this.limitePagoInternet = limitePagoInternet;
        this.fechaApertura=fechaApertura;
        this.totalCompra=0;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getLimiteRetiradaCajero() {
        return limiteRetiradaCajero;
    }

    public int getLimitePagoInternet() {
        return limitePagoInternet;
    }

    public int getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(int totalCompra) {
        this.totalCompra = totalCompra;
    }
}
