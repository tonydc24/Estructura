/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.image.BufferedImage;

/**
 *
 * @author Anthony
 */
public class Texturas {
  public static BufferedImage player;

    public static void init() {

        player = Loader.imageLoader("Assets/front.png");
    }  
}
