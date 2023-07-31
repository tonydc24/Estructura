/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Math.Vector2D;
import graphics.Texturas;
import java.awt.Graphics;

//Clase que inicia los objetos en pantalla
public class Game {
    private Player player;
    public Game(){
        player=new Player(new Vector2D(100,470),Texturas.player);
    }
    public void update(){
    
    
    }
    public void draw(Graphics g){
        player.draw(g);
    }
}
