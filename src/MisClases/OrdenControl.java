/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

import Estructura.Cola;
import Estructura.ListaMesa;
import Estructura.NodoHamburguesa;
import graphics.AssetsG;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class OrdenControl {

    private Cola colaDeOrdenes;
   
   
    private int salto;
    private int inicial;

    private Graphics g;
    public OrdenControl() {
        colaDeOrdenes = new Cola();
    }

    public void generarOrdenAleatoria() {
        int tipoDeHamburguesa = getRandomNumber();
        if (tipoDeHamburguesa == 1) {
            Orden orden = new Orden("Hamburguesa de carne",
                    5,
                    2,
                    12,
                    AssetsG.Hcarne);
            colaDeOrdenes.inserta(orden);
        }
        if (tipoDeHamburguesa == 2) {
            Orden orden = new Orden("Hamburguesa con queso",
                    10,
                    3,
                    23,
                    AssetsG.Hqueso);
            colaDeOrdenes.inserta(orden);
        }
        if (tipoDeHamburguesa == 3) {
            Orden orden = new Orden("Hamburguesa clasica",
                    15,
                    4,
                    32,
                    AssetsG.Hclasica);
            colaDeOrdenes.inserta(orden);
        }

    }

    public int ordenTerminada(int combinacion, int especificar, int puntos) {
        NodoHamburguesa aux = colaDeOrdenes.getFrente();
        if (aux != null && aux.getOrden().getCombinacion() == combinacion && aux.getOrden().getEspecificar() == especificar) {
            puntos += aux.getOrden().getPuntos();
            g.drawImage(aux.getOrden().getTextura(), 129, 430, null);
            colaDeOrdenes.elimina();
            return puntos;
        } else {

            return puntos = 0;

        }

    }
    

    public void drawOrden(Graphics g) {
        colaDeOrdenes.drawOrdenes(g, salto, inicial);
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }
}
