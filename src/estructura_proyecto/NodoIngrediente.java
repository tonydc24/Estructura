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
public class NodoIngrediente {

    private Ingrediente dato;
    private NodoIngrediente next;

    public NodoIngrediente(Ingrediente dato) {
        this.dato = dato;
        this.next = null;
    }

    public Ingrediente getDato() {
        return dato;
    }

    public void setDato(Ingrediente dato) {
        this.dato = dato;
    }

    public NodoIngrediente getNext() {
        return next;
    }

    public void setNext(NodoIngrediente next) {
        this.next = next;
    }
}
