/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class HamburguesaClasica extends Hamburguesa {
    public HamburguesaClasica() {
        super("Hamburguesa clasica");
        agregarIngrediente(new Ingrediente(1, "Pan"));
        agregarIngrediente(new Ingrediente(2, "Carne"));
        agregarIngrediente(new Ingrediente(3, "Queso"));
        agregarIngrediente(new Ingrediente(4, "Lechuga"));
    }
}
