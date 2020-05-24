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
      
    Scanner sc = new Scanner (System.in);
    
    private ArrayList <Cliente> clientes;
    
    
    public void crearPerfil(){
        
        System.out.println("Introduce el nombre del cliente");
        String nombre = sc.nextLine();
        System.out.println("Introduce el primer apellido del cliente");
        String apellido1 = sc.nextLine();
        System.out.println("Introduce el segundo apellido del cliente");
        String apellido2 = sc.nextLine();
        System.out.println("Introduce la direccion del cliente");
        String direccion = sc.nextLine();
        System.out.println("Introduce el nif del cliente");
        String nif = sc.nextLine();
        System.out.println("Introduce el telefono del cliente");
        int telefono = sc.nextInt();
        System.out.println("Introduce la edad del cliente");
        int edad = sc.nextInt();
        
        
        clientes.add(new Cliente(nombre,apellido1,apellido2,direccion,nif,telefono,edad));
    }
    
    public void modificarCliente(){
        
        System.out.println("Introduce el nif del cliente");
        String nif = sc.nextLine();
        
        for (int i = 0; i < clientes.size(); i++) {
            
            if(clientes.get(i).getNif() == nif){
                
                System.out.println("Introduce el nombre del cliente");
                String nombre = sc.nextLine();
                clientes.get(i).setNombre(nombre);
                
                System.out.println("Introduce el primer apellido del cliente");
                String apellido1 = sc.nextLine();
                clientes.get(i).setApellido1(apellido1);
                
                System.out.println("Introduce el segundo apellido del cliente");
                String apellido2 = sc.nextLine();
                clientes.get(i).setApellido2(apellido2);
                
                System.out.println("Introduce la direccion del cliente");
                String direccion = sc.nextLine();
                clientes.get(i).setDireccion(direccion);
                
                System.out.println("Introduce el nif del cliente");
                String NIF = sc.nextLine();
                clientes.get(i).setNif(NIF);
                
                System.out.println("Introduce el telefono del cliente");
                int telefono = sc.nextInt();
                clientes.get(i).setTelefono(telefono);
                
                System.out.println("Introduce la edad del cliente");
                int edad = sc.nextInt();
                clientes.get(i).setEdad(edad);
                
            }
        }
        
    }
}
