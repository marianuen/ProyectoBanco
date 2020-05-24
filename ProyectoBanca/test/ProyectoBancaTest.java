/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import proyectobanca.Cliente;
import proyectobanca.Cuenta;
import proyectobanca.Gestor;

/**
 *
 * @author maria
 */
public class ProyectoBancaTest {

    private static Gestor gestor1 = new Gestor();
    private static Cliente cliente1 = new Cliente("Maria", "Nunez", "Enriquez", "calle",
                 "A1", 7222, 18);
    private static Cuenta cuenta1=new Cuenta(789,21,100,100,"21/04/2019");

    @Test
    public void crearCienteTest() {
        
        gestor1.crearPerfil("Maria", "Nunez", "Enriquez", "calle",
                 "123A", 7222, 18);

        assertTrue(gestor1.getClientes().get(0).getNombre().equalsIgnoreCase("Maria"));
        assertTrue(gestor1.getClientes().get(0).getApellido1().equals("Nunez"));
        assertTrue(gestor1.getClientes().get(0).getApellido2().equals("Enriquez"));
        assertTrue(gestor1.getClientes().get(0).getDireccion().equals("calle"));
        assertTrue(gestor1.getClientes().get(0).getNif().equals("123A"));
        assertTrue(gestor1.getClientes().get(0).getTelefono() == 7222);
        assertTrue(gestor1.getClientes().get(0).getEdad() == 18);
    }
    
    @Test
    public void modificarClienteTest() {
        
        gestor1.modificarCliente("123A", "Carla", "Ramirez", "Romero", "calle",
                 "456", 2, 20);
        assertTrue(gestor1.getClientes().get(0).getNombre().equals("Carla"));
        assertTrue(gestor1.getClientes().get(0).getApellido1().equals("Ramirez"));
        assertTrue(gestor1.getClientes().get(0).getApellido2().equals("Romero"));
        assertTrue(gestor1.getClientes().get(0).getDireccion().equals("calle"));
        assertTrue(gestor1.getClientes().get(0).getNif().equals("456"));
        assertTrue(gestor1.getClientes().get(0).getTelefono() == 2);
        assertTrue(gestor1.getClientes().get(0).getEdad() == 20);
    }
    
    @Test
    public void crearCuentaTest(){
        
        cliente1.crearCuenta(1, 100, 200, 1, "12/05/2001");
        
        
        assertTrue(cliente1.getCuentas().get(0).getNumCuenta()==1);
        assertTrue(cliente1.getCuentas().get(0).getSaldo() == 100 );
        assertTrue(cliente1.getCuentas().get(0).getLimiteRetiradaCajero()==200);
        assertTrue(cliente1.getCuentas().get(0).getLimitePagoInternet()==1);
        assertTrue(cliente1.getCuentas().get(0).getFechaApertura().equals("12/05/2001"));

    }
    
    @Test
    public void ingresarDineroTest(){
        cliente1.ingresarDinero(1, 10);
        assertTrue(cliente1.getCuentas().get(0).getSaldo() == 110 );
    }
    
    @Test
    public void retirarDineroTest(){
        cliente1.retirarDinero(1, 10);
        assertTrue(cliente1.getCuentas().get(0).getSaldo() == 100 );
    }
    

}
