/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import graphics.Loader;
import java.awt.image.BufferedImage;

public class Comida {

    private int pan;
    private int Carne;
    private int Queso;
    private int lechuga;
    public static BufferedImage lechugaI;

    public Comida(int pan, int Carne, int Queso, int lechuga) {
        this.pan = pan;
        this.Carne = Carne;
        this.Queso = Queso;
        this.lechuga = lechuga;
    }

    public static void init() {

        lechugaI = Loader.imageLoader("Assets/lechuga.png");

    }

    public int getPan() {
        return pan;
    }

    public void setPan(int pan) {
        this.pan = pan;
    }

    public int getCarne() {
        return Carne;
    }

    public void setCarne(int Carne) {
        this.Carne = Carne;
    }

    public int getQueso() {
        return Queso;
    }

    public void setQueso(int Queso) {
        this.Queso = Queso;
    }

    public int getLechuga() {
        return lechuga;
    }

    public void setLechuga(int lechuga) {
        this.lechuga = lechuga;
    }

}
