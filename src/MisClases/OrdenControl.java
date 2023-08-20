/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;
import Estructura.Cola;
import java.util.Random;

public class OrdenControl {
    private Cola colaDeOrdenes;

    public OrdenControl() {
        colaDeOrdenes = new Cola();
    }

    public void generarOrdenAleatoria() {
        int tipoDeHamburguesa = getRandomNumber();
        if (tipoDeHamburguesa==1) {
            
        }
        if (tipoDeHamburguesa==2) {
            
        }
        if (tipoDeHamburguesa==3) {
            
        }
        
        colaDeOrdenes.inserta(orden);
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }
}