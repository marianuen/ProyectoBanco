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

    /**
     * Es el constructor de la cuenta de un usario
     * @param numCuenta, es el numero que identifica a la cuenta
     * @param saldo, es la cantidad de dinero que contiene la cuenta
     * @param limiteRetiradaCajero, es la cantidad máxima que se pude retirar del 
     * cajero
     * @param limitePagoInternet, es la cantidad máxima que el usuario puede gastarse
     * en una compra por internet
     * @param fechaApertura, es la fecha en la que el usuario se creo la cuenta
     */
    public Cuenta(int numCuenta, int saldo, int limiteRetiradaCajero, int limitePagoInternet, String fechaApertura) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.limiteRetiradaCajero = limiteRetiradaCajero;
        this.limitePagoInternet = limitePagoInternet;
        this.fechaApertura=fechaApertura;
        this.totalCompra=0;
    }

    /**
     * Permite acceder al numero de cuenta
     * @return el numero de cuenta del usuario
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    /**
     * Permite acceder al saldo de la cuenta
     * @return la cantidad de dinero que tiene el usuario en la cuenta
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * Permite modificar el saldo de la cuenta
     * @param saldo es la cantidad de dinero que tiene el usuario en la cuenta
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    /**
     * Permite acceder al limite de retirada
     * @return el limite de retirada
     */
    public int getLimiteRetiradaCajero() {
        return limiteRetiradaCajero;
    }

    /**
     * Permite acceder al limite de pago por internet
     * @return el limite de pago por internet
     */
    public int getLimitePagoInternet() {
        return limitePagoInternet;
    }

    /**
     * Permite acceder al total de la compra
     * @return el total de la compra
     */
    public int getTotalCompra() {
        return totalCompra;
    }

    /**
     * Permite modificar el total de compra
     * @param totalCompra, es suma de todos los gastos que ha realizado con la 
     * cuenta
     */
    public void setTotalCompra(int totalCompra) {
        this.totalCompra = totalCompra;
    }

    /**
     * Permite acceder a la fecha de apertura
     * @return la fecha de aprtura
     */
    public String getFechaApertura() {
        return fechaApertura;
    }

    /**
     * Permite acceder al numero de cuenta
     * @param numCuenta
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * Permite modificar el limite de retirada del cajero
     * @param limiteRetiradaCajero, es la cantidad maxima que puee retirar el cliente
     */
    public void setLimiteRetiradaCajero(int limiteRetiradaCajero) {
        this.limiteRetiradaCajero = limiteRetiradaCajero;
    }

    /**
     * Permite modificar el limite de pago de internet
     * @param limitePagoInternet, es la cantidad maxima que puede gastarse en un
     * pago por internet el cliente
     */
    public void setLimitePagoInternet(int limitePagoInternet) {
        this.limitePagoInternet = limitePagoInternet;
    }

    /**
     * Permite modificar la fecha en la que se abrió la cuenta
     * @param fechaApertura, es la fecha en la que el cliente se abrió la cuenta
     */
    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    
    
}
