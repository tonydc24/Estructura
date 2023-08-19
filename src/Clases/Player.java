/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Math.Vector2D;
import java.awt.image.BufferedImage;
import graphics.Loader;
import graphics.AssetsG;
import input.Keyboard;
import java.awt.Graphics;
import java.awt.Rectangle;
//Clase hija de la clase Objetos
public class Player extends Objetos {

    public Player(Vector2D position, BufferedImage textura) {
        super(position, textura);
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
          Rectangle playerhitbox = new Rectangle((int) position.getX(), (int) position.getY(), 72, 117);
        Rectangle trashbin = new Rectangle(610, 440, 90, 90);

        if (playerhitbox.intersects(trashbin )) {
            if (Keyboard.e) {
               
            }
            
        }
    }
    

    @Override
    public void draw(Graphics g) {
        g.drawImage(textura, (int) position.getX(), (int) position.getY(), null);
    }
}
