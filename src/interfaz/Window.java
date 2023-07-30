/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.awt.Canvas;
import javax.swing.JFrame;

/**
 *
 * @author antho
 */
public class Window extends JFrame {
   
    public static final int width = 800, height = 600;
    private Canvas canvas;
    public Window() {
        setTitle("Juego");
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();

    }
}
