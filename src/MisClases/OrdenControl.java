/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

import Estructura.Cola;
import java.awt.Graphics;
import java.util.Random;

public class OrdenControl {

    private Cola colaDeOrdenes;
    private int salto ; 
    private int inicial;
    public OrdenControl() {
        colaDeOrdenes = new Cola();
    }

    public void generarOrdenAleatoria() {
        int tipoDeHamburguesa = getRandomNumber();
        if (tipoDeHamburguesa == 1) {
            Orden orden = new Orden("Hamburguesa de carne", 5);
            colaDeOrdenes.inserta(orden);
        }
        if (tipoDeHamburguesa == 2) {
            Orden orden = new Orden("Hamburguesa con queso", 10);
            colaDeOrdenes.inserta(orden);
        }
        if (tipoDeHamburguesa == 3) {
            Orden orden = new Orden("Hamburguesa clasica", 15);
            colaDeOrdenes.inserta(orden);
        }

    }
    public void ordenLista(){
    
    
    
    }
    public void drawOrden(Graphics g){
    colaDeOrdenes.drawOrdenes(g, salto, inicial);    
    } 
   
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }
}
