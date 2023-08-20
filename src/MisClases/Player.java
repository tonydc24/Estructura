/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;


import MisClases.Objetos;
import MisClases.Comida;
import Math.Colision;
import Math.Vector2D;
import java.awt.image.BufferedImage;
import graphics.AssetsG;
import input.Keyboard;
import java.awt.Graphics;
//Clase hija de la clase Objetos
public class Player extends Objetos {
    private Comida ingrediente;
    private boolean isHoldingObject = false;
    public Player(Vector2D position, BufferedImage textura,Colision hitbox ) {
        super(position, textura,hitbox);
        
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
//        if (hitbox.intersects(ingrediente.getHitbox())) {
//        if (Keyboard.e) {
//            if (!isHoldingObject) {
//                isHoldingObject = true;
//                ingrediente.setPosition(new Vector2D(position.getX(), position.getY()));
//                ingrediente.getHitbox().setSize(0, 0);
//                // Realiza la acción de recolección: el jugador ahora lleva el objeto
//            }
//        }
//    }
        
     
     
    }
     public void pickUpIngrediente(Comida ingrediente) {
        isHoldingObject = true;
        this.ingrediente = ingrediente;
        this.ingrediente.setPosition(new Vector2D(position.getX(), position.getY()));
        this.ingrediente.getHitbox().setSize(0, 0);
    }
    

    @Override
    public void draw(Graphics g) {
        g.drawImage(textura, (int) position.getX(), (int) position.getY(), null);
        g.drawRect((int) position.getX(), (int) position.getY(), 0,0 );
         if (isHoldingObject) {
            // Dibuja el objeto en la posición del jugador
            BufferedImage objectInHand = ingrediente.getTextura();
            g.drawImage(objectInHand, (int) position.getX(), (int) position.getY(), null);
        }
    }
    }

