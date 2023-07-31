/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.image.BufferedImage;


public class Texturas {
  public static BufferedImage player;
  public static BufferedImage down;
  public static BufferedImage left;
  public static BufferedImage right;

    public static void init() {

        player = Loader.imageLoader("Assets/back.png");
        down= Loader.imageLoader("Assets/front.png");
        left=Loader.imageLoader("Assets/left.png");
        right = Loader.imageLoader("Assets/right.png");
    }  
}
