/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.image.BufferedImage;
import javax.sound.sampled.Clip;
import java.util.Random;

public class AssetsG {
    public static BufferedImage player;
    public static BufferedImage down;
    public static BufferedImage left;
    public static BufferedImage right;
    public static BufferedImage fondo;
   
    public static BufferedImage trash;
    public static BufferedImage mesa;
    
    
    public static BufferedImage carne;
    public static BufferedImage pan;
    public static BufferedImage lechuga;
    public static BufferedImage queso;
    
    public static BufferedImage Hcarne;
    public static BufferedImage Hqueso;
    public static BufferedImage Hclasica;
    
    
   
    
    public static Clip backgroundMusic;//Seleciona el png del objeto
    public static void init() {
        //Player png
        player = Loader.imageLoader("Assets/images/back.png");
        down= Loader.imageLoader("Assets/images/front.png");
        left=Loader.imageLoader("Assets/images/left.png");
        right = Loader.imageLoader("Assets/images/right.png");
        //Player png
        //
        //
        //Fondo png
        fondo=Loader.imageLoader("Assets/images/fondo.png");
        //Fondgo png
        //
        //
        //Interactivos png 
        trash = Loader.imageLoader("Assets/images/trash.png");
        mesa = Loader.imageLoader("Assets/images/table.png");
        //Interactivos png
        //
        //
        //Ingrediente png
        carne = Loader.imageLoader("Assets/images/meat.png");
        lechuga = Loader.imageLoader("Assets/images/lechuga.png");
        queso = Loader.imageLoader("Assets/images/cheese.png");
        pan = Loader.imageLoader("Assets/images/bread.png");
        //Ingrediente png
        //
        //Hamburguesas png
        Hcarne = Loader.imageLoader("Assets/images/Hmeat.png");
        Hqueso = Loader.imageLoader("Assets/images/Hcheese.png");
        Hclasica = Loader.imageLoader("Assets/images/Hclassic.png");
        //Hamburguesas png
        //

        //Cargar sonidos
        backgroundMusic = Loader.loadSound("Assets/sound/backgroundMusic.wav");
    }

}
