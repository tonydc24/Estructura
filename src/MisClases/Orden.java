/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author Anthony
 */
public class Orden {
    private String tipoHamburguesa;
    private int puntos;

    public Orden(String tipoHamburguesa, int puntos) {
        this.tipoHamburguesa = tipoHamburguesa;
        this.puntos = puntos;
    }

    public String getTipoHamburguesa() {
        return tipoHamburguesa;
    }

    public int getPuntos() {
        return puntos;
    }
}
