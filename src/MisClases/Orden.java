/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

import java.awt.image.BufferedImage;

/**
 *
 * @author Anthony
 */
public class Orden {
    private String tipoHamburguesa;
    private int puntos;
    private int combinacion;
    private int especificar;
    private BufferedImage textura;

    public Orden(String tipoHamburguesa, int puntos, int combinacion, int especificar, BufferedImage textura) {
        this.tipoHamburguesa = tipoHamburguesa;
        this.puntos = puntos;
        this.combinacion = combinacion;
        this.especificar = especificar;
        this.textura = textura;
    }

    public String getTipoHamburguesa() {
        return tipoHamburguesa;
    }

    public void setTipoHamburguesa(String tipoHamburguesa) {
        this.tipoHamburguesa = tipoHamburguesa;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getCombinacion() {
        return combinacion;
    }

    public void setCombinacion(int combinacion) {
        this.combinacion = combinacion;
    }

    public int getEspecificar() {
        return especificar;
    }

    public void setEspecificar(int especificar) {
        this.especificar = especificar;
    }

    public BufferedImage getTextura() {
        return textura;
    }

    public void setTextura(BufferedImage textura) {
        this.textura = textura;
    }

   
  
}
