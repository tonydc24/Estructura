/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import estructuras.Cola;
import estructuras.NodoHamburguesa;
import graphics.AssetsG;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

public class OrdenControl {

    private Cola colaDeOrdenes;
    private int salto;
    private int inicial;
    private Graphics g;
    private  BufferedImage hambur;
    public OrdenControl() {
        colaDeOrdenes = new Cola();
    }

    public void generarOrdenAleatoria() {
        int tipoDeHamburguesa = getRandomNumber();
        Orden orden;
        switch (tipoDeHamburguesa) {
            case 1:
                orden = new Orden("Hamburguesa de carne",
                        5,
                        2,
                        12,
                        AssetsG.Hcarne);
                colaDeOrdenes.inserta(orden);
                break;
            case 2:
                orden = new Orden("Hamburguesa con queso",
                        10,
                        3,
                        23,
                        AssetsG.Hqueso);
                colaDeOrdenes.inserta(orden);
                break;
            case 3:
                orden = new Orden("Hamburguesa clasica",
                        15,
                        4,
                        32,
                        AssetsG.Hclasica);
                colaDeOrdenes.inserta(orden);
                break;
            default:
                System.out.println(String.format("No existe una "
                        + "implementacion para este tipo de hamburguesa %s",
                        tipoDeHamburguesa));
                break;
        }
    }

    public void justPrint() {
        NodoHamburguesa aux = colaDeOrdenes.getFrente();
        System.out.println(aux.getOrden().getCombinacion());
    }

    public int ordenTerminada(int combinacion, int especificar, int puntos) {

        NodoHamburguesa aux = colaDeOrdenes.getFrente();
        
        if (aux != null && combinacion == aux.getOrden().getCombinacion() && aux.getOrden().getEspecificar() == especificar) {
            puntos = aux.getOrden().getPuntos();
            System.out.println("Esto suma :" + puntos);
            hambur = aux.getOrden().getTextura();
            
            colaDeOrdenes.elimina();
            return puntos;
        } else {

            return puntos = 0;
        }
    }

    public void eliminar() {
        colaDeOrdenes.elimina();
    }

    public void drawOrden(Graphics g) {
        colaDeOrdenes.drawOrdenes(g, salto, inicial);
    }

    public void drawTerminada(Graphics g) {
        NodoHamburguesa aux = colaDeOrdenes.getFrente();
        g.drawImage(hambur, 129, 430, null);
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }
}
