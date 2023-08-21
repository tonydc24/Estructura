/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
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
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(path).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            return clip;
        } catch (Exception e) {
            System.out.println("Error --> " + e.getMessage());
        }
        return null;
    }

}
