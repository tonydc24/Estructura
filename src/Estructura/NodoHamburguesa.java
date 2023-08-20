/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura;

import MisClases.Orden;

/**
 *
 * @author Anthony
 */
public class NodoHamburguesa {
    private Orden orden;
    private NodoHamburguesa siguiente;

    public NodoHamburguesa(Orden orden) {
        this.orden = orden;
        this.siguiente = null;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public NodoHamburguesa getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoHamburguesa siguiente) {
        this.siguiente = siguiente;
    }
}
