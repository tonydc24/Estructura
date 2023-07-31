/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import Clases.Game;
import Clases.Comida;
import Clases.Player;
import graphics.Texturas;
import input.Keyboard;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
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
    private Game gameS;
    private Keyboard keyBoard;
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
        keyBoard = new Keyboard();
        
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));
        canvas.setFocusable(true);

        add(canvas);
        canvas.addKeyListener(keyBoard);
    }

    public static void main(String[] args) {
        new Window().start();

    }

    private void update() {//Actualiza mi juego
        keyBoard.update();
        gameS.update();
    }

    private void draw() {//Inseta items en mi juego
        bs = canvas.getBufferStrategy();

        if (bs == null) {
            canvas.createBufferStrategy(2);
            return;

        }
        g = bs.getDrawGraphics();
        //
        g.setColor(Color.black);

        g.fillRect(0, 0, width, height);
       
        gameS.draw(g);
      
        g.setColor(Color.white);
        g.drawString("" + avFps, 4, 13);

        //
        g.dispose();
        bs.show();
    }

    private void init() {

        Texturas.init();
        gameS=new Game();
    
    }

    @Override
    public void run() {

        long now = 0;
        long lastTime = System.nanoTime();
        int frames = 0;
        long time = 0;
        
        init();
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
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
