/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

import Estructura.ListaCircular;
import Math.Colision;
import Math.Vector2D;
import graphics.AssetsG;
import java.awt.Graphics;
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
            Vector2D ingredientePosition = new Vector2D(400, 200);
            Colision ingredienteHitbox = new Colision(ingredientePosition, 52, 47);
            Comida ingrediente = new Comida(
                    ingredientePosition,
                    AssetsG.carne,
                    ingredienteHitbox);
            lista.insertar(ingrediente);
        }
        if (tipoIngrediente == 2) {
            Vector2D ingredientePosition = new Vector2D(400, 200);
            Colision ingredienteHitbox = new Colision(ingredientePosition, 52, 47);
            Comida ingrediente = new Comida(
                    ingredientePosition,
                    AssetsG.queso,
                    ingredienteHitbox);
            lista.insertar(ingrediente);

        }
        if (tipoIngrediente == 3) {
            Vector2D ingredientePosition = new Vector2D(400, 200);
            Colision ingredienteHitbox = new Colision(ingredientePosition, 52, 47);
            Comida ingrediente = new Comida(
                    ingredientePosition,
                    AssetsG.pan,
                    ingredienteHitbox);
            lista.insertar(ingrediente);

        }
        if (tipoIngrediente == 4) {
            Vector2D ingredientePosition = new Vector2D(400, 200);
            Colision ingredienteHitbox = new Colision(ingredientePosition, 52, 47);
            Comida ingrediente = new Comida(
                    ingredientePosition,
                    AssetsG.lechuga,
                    ingredienteHitbox);
            lista.insertar(ingrediente);
        }

    }

    public void drawIngrediente(Graphics g) {
        lista.drawIngrediente(g);
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(4) + 1;
    }

}
