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
    private ArrayList<Cuenta> cuentas;

    Scanner sc = new Scanner(System.in);

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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void ingresarDinero(int numeroCuenta, int cantidad) {

        for (int i = 0; i < cuentas.size(); i++) {

            if (cuentas.get(i).getNumCuenta() == numeroCuenta) {

                cuentas.get(i).setSaldo(cuentas.get(i).getSaldo() + cantidad);
            }
        }
    }

    public void retirarDinero(int numeroCuenta, int cantidad) {

        for (int i = 0; i < cuentas.size(); i++) {

            if (cuentas.get(i).getNumCuenta() == numeroCuenta) {

                if (cuentas.get(i).getSaldo() > cantidad
                        && cuentas.get(i).getLimiteRetiradaCajero() >= cantidad) {

                    cuentas.get(i).setSaldo(cuentas.get(i).getSaldo() - cantidad);
                } else {
                    System.out.println("No se ha podido realizar la operación");
                }

            }
        }
    }

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

    public void crearCuenta(int numCuenta, int saldo, int limiteDinero,
            int limiteInternet, String fechaHoy) {
        this.cuentas.add(new Cuenta(numCuenta, saldo, limiteDinero, limiteInternet,
                fechaHoy));

    }

    public void pagosInternet(int numeroCuenta) {

        for (int i = 0; i < cuentas.size(); i++) {

            if (cuentas.get(i).getNumCuenta() == numeroCuenta) {
                System.out.println("El total de pagos realizados por internet es"
                        + ": " + cuentas.get(i).getTotalCompra());
            }
        }

    }
}
