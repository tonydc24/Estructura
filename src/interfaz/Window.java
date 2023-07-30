/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author antho
 */
public class Window extends JFrame implements Runnable {

    public static final int width = 800, height = 600;
    private Canvas canvas;
    private Thread thread;
    private boolean running = false;

    private BufferStrategy bs;
    private Graphics g;
    //
    private final int fps = 60;
    private double targetTime = 1000000000 / fps;    //Estas variables me permiten 
    private double delta = 0;                     //controlar los fps del juego
    private int avFps = fps;

    //
    public Window() {
        setTitle("Juego");
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);//No permite cambiar el size de la ventana
        setLocationRelativeTo(null);//Inicia la ventana en  medio del screen
        //Agrego funciones basicas como el ancho y la altura ,
        //la opcion de salir de la ventana 
        setVisible(true);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));
        canvas.setFocusable(true);

        add(canvas);
    }

    public static void main(String[] args) {
        new Window().start();

    }
    int x = 0;

    private void update() {//Actualiza mi juego
        x++;
    }

    private void draw() {//Inseta items en mi juego
        bs = canvas.getBufferStrategy();

        if (bs == null) {
            canvas.createBufferStrategy(2);
            return;

        }
        g = bs.getDrawGraphics();
        //
        g.clearRect(0, 0, width, height);
        
        g.setColor(Color.black);
        
        g.drawString(""+avFps, 100, 100);

        //
        g.dispose();
        bs.show();
    }

    @Override
    public void run() {

        long now = 0;
        long lastTime = System.nanoTime();
        int frames = 0;
        long time = 0;
        while (running) {
            now = System.nanoTime();
            delta += (now - lastTime) / targetTime;
            time += (now - lastTime);
            lastTime = now;

            if (delta >= 1) {
                update();
                draw();
                delta--;
                frames++;
            }
            if (time >= 1000000000) {
                avFps = frames;
                frames = 0;
                time = 0;
            }
        }
        stop();

    }

    private void start() {
        thread = new Thread(this);
        thread.start();//Inicia el hilo run()
        running = true;//Permite iniciar el booleano que inicia el juego
    }

    private void stop() {
        try {
            thread.join();
            running = false;//Cierra el booleano para cerrar el juego
        } catch (InterruptedException ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }
}
