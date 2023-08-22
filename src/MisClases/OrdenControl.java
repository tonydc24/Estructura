/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

import Estructura.Cola;
import Estructura.ListaMesa;
import Estructura.NodoHamburguesa;
import java.awt.Graphics;
import java.util.Random;

public class OrdenControl {

    private Cola colaDeOrdenes;
    private ListaMesa listaMesa;
    private int salto;
    private int inicial;

    public OrdenControl() {
        colaDeOrdenes = new Cola();
    }

    public void generarOrdenAleatoria() {
        int tipoDeHamburguesa = getRandomNumber();
        if (tipoDeHamburguesa == 1) {
            Orden orden = new Orden("Hamburguesa de carne", 5, 2, 12);
            colaDeOrdenes.inserta(orden);
        }
        if (tipoDeHamburguesa == 2) {
            Orden orden = new Orden("Hamburguesa con queso", 10, 3, 23);
            colaDeOrdenes.inserta(orden);
        }
        if (tipoDeHamburguesa == 3) {
            Orden orden = new Orden("Hamburguesa clasica", 15, 4, 32);
            colaDeOrdenes.inserta(orden);
        }
    }

    public int ordenTerminada() {
        int puntosObtenidos = 0;
        NodoHamburguesa nodoOrden = colaDeOrdenes.elimina();
        Orden ordenProcesada = nodoOrden.getOrden();
        int especificacion = ordenProcesada.getEspecificar();
        //recorrer la lista de la mesa para obtener la suma de los pesos de cada ingrediente
        int sumaPesosIngredientesEnMesa = 0;
        if (sumaPesosIngredientesEnMesa == especificacion) {
            puntosObtenidos = ordenProcesada.getPuntos();
        }
        return puntosObtenidos;
    }

    public void drawOrden(Graphics g) {
        colaDeOrdenes.drawOrdenes(g, salto, inicial);
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }
}
