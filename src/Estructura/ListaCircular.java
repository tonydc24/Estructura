/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura;

import MisClases.Comida;

/**
 *
 * @author Anthony
 */
public class ListaCircular {
    private NodoIngrediente cabeza;
    private int size; // Variable para rastrear el tamaño de la lista

    public ListaCircular() {
        cabeza = null;
        size = 0;
    }

    public void insertar(Comida ingrediente) {
        if (size >= 5) {
            // La lista ya tiene el máximo de nodos, no se puede agregar más
            return;
        }

        NodoIngrediente nuevoNodo = new NodoIngrediente(ingrediente);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.setSiguiente(cabeza);
            size = 1; // Establecer el tamaño en 1
        } else {
            NodoIngrediente  temp = cabeza;
            while (temp.getSiguiente() != cabeza) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(cabeza);
            size++; // Incrementar el tamaño de la lista
        }
    }
    
     public void eliminar(int posicion) {
        if (cabeza == null || posicion < 0 || posicion >= size) {
            // No se puede eliminar si la lista está vacía o la posición es inválida
            return;
        }

        if (posicion == 0) {
            if (cabeza.getSiguiente() == cabeza) {
                // La lista solo tiene un nodo
                cabeza = null;
                size = 0;
                return;
            } else {
                NodoIngrediente temp = cabeza;
                while (temp.getSiguiente() != cabeza) {
                    temp = temp.getSiguiente();
                }
                temp.setSiguiente(cabeza.getSiguiente());
                cabeza = cabeza.getSiguiente();
                size--;
                return;
            }
        }

        NodoIngrediente temp = cabeza;
        for (int i = 0; i < posicion - 1; i++) {
            temp = temp.getSiguiente();
        }
        temp.setSiguiente(temp.getSiguiente().getSiguiente());
        size--;
    }

    public NodoIngrediente getCabeza() {
        return cabeza;
    }
}

