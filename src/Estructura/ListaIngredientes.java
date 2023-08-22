/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura;

import MisClases.Comida;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author Anthony
 */
public class ListaIngredientes {

    private NodoIngrediente cabeza;
    private int size; // Variable para rastrear el tamaño de la lista
    private static final int ingredienteMaximos = 5;

    public ListaIngredientes() {
        cabeza = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }
    public boolean estaLlena() {

        return size >= ingredienteMaximos;
    }
    
    public void insertar(Comida ingrediente) {
        if (!estaLlena()) {
            // La lista ya tiene el máximo de nodos, no se puede agregar más
            
        

        NodoIngrediente nuevoNodo = new NodoIngrediente(ingrediente);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.setSiguiente(cabeza);
            size = 1; // Establecer el tamaño en 1
        } else {
            NodoIngrediente temp = cabeza;
            while (temp.getSiguiente() != cabeza) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(cabeza);
            size++; // Incrementar el tamaño de la lista
        }
        }
    }

    public void eliminar(Comida ingrediente) {
    if (cabeza == null) {
        // La lista está vacía, no hay nada que eliminar
        return;
    }

    if (cabeza.getIngrediente() == ingrediente) {
        // El ingrediente a eliminar está en el primer nodo
        if (cabeza.getSiguiente() == cabeza) {
            // La lista solo tiene un nodo
            cabeza = null;
        } else {
            NodoIngrediente temp = cabeza;
            while (temp.getSiguiente() != cabeza) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(cabeza.getSiguiente());
            cabeza = cabeza.getSiguiente();
        }
        size--;
        return;
    }

    NodoIngrediente temp = cabeza;
    while (temp.getSiguiente() != cabeza) {
        if (temp.getSiguiente().getIngrediente() == ingrediente) {
            temp.setSiguiente(temp.getSiguiente().getSiguiente());
            size--;
            return;
        }
        temp = temp.getSiguiente();
    }
}

    public void drawIngrediente(Graphics g) {
        NodoIngrediente aux = cabeza;
         double xDouble = aux.getIngrediente().getPosition().getX();
        double yDouble = aux.getIngrediente().getPosition().getY();
        int x = (int) xDouble;
        int y = (int) yDouble;
        int i = 0;
        BufferedImage imagen;
        while (i < 5) {
               Graphics2D g2d = (Graphics2D) g;
    
   
    
    // Dibuja el rectángulo de colisión del jugador en rojo
            g2d.setColor(Color.blue);
            g2d.draw(aux.getIngrediente().getHitbox());
            imagen = aux.getIngrediente().getTextura();
            // Ajusta el espaciado entre ingredientes
            g.drawImage(imagen, x, y, null);
            x -= 100;
            aux = aux.getSiguiente();
            i++;
        }
    }

    public NodoIngrediente getCabeza() {
        return cabeza;
    }
    
}
