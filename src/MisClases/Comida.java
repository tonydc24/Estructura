/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;


import Math.Vector2D;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

    public class Comida extends Objetos {

        private int identificador;

        public Comida(Vector2D position, BufferedImage textura, Rectangle hitbox, int identificador) {
            super(position, textura, hitbox);
            this.identificador = identificador;
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

        public Rectangle getHitbox() {
            return hitbox;
        }

        public void setHitbox(Rectangle hitbox) {
            this.hitbox = hitbox;
        }

        public int getIdentificador() {
            return identificador;
        }

        public void setIdentificador(int identificador) {
            this.identificador = identificador;
        }

        @Override
        public void update() {

        }

        @Override
        public void draw(Graphics g) {
            g.drawImage(textura, (int) position.getX(), (int) position.getY(), null);
        }

    }
