/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura_proyecto;

import Clases.Orden;

/**
 *
 * @author Usuario
 */
public class NodoOrdenes {
    Orden dato;
    NodoOrdenes atras;

    public NodoOrdenes(Orden dato) {
        this.dato = dato;
        this.atras = null;
    }

    public Orden getDato() {
        return dato;
    }

    public void setDato(Orden dato) {
        this.dato = dato;
    }

    public NodoOrdenes getAtras() {
        return atras;
    }

    public void setAtras(NodoOrdenes atras) {
        this.atras = atras;
    }
}
