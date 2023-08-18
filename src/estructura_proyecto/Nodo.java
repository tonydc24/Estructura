/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura_proyecto;

import Clases.Ingrediente;

/**
 *
 * @author Tony
 */
public class Nodo {

    private Ingrediente dato;
    private Nodo next;

    public Nodo(Ingrediente dato) {
        this.dato = dato;
        this.next = null;
    }

    public Ingrediente getDato() {
        return dato;
    }

    public void setDato(Ingrediente dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
