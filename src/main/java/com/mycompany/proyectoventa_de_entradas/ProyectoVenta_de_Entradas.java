
package com.mycompany.proyectoventa_de_entradas;

import controlador.ControladorAdminDashboard;
import java.util.ArrayList;
import java.util.Date;
import modelo.Concierto;
import modelo.Venta;
import vista.frmAdminDashboard;

/**
 *
 * @author juane
 */
public class ProyectoVenta_de_Entradas {

    public static void main(String[] args) {
        // 1. Creamos e inicializamos las listas de datos directamente aquí en el Main
        ArrayList<Concierto> conciertosIniciales = new ArrayList<>();
        ArrayList<Venta> ventasIniciales = new ArrayList<>();

        // Quemamos/Agregamos los datos de prueba directamente aquí para que la tabla no aparezca vacía
        ventasIniciales.add(new Venta(new Date(), 150));
        ventasIniciales.add(new Venta(new Date(System.currentTimeMillis() - 86400000), 320));
        ventasIniciales.add(new Venta(new Date(System.currentTimeMillis() - 172800000), 90));

        // 2. Instanciamos la vista raíz (el Dashboard del Administrador)
        frmAdminDashboard vistaDashboard = new frmAdminDashboard();
        
        // 3. Inicializamos el controlador inyectándole las listas que acabamos de crear arriba
        ControladorAdminDashboard controlador = new ControladorAdminDashboard(vistaDashboard, conciertosIniciales, ventasIniciales);
        
        // 4. Lanzamos el flujo de la interfaz gráfica
        controlador.iniciar();
    }
}
