/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import objetos.Orden;
import java.awt.Graphics;

/**
 *
 * @author Anthony
 */
public class Cola {

    private NodoHamburguesa frente;
    private NodoHamburguesa ultimo;
    private int size;
    private static final int MAXIMO_ORDENES = 3;

    public Cola() {
        this.frente = null;
        this.ultimo = null;
        this.size = 0;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public boolean estaLlena() {

        return size >= MAXIMO_ORDENES;
    }

    public NodoHamburguesa getFrente() {
        return frente;
    }

    public void inserta(Orden orden) {
        if (!estaLlena()) {
            NodoHamburguesa nuevoNodo = new NodoHamburguesa(orden);
            if (estaVacia()) {
                frente = nuevoNodo;
                ultimo = nuevoNodo;
            } else {
                ultimo.setSiguiente(nuevoNodo);
                ultimo = nuevoNodo;
            }
            size++;
        }
    }

    public NodoHamburguesa elimina() {
        NodoHamburguesa aux = frente;

        if (frente != null) {
            frente = frente.getSiguiente();
            aux.setSiguiente(null);

            size--;
        }
        return aux;
    }

    public void drawOrdenes(Graphics g, int x, int y) {
        NodoHamburguesa aux = frente;
        String ordenInfo = "";
        y = 40;
        while (aux != null) {
            ordenInfo = "Orden:" + aux.getOrden().getTipoHamburguesa()
                    + " Puntos/ " + aux.getOrden().getPuntos();
            g.drawString(ordenInfo, 300, y);
            y += 30;
            aux = aux.getSiguiente();

        }
    }

}
