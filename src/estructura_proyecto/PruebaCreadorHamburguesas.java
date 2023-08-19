/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura_proyecto;

import Clases.Hamburguesa;
import Clases.HamburguesaClasica;
import Clases.HamburguesaConQueso;
import Clases.HamburguesaDeCarne;
import Clases.Ingrediente;
import Clases.Orden;

/**
 *
 * @author Usuario
 */
public class PruebaCreadorHamburguesas {

    public static void main(String[] args) {
        Ingrediente ingrediente1 = new Ingrediente(1, "Pan");
        Ingrediente ingrediente2 = new Ingrediente(2, "Carne");
        Ingrediente ingrediente3 = new Ingrediente(3, "Queso");
        Ingrediente ingrediente4 = new Ingrediente(4, "Lechuga");
        Ingrediente ingrediente5 = new Ingrediente(5, "Tomate");
        Ingrediente ingrediente6 = new Ingrediente(6, "Pepinillos");
        Ingrediente ingrediente7 = new Ingrediente(7, "Cebolla");
        Ingrediente ingrediente8 = new Ingrediente(8, "Bacon");

        //Orden clasica lleva Pan, Carne, Lechuga y queso
        Orden orden1 = new Orden("Clasica");
        orden1.agregarIngrediente(ingrediente1);
        orden1.agregarIngrediente(ingrediente2);
        orden1.agregarIngrediente(ingrediente3);
        orden1.agregarIngrediente(ingrediente4);
        Hamburguesa hamburguesa = orden1.obtenerTipoHamburguesa();
        System.out.println(hamburguesa);

        //Orden carne lleva Pan, Carne
        Orden orden2 = new Orden("Carne");
        orden2.agregarIngrediente(ingrediente1);
        orden2.agregarIngrediente(ingrediente2);
        hamburguesa = orden2.obtenerTipoHamburguesa();
        System.out.println(hamburguesa);

        //Orden queso lleva Pan, Carne y queso
        Orden orden3 = new Orden("Queso");
        orden3.agregarIngrediente(ingrediente1);
        orden3.agregarIngrediente(ingrediente2);
        orden3.agregarIngrediente(ingrediente3);
        hamburguesa = orden3.obtenerTipoHamburguesa();
        System.out.println(hamburguesa);

        System.out.println(orden1);
        System.out.println(orden2);
        System.out.println(orden3);

        System.out.println("Orden 1, mismos ingredientes: " + orden1.validarIngredientes());
        System.out.println("Orden 2, mismos ingredientes: " + orden2.validarIngredientes());
        System.out.println("Orden 3, mismos ingredientes: " + orden3.validarIngredientes());

        ColaOrdenes cola = new ColaOrdenes();
        cola.queue(orden1);
        cola.queue(orden2);
        cola.queue(orden3);

        System.out.println("Elementos en la cola:\n" + cola.imprimir());
        Orden ordenProcesada = cola.dequeue();
        System.out.println("Datos orden procesada:\n" + ordenProcesada);
        System.out.println("Elementos en la cola actualizada:\n" + cola.imprimir());
    }
}
