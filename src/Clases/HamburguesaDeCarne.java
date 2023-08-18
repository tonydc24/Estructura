/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class HamburguesaDeCarne extends Hamburguesa {
    public HamburguesaDeCarne() {
        super("Res");
        agregarIngrediente(new Ingrediente(1, "Pan"));
        agregarIngrediente(new Ingrediente(2, "Carne"));
    }
}
