/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

import Estructura.ListaCircular;

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
    private ListaCircular lista;

    public IngredientesControl() {
        lista = new ListaCircular();
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
            return new Vector2D(600, 200);
        } else if (size == 1) {
            return new Vector2D(500, 200);
        } else if (size == 2) {
            return new Vector2D(400, 200);
        } else if (size == 3) {
            return new Vector2D(300, 200);
        } else if (size == 4) {

        }

        return new Vector2D(200, 200);

    }

    public void drawIngrediente(Graphics g) {
        lista.drawIngrediente(g);
    }
    public ListaCircular getLista() {
        
        return lista;
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(4) + 1;
    }

}
