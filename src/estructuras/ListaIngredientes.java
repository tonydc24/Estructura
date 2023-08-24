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
import java.awt.image.BufferedImage;

/**
 *
 * @author Anthony
 */
public class ListaIngredientes {

    private NodoIngrediente cabeza;
    private int size; // Variable para rastrear el tamaño de la lista
    private static final int MAXIMO_INGREDIENTES = 4;
    private NodoIngrediente ingredienteActual;
    private Vector2D siguientePosicion;

    public ListaIngredientes() {

        ingredienteActual = cabeza;

    }

    public int getSize() {
        return size;
    }

    public Vector2D getSiguientePosicion() {
        return siguientePosicion;
    }

    public void insertar(Comida ingrediente) {

        // La lista ya tiene el máximo de nodos, no se puede agregar más
        NodoIngrediente nuevoNodo = new NodoIngrediente(ingrediente);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.setSiguiente(cabeza);

        } else {
            NodoIngrediente temp = cabeza;
            while (temp.getSiguiente() != cabeza) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(cabeza);

            // Incrementar el tamaño de la lista
        }

        size++;

    }

    public void elimina(Vector2D posicion) {

        if (cabeza != null) {
            if (cabeza.getIngrediente().getPosition() == posicion) {
                cabeza = cabeza.getSiguiente();
            } else {
                NodoIngrediente aux = cabeza;
                while (aux.getSiguiente() != null
                        && aux.getSiguiente().getIngrediente().getPosition().getX() < posicion.getX()) {
                    aux = aux.getSiguiente();
                }

                if (aux.getSiguiente() != null
                        && aux.getSiguiente().getIngrediente().getPosition() == posicion) {
                    aux.setSiguiente(aux.getSiguiente().getSiguiente()); // cambio las referencias
                }
            }
        }
        size--;
    }

    public Vector2D obtenerSiguientePosicion() {

       
       

        siguientePosicion = cabeza.getIngrediente().getPosition();
        System.out.println(siguientePosicion.getX());
        cabeza = cabeza.getSiguiente();
        
        return siguientePosicion;
    }

    public void drawIngrediente(Graphics g) {
        NodoIngrediente aux = cabeza;
        double xDouble;
        double yDouble;

        int i = 0;
        BufferedImage imagen;
        while (i <= MAXIMO_INGREDIENTES) {

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
