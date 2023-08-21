/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import MisClases.Comida;
import MisClases.Player;
import Math.Colision;
import Math.Vector2D;
import MisClases.IngredientesControl;
import MisClases.OrdenControl;
import graphics.AssetsG;
import graphics.Sound;
import input.Keyboard;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferStrategy;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

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
    private Player player;
    private Comida comida;
    private Keyboard keyBoard;
    private Sound background;
    //Estructura cinta
    private IngredientesControl ingredientes;
    //Estructura ordenes
    private OrdenControl orden;
    private long lastOrderTime = System.currentTimeMillis();
    private static final long intervalOrden = 20000;
    //Contador Juego
    private long startTime;
    private long elapsedTime;
    private long timeLimit = 2 * 60 * 1000;
    private String timeFormatted;
    //Puntos
    private int puntosTotal;

    public Window() {

        Vector2D playerPosition = new Vector2D(400, 300);
        Colision playerHitbox = new Colision(playerPosition, 72, 117);
        player = new Player(playerPosition, AssetsG.down, playerHitbox);

        setTitle("NOT Overcooked");
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

    private void init() {

        AssetsG.init();
        startTime = System.currentTimeMillis();
        orden = new OrdenControl();
        ingredientes = new IngredientesControl();

        background = new Sound(AssetsG.backgroundMusic);
        background.play();

    }

    private void update() {//Actualiza mi juego
        keyBoard.update();
        //Actualiza/recibe los datos del teclado ejemplo el WASD
        ingredientes.generarIngrediente();
        player.update();
        long currentTime = System.currentTimeMillis();//Agarrar tiempo actual
        if (currentTime - lastOrderTime >= intervalOrden) {
            orden.generarOrdenAleatoria();
            lastOrderTime = currentTime;
            //Si el tiempo actual menos la ultima vez que genero una orden es
            //mayor a 20 o sea el intervalo , genera una nueva orden
        }
        Rectangle trashbin = new Rectangle(610, 440, 90, 90);

        //Actualiza el juego , ejemplo cuando se mueve el player
        //o se mueve algun objeto en la banda transportadora
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
        g.drawImage(AssetsG.fondo, 0, 0, null);
        g.drawImage(AssetsG.trash, 615, 440, null);
        g.drawImage(AssetsG.mesa, 110, 440, null);
        ingredientes.drawIngrediente(g);
        player.draw(g);
        //Dibujo los items en pantalla

        g.setColor(Color.black);
        g.setFont(new Font("Roboto", Font.BOLD, 12));
        g.drawString("" + avFps, 4, 13);

        //
        // Actualizar y mostrar el temporizador en el JLabel
        elapsedTime = System.currentTimeMillis() - startTime;
        long remainingTime = timeLimit - elapsedTime;
        timeFormatted = String.format("%02d:%02d", TimeUnit.MILLISECONDS.toMinutes(remainingTime),
                TimeUnit.MILLISECONDS.toSeconds(remainingTime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(remainingTime)));

        g.drawString("Tiempo restante: " + timeFormatted, 640, 21);
        g.drawString("Puntos: " + puntosTotal, 640, 41);
        orden.drawOrden(g);

        g.dispose();
        bs.show();
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
        Timer timer = new Timer(120000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int option = JOptionPane.showConfirmDialog(null,
                        "FIN DEL JUEGO" + "\nPuntaje Total:" + puntosTotal,
                        "FIN DEL JUEGO", JOptionPane.OK_CANCEL_OPTION);

                // Verificar si se seleccionó "Ok"
                if (option == JOptionPane.OK_OPTION) {
                    // Cerrar el programa
                    System.exit(0);
                }

                dispose();
            }
        });
        timer.setRepeats(false); // No se repite automáticamente
        timer.start();

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
