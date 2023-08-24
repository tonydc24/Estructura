/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import estructuras.ListaIngredientes;

import Math.Vector2D;
import java.awt.image.BufferedImage;
import graphics.AssetsG;
import input.Keyboard;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
//Clase hija de la clase Objetos

public class Player extends Objetos {

    private ListaIngredientes ingrediente;
    private IngredientesControl ingredientesControl;
    private boolean isHoldingObject = false;

    public Player(Vector2D position, BufferedImage textura, Rectangle hitbox) {
        super(position, textura, hitbox);

    }

    @Override
    public void update() {
        int deltaX = 0;
        int deltaY = 0;

        if (Keyboard.right) {
            deltaX = 4;
            textura = AssetsG.right;
        }
        if (Keyboard.left) {
            deltaX = -4;
            textura = AssetsG.left;
        }
        if (Keyboard.up) {
            deltaY = -4;
            textura = AssetsG.player;
        }
        if (Keyboard.down) {
            deltaY = 4;
            textura = AssetsG.down;
        }

        // Calcula la nueva posición después del movimiento
        // Limita el movimiento dentro de los límites del juego
        if (position.getX() + deltaX >= 120 && position.getX() + deltaX <= 640) {
            position.setX(position.getX() + deltaX);
        }
        if (position.getY() + deltaY >= 190 && position.getY() + deltaY <= 400) {
            position.setY(position.getY() + deltaY);
        }

        Vector2D newPosition = new Vector2D(position.getX() + deltaX, position.getY() + deltaY);
        hitbox.setLocation((int) newPosition.getX(), (int) newPosition.getY());

    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // Dibuja la textura del jugador
        g.drawImage(textura, (int) position.getX(), (int) position.getY(), null);

        // Dibuja el rectángulo de colisión del jugador en rojo
        g2d.setColor(Color.RED);
        g2d.draw(hitbox);

        // Dibuja el ingrediente sostenido encima del jugador si lo hay
        if (ingredientesControl != null) {
            BufferedImage ingredienteImage = ingredientesControl.getLista().getCabeza().getIngrediente().getTextura();
            g.drawImage(ingredienteImage, (int) position.getX(), (int) position.getY() - ingredienteImage.getHeight(), null);
        }

        // Dibuja los rectángulos de colisión de los ingredientes en azul
    }
}
