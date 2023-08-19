/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import estructura_proyecto.ListaIngredientes;

/**
 *
 * @author Usuario
 */
public class Hamburguesa {
    private String descripcion;
    private ListaIngredientes ingredientes;

    public Hamburguesa(String descripcion) {
        this.descripcion = descripcion;
        this.ingredientes = new ListaIngredientes();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.inserta(ingrediente);
    }

    public void quitarIngrediente(Ingrediente ingrediente) {
        ingredientes.elimina(ingrediente);
    }

    public ListaIngredientes getIngredientes() {
        return ingredientes;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(descripcion).append(" con ingredientes: ");
        sb.append(ingredientes.toString());
        return sb.toString();
    }
}
