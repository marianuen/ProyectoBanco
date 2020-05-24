/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Cliente {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String nif;
    private int telefono;
    private int edad;
    private ArrayList<Cuenta> cuentas = new ArrayList <>();

    Scanner sc = new Scanner(System.in);

    /**
     * Es el constructor del cliente
     * @param nombre, es el nombre del cliente
     * @param apellido1, es el primer apellido del cliente
     * @param apellido2, es el segundo apellido del cliente
     * @param direccion, es la direccion del cliente
     * @param nif, es el NIF del cliente
     * @param telefono, es el telefono del cliente
     * @param edad, es la edad del cliente
     */
    public Cliente(String nombre, String apellido1, String apellido2, String direccion, String nif, int telefono, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.telefono = telefono;
        this.edad = edad;
        this.cuentas = new ArrayList<>();
    }

    /**
     * Permite el acceso al array que contiene las diferentes cuentas del cliente
     * @return ArrayList cuentas
     */
    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    /**
     * Permite modificar el array que contiene las diferentes cuentas del cliente
     * @param cuentas
     */
    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    /**
     * Permite modificar el nombre del cliente
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Permite modificar el primer apellido del cliente
     * @param apellido1, es el nuevo primer apellido del cliente
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * Permite modificar el segundo apellido del cliente
     * @param apellido2, es el nuevo segundo apellido del cliente
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * Permite acceder al NIF del cliente
     * @return el nif del cliente
     */
    public String getNif() {
        return nif;
    }

    /**
     * Permite modificar el NIF del cliente
     * @param nif, es el nuevo NIF del cliente
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Permite modificar el telefono del cliente
     * @param telefono, es el nuevo telefono del cliente
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Permite modificar la edad del cliente
     * @param edad, es la nueva edad del cliente
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Permite modificar la dirección del cliente
     * @param direccion, es la nueva direccion del cliente
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * @return el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return el primer apellido del cliente
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     *
     * @return el segundo apellido del cliente
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     *
     * @return la direccion del cliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @return el telefono del cliente
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     *
     * @return edad del cliente
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Permite al cliente añadir una cantidad de dinero a una de sus cuentas
     * @param numeroCuenta permite al usuario identificar la cuenta con la que 
     * quiere realizar la accion
     * @param cantidad es el dinero que se añadirá en la cuenta
     */
    public void ingresarDinero(int numeroCuenta, int cantidad) {

        for (int i = 0; i < cuentas.size(); i++) {

            if (cuentas.get(i).getNumCuenta() == numeroCuenta) {

                cuentas.get(i).setSaldo(cuentas.get(i).getSaldo() + cantidad);
            }
        }
    }

    /**
     * Permite al cliente sacar cierta cantidad de dinero en una de sus cuentas
     * @param numeroCuenta permite al usuario identificar la cuenta con la que 
     * quiere realizar la accion
     * @param cantidad es el dinero que se añadirá en la cuenta
     */
    public void retirarDinero(int numeroCuenta, int cantidad) {

        for (int i = 0; i < cuentas.size(); i++) {

            if (cuentas.get(i).getNumCuenta() == numeroCuenta) {

                if (cuentas.get(i).getSaldo() > cantidad
                        && cuentas.get(i).getLimiteRetiradaCajero() >= cantidad) {

                    cuentas.get(i).setSaldo(cuentas.get(i).getSaldo() - cantidad);
                }

            }
        }
    }

    /**
     * Permite al usuario realizar pagos por internet
     * @param numeroCuenta, permite identificar la cuenta con la que el usuario
     * quiere realizar la acción
     * @param cantidad, es la cantidad que se va agastar en la compra por internet
     */
    public void compraInternet(int numeroCuenta, int cantidad) {

        for (int i = 0; i < cuentas.size(); i++) {

            if (cuentas.get(i).getNumCuenta() == numeroCuenta) {

                if (cuentas.get(i).getSaldo() > cantidad
                        && cuentas.get(i).getLimitePagoInternet() <= cantidad) {
                    cuentas.get(i).setSaldo(cuentas.get(i).getSaldo() - cantidad);
                    cuentas.get(i).setTotalCompra(cuentas.get(i).getTotalCompra() + cantidad);

                }

            }
        }
    }

    /**
     * Permite al usuario crear una cuenta
     * @param numCuenta, es el numero de cuenta de la nnueva cuenta
     * @param saldo, es la cantidd incial que contendrá la cuenta
     * @param limiteDinero, es la cantidad maxima que puede sacar el usuario
     * @param limiteInternet, es la cantidad máxima que se puede gastar en una 
     * compra por internet
     * @param fechaHoy, es la fecha en la que se creó la cuenta
     */
    public void crearCuenta(int numCuenta, int saldo, int limiteDinero,
            int limiteInternet, String fechaHoy) {
        this.cuentas.add(new Cuenta(numCuenta, saldo, limiteDinero, limiteInternet,
                fechaHoy));

    }

    /**
     * Permite al cliente visualizar el total de dinero gastado con una cuenta
     * @param numeroCuenta permite identificar la cuenta con la que se quiere 
     * realizar la acción
     * @return el total de las compras que ha realizado con dicha cuenta
     */
    public int pagosInternet(int numeroCuenta) {

        for (int i = 0; i < cuentas.size(); i++) {

            if (cuentas.get(i).getNumCuenta() == numeroCuenta) {
               return cuentas.get(i).getTotalCompra();
            }
        }
        return 0;

    }

}
