/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura_proyecto;

import Clases.Comida;

/**
 *
 * @author Tony
 */
public class Nodo {
 private Comida dato;
 private Nodo next;

    public Nodo(Comida dato) {
        this.dato = dato;
        this.next = null;
    }
    
    public Comida getDato() {
        return dato;
    }

    public void setDato(Comida dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
}
