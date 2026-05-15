/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juane
 */
public class Zona {
    
    private String nombre;
    private int capacidad;
    private int precio;
    private Entrada[] listaEntrada;


    public Zona(String nombre, int capacidad, int precio, Entrada[] listaEntradas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precio = precio;
        this.listaEntrada = listaEntradas;
    }
    
    private boolean generarEntradas(){
        return false;
    }
    
    public Entrada[] mostrarEntrada(){
        return listaEntrada;
    }
    
    public Entrada[] venderEntrada(int numero){
        return listaEntrada;
    }
    
}
