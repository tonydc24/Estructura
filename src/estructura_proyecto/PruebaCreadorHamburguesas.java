/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura_proyecto;

import Clases.Hamburguesa;
import Clases.HamburguesaClasica;
import Clases.HamburguesaConQueso;
import Clases.HamburguesaDeCarne;

/**
 *
 * @author Usuario
 */
public class PruebaCreadorHamburguesas {
    public static void main(String[] args) {
        Hamburguesa hamburguesaClasica = new HamburguesaClasica();
        Hamburguesa hamburguesaDeCarne = new HamburguesaDeCarne();
        Hamburguesa hamburguesaConQueso = new HamburguesaConQueso();

        System.out.println(hamburguesaClasica);
        System.out.println(hamburguesaDeCarne);
        System.out.println(hamburguesaConQueso);
    }
}
