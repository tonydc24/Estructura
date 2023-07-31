/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {
    private boolean[] keys = new boolean[256];
    
    public static boolean up , down , left , right;

    public Keyboard() {
        up=false;
        down=false;
        left=false;
        right=false;

    }
    public void update(){
        up = keys[KeyEvent.VK_W];
        down = keys[KeyEvent.VK_S];
        left = keys[KeyEvent.VK_A];
        right = keys[KeyEvent.VK_D];
    
    }

    @Override
    public void keyPressed(KeyEvent e) {
      keys[e.getKeyCode()]=true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
              keys[e.getKeyCode()]=false;

    }

    @Override
    public void keyTyped(KeyEvent e) {
        //Este metodo no se utiliza 
    }

}
