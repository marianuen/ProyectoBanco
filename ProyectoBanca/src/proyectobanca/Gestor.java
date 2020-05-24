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
public class Gestor {

    Scanner sc = new Scanner(System.in);

    private ArrayList<Cliente> clientes = new ArrayList<>();

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void crearPerfil(String nombre, String apellido1, String apellido2,
            String direccion, String nif, int telefono, int edad) {

        clientes.add(new Cliente(nombre, apellido1, apellido2, direccion, nif, telefono, edad));
    }

    public void modificarCliente(String nifCliente, String nombre, String apellido1,
            String apellido2, String direccion, String nuevoNif, int telefono, int edad) {

        for (int i = 0; i < clientes.size(); i++) {

            if (clientes.get(i).getNif().equals(nifCliente)) {

                clientes.get(i).setNombre(nombre);
                clientes.get(i).setApellido1(apellido1);
                clientes.get(i).setApellido2(apellido2);
                clientes.get(i).setDireccion(direccion);
                clientes.get(i).setNif(nuevoNif);
                clientes.get(i).setTelefono(telefono);
                clientes.get(i).setEdad(edad);

            }
        }

    }
}
