/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;


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
