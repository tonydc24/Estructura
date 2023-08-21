/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura;

import MisClases.Comida;

public class NodoIngrediente {

    private Comida ingrediente;
    private NodoIngrediente siguiente;

    public NodoIngrediente(Comida ingrediente) {
        this.ingrediente = ingrediente;
        this.siguiente = null;
    }

    public Comida getIngrediente() {
        return ingrediente;
    }

    public NodoIngrediente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoIngrediente siguiente) {
        this.siguiente = siguiente;
    }

}
