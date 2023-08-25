/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import javax.sound.sampled.Clip;

/**
 *
 * @author Anthony
 */
public class Sound {

    private Clip clip;

    public Sound(Clip clip) {
        this.clip = clip;

    }

    public void play() {
        clip.setFramePosition(0);
        clip.start();
    }
    
    public void loop() {
        clip.setFramePosition(0);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop() {
        clip.stop();

    }
}
