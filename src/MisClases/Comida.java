/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

import Math.Colision;
import Math.Vector2D;
import graphics.Loader;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Comida extends Objetos{

    private int ingrediente;
   
    

    public Comida(Vector2D position, BufferedImage textura,Colision hitbox) {
        super(position, textura,hitbox);
    }


    @Override
    public void update() {
        
        
    }

    @Override
    public void draw(Graphics g) {
         g.drawImage(textura, (int) position.getX(), (int) position.getY(), null);  
    }

}
