/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Math;

import java.awt.Rectangle;

/**
 *
 * @author Anthony
 */
public class Colision extends Rectangle {

    private Vector2D position;

    public Colision(Vector2D position, int width, int height) {
        super((int) position.getX(), (int) position.getY(), width, height);
        this.position = position;
    }

    public Vector2D getPosition() {
        return position;
    }

    public void updatePosition() {
        x = (int) position.getX();
        y = (int) position.getY();
    }
}
