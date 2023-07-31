/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.image.BufferedImage;
import graphics.Loader;

public class Player {
    public static BufferedImage player;
    
    public static void init(){
    
        player = Loader.imageLoader("Assets/front.png");
        
    }
}
