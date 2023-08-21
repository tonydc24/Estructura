/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

import Math.Colision;
import Math.Vector2D;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Comida extends Objetos {
    private int Indentificador;
    public Comida(Vector2D position, BufferedImage textura, Colision hitbox,int Indentificador) {
        super(position, textura, hitbox);
        this.Indentificador= Indentificador;
    }

    public BufferedImage getTextura() {
        return textura;
    }

    public void setTextura(BufferedImage textura) {
        this.textura = textura;
    }

    public Vector2D getPosition() {
        return position;
    }

    public void setPosition(Vector2D position) {
        this.position = position;
    }

    public Colision getHitbox() {
        return hitbox;
    }

    public void setHitbox(Colision hitbox) {
        this.hitbox = hitbox;
    }

    public int getIndentificador() {
        return Indentificador;
    }

    public void setIndentificador(int Indentificador) {
        this.Indentificador = Indentificador;
    }
    

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(textura, (int) position.getX(), (int) position.getY(), null);
    }

}
