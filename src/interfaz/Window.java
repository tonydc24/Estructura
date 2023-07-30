/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author antho
 */
public class Window extends JFrame implements Runnable {

    public static final int width = 800, height = 600;
    private Canvas canvas;
    private Thread thread;

    public Window() {
        setTitle("Juego");
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        setVisible(true);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));
        canvas.setFocusable(true);

        add(canvas);
    }

    public static void main(String[] args) {
        new Window();

    }

    @Override
    public void run() {

    }

    private void start() {

    }

    private void stop() {
    }
}
