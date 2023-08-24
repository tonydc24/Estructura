/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import Math.Vector2D;
import objetos.Comida;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

/**
 *
 * @author Anthony
 */
public class ListaIngredientes {

    private NodoIngrediente cabeza;
    private int size; // Variable para rastrear el tamaño de la lista
    private static final int MAXIMO_INGREDIENTES = 5;
    private NodoIngrediente ingredienteActual ;
    public ListaIngredientes() {
        cabeza = null;
        size = 0;
        ingredienteActual = cabeza;
    }

    public int getSize() {
        return size;
    }

    public boolean estaLlena() {

        return size >= MAXIMO_INGREDIENTES;
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

   public Vector2D obtenerSiguientePosicion() {
        if (ingredienteActual == null) {
            return null; // No hay ingredientes en la lista
        }

        Vector2D siguientePosicion = ingredienteActual.getIngrediente().getPosition();
        ingredienteActual = ingredienteActual.getSiguiente(); // Mover al siguiente nodo
        System.out.println(ingredienteActual.getIngrediente().getIdentificador());

        return siguientePosicion;
    }

//    public Rectangle valores() {
//        NodoIngrediente aux = cabeza;
//
//        while (aux != null) {
//
////            Rectangle hitbox = aux.getIngrediente().getHitbox();
//            System.out.println(aux.getIngrediente().getIdentificador());
//
//            aux = aux.getSiguiente(); // Avanzar al siguiente nodo
//
//        }
//
//        // Si el bucle termina sin encontrar un return, retorna null o realiza otro manejo
//        return null;
//    }
    public void drawIngrediente(Graphics g) {
        NodoIngrediente aux = cabeza;
        double xDouble;
        double yDouble;

        int i = 0;
        BufferedImage imagen;
        while (i < getSize()) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.blue);
            g2d.draw(aux.getIngrediente().getHitbox());
            // Dibuja el rectángulo de colisión del jugador en rojo

            imagen = aux.getIngrediente().getTextura();
            xDouble = aux.getIngrediente().getPosition().getX();
            yDouble = aux.getIngrediente().getPosition().getY();

            // Ajusta el espaciado entre ingredientes
            g.drawImage(imagen, (int) xDouble, (int) yDouble, null);

            aux = aux.getSiguiente();
            i++;
        }
    }

    public NodoIngrediente getCabeza() {
        return cabeza;
    }

}
