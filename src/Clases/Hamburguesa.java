/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import estructura_proyecto.Lista;

/**
 *
 * @author Usuario
 */
public class Hamburguesa {
    private String tipoCarne;
    private Lista ingredientes;

    public Hamburguesa(String tipoCarne) {
        this.tipoCarne = tipoCarne;
        this.ingredientes = new Lista();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.inserta(ingrediente);
    }

    public void quitarIngrediente(Ingrediente ingrediente) {
        ingredientes.elimina(ingrediente);
    }

    public Lista getIngredientes() {
        return ingredientes;
    }
    
    public String getTipoCarne() {
        return tipoCarne;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hamburguesa de ").append(tipoCarne).append(" con ingredientes: ");
        sb.append(ingredientes.toString());
        return sb.toString();
    }
}
