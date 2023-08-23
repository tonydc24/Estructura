/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

import Estructura.ListaIngredientes;
import Estructura.NodoHamburguesa;
import Estructura.NodoIngrediente;

import Math.Vector2D;
import graphics.AssetsG;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

/**
 *
 * @author Anthony
 */
public class IngredientesControl {

    private int salto;
    private int inicial;
    private Rectangle colision;
    private ListaIngredientes lista;
     private NodoIngrediente nodo;
    public IngredientesControl() {
        lista = new ListaIngredientes();
        
    }

    public void generarIngrediente() {
        int tipoIngrediente = getRandomNumber();
        if (tipoIngrediente == 1) {
            Vector2D ingredientePosition = posicion(lista.getSize());
            Rectangle ingredienteHitbox = new Rectangle((int) ingredientePosition.getX(),
                     (int) ingredientePosition.getY(), 52, 47);
            Comida ingrediente = new Comida(
                    ingredientePosition,
                    AssetsG.carne,
                    ingredienteHitbox, 5);
            lista.insertar(ingrediente);
        }
        if (tipoIngrediente == 2) {
            Vector2D ingredientePosition = posicion(lista.getSize());
            Rectangle ingredienteHitbox = new Rectangle((int) ingredientePosition.getX(),
                     (int) ingredientePosition.getY(), 52, 47);
            Comida ingrediente = new Comida(
                    ingredientePosition,
                    AssetsG.queso,
                    ingredienteHitbox, 11);
            lista.insertar(ingrediente);

        }
        if (tipoIngrediente == 3) {
            Vector2D ingredientePosition = posicion(lista.getSize());
            Rectangle ingredienteHitbox = new Rectangle((int) ingredientePosition.getX(),
                     (int) ingredientePosition.getY(), 52, 47);
            Comida ingrediente = new Comida(
                    ingredientePosition,
                    AssetsG.pan,
                    ingredienteHitbox, 7);
            lista.insertar(ingrediente);

        }
        if (tipoIngrediente == 4) {
            Vector2D ingredientePosition = posicion(lista.getSize());
            Rectangle ingredienteHitbox = new Rectangle((int) ingredientePosition.getX(),
                     (int) ingredientePosition.getY(), 52, 47);
            Comida ingrediente = new Comida(
                    ingredientePosition,
                    AssetsG.lechuga,
                    ingredienteHitbox, 9);
            lista.insertar(ingrediente);
        }

    }

    public Vector2D posicion(int size) {
        if (size == 0) {
            return new Vector2D(660, 200);
        } else if (size == 1) {
            return new Vector2D(520, 200);
        } else if (size == 2) {
            return new Vector2D(380, 200);
        } else if (size == 3) {
            return new Vector2D(240, 200);
        } else if (size == 4) {

        }

        return new Vector2D(100, 200);

    }

    public void drawIngrediente(Graphics g) {
        lista.drawIngrediente(g);
    }
    public ListaIngredientes getLista() {
        
        return lista;
    }
     public Rectangle Posiciones() {
        
        return lista.valores();
    }
     public boolean colisionConIngredientes(Rectangle playerHitbox) {
        NodoIngrediente aux = lista.getCabeza();
        
        while (aux != null) {
            if (playerHitbox.intersects(aux.getIngrediente().getHitbox())) {
                return true; // Hay colisión con un ingrediente
            }
            aux = aux.getSiguiente();
        }
        
        return false; // No hay colisión con ningún ingrediente
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(4) + 1;
    }

}
