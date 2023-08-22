/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

import Math.Vector2D;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

//Super clase de objetos
public abstract class Objetos {

    protected BufferedImage textura;
    protected Vector2D position;
    protected Rectangle hitbox;

    public Objetos(Vector2D position, BufferedImage textura, Rectangle hitbox) {
        this.textura = textura;
        this.position = position;
        this.hitbox = hitbox;
    }

    public abstract void update();

    public abstract void draw(Graphics g);

    public Vector2D getPosition() {
        return position;
    }

    public void setPosition(Vector2D position) {
        this.position = position;
    }

    public BufferedImage getTextura() {
        return textura;
    }

    public void setTextura(BufferedImage textura) {
        this.textura = textura;
    }

    public Rectangle getHitbox() {
        return hitbox;
    }

    public void setHitbox(Rectangle hitbox) {
        this.hitbox = hitbox;
    }

}
