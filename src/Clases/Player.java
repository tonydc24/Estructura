/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Math.Vector2D;
import java.awt.image.BufferedImage;
import graphics.Loader;
import java.awt.Graphics;
//Clase hija de la clase Objetos
public class Player extends Objetos {

    public Player(Vector2D position, BufferedImage textura) {
        super(position, textura);
    }

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(textura, (int) position.getX(), (int) position.getY(),
                null);

    }
}
