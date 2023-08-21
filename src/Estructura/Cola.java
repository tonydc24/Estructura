/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura;

import MisClases.Orden;
import java.awt.Graphics;

/**
 *
 * @author Anthony
 */
public class Cola {

    private NodoHamburguesa frente;
    private NodoHamburguesa ultimo;
    private int size;
    private static final int MAX_ORDENES = 3;

    public Cola() {
        this.frente = null;
        this.ultimo = null;
        this.size = 0;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public boolean estaLlena() {

        return size >= MAX_ORDENES;
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
        if (!estaVacia()) {
            NodoHamburguesa nodoEliminado = frente;
            frente = frente.getSiguiente();
            nodoEliminado.setSiguiente(null);
            if (frente == null) {
                ultimo = null;
            }
            size--;
            return nodoEliminado;
        }
        return null;
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
