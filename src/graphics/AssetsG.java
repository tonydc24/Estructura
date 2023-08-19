/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.image.BufferedImage;
import javax.sound.sampled.Clip;


public class AssetsG {
    public static BufferedImage player;
    public static BufferedImage down;
    public static BufferedImage left;
    public static BufferedImage right;
    public static BufferedImage fondo;
    public static BufferedImage lechuga;
    public static BufferedImage trash;
  public static Clip backgroundMusic;//Seleciona el png del objeto
    public static void init() {

        player = Loader.imageLoader("Assets/images/back.png");
        down= Loader.imageLoader("Assets/images/front.png");
        left=Loader.imageLoader("Assets/images/left.png");
        right = Loader.imageLoader("Assets/images/right.png");
        fondo=Loader.imageLoader("Assets/images/fondo.png");
        lechuga=Loader.imageLoader("Assets/images/lechuga.png");
        trash=Loader.imageLoader("Assets/images/trash.png");

        //Cargar sonidos
        backgroundMusic = Loader.loadSound("Assets/sound/backgroundMusic.wav");
    }  
}
