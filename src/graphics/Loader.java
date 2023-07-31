/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Loader {

    public static BufferedImage imageLoader(String path) {
        try {
              File archivo = new File(path);
              return ImageIO.read(archivo);
        } catch (IOException e) {
            e.printStackTrace();

        }
        return null;
    }

}
