/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Loader {
//Png
    public static BufferedImage imageLoader(String path) {
        try {
              File archivo = new File(path);
              return ImageIO.read(archivo);
        } catch (IOException e) {
            e.printStackTrace();

        }
        return null;
    }
//Sonido no funciona de momento
    public static Clip loadSound(String path) {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Loader.class.getResource(path)));
            return clip;
        } catch (Exception e) {
        }
        return null;
    }

}
