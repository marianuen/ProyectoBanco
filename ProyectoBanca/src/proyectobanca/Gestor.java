
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

    /**
     * Permite acceder al arrayList clientes
     * @return ArrayList clientes
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Permite crear un nuevo perfil para un nuevo cliente
     * @param nombre, es el nombre del nuevo cliente
     * @param apellido1, es el primer apellido del nuevo cliente
     * @param apellido2, es el segundo apellido del nuevo cliente
     * @param direccion, es la direccion del nuevo cliente
     * @param nif, es el NIF del nuevo cliente
     * @param telefono, es el telefono del nuevo cliente
     * @param edad, es la edad del nuevo cliente
     */
    public void crearPerfil(String nombre, String apellido1, String apellido2,
            String direccion, String nif, int telefono, int edad) {

        clientes.add(new Cliente(nombre, apellido1, apellido2, direccion, nif, telefono, edad));
    }

    /**
     * Permite modificar los datos de un cliente ya existente
     * @param nifCliente, permite comprobar la existencia del cliente del que 
     * modificaremos los datos
     * @param nombre, es el nuevo nombre que recibirá
     * @param apellido1, es el nuevo primer apellido que recibirá
     * @param apellido2, es el nuevo segundo apellido que recibirá
     * @param direccion, es la nueva direccion que recibirá
     * @param nuevoNif, es el nuevo NIF que recibirá
     * @param telefono, es el nuevo tlefono que recibirá
     * @param edad, es la nueva edad que recibirá
     */
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
