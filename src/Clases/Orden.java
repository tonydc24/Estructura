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
public class Orden {
    private String tipoHamburguesa;
    private ListaIngredientes ingredientes;
    private boolean estado;//En proceso, Terminada
    private Hamburguesa hamburguesa;
    
    public Orden(String tipoHamburguesa){
        this.tipoHamburguesa = tipoHamburguesa;
        this.ingredientes = new ListaIngredientes();
    }
    
    public void agregarIngrediente(Ingrediente ingrediente){
        this.ingredientes.inserta(ingrediente);
    }
    
    public Hamburguesa obtenerTipoHamburguesa(){
        switch(this.tipoHamburguesa.toLowerCase()){
            case "clasica" -> {
                hamburguesa = new HamburguesaClasica();
                return hamburguesa;
            }
            case "queso" -> {
                hamburguesa = new HamburguesaConQueso();
                return hamburguesa;
            }
            case "carne" -> {
                hamburguesa = new HamburguesaDeCarne();
                return hamburguesa;
            }
            default ->{
                return null;
            }
        }
    }
    
    public boolean validarIngredientes(){
        boolean resultado = false;
        ListaIngredientes listaTemporal = hamburguesa.getIngredientes();
        for(int i= 1; i <= ingredientes.largo(); i++){
            Ingrediente ingrediente = ingredientes.get(i);
            if(ingrediente != null && listaTemporal.existe(ingrediente.getNombre())){
                resultado = true;
            }
            else{
                resultado = false;
            }
        }
        return resultado;
    }
    
    public String getTipoHamburguesa(){
        return this.tipoHamburguesa;
    }
    
    public boolean getEstado(){
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    private String estadoOrdenAsStr(){
        String resultado;
        if(this.estado)
            resultado = "Terminada";
        else
            resultado = "En proceso";
        
        return resultado;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo hamburguesa: ");
        sb.append(hamburguesa.getDescripcion());
        sb.append('\n');
        sb.append("Ingredientes: ");
        sb.append(ingredientes);
        sb.append('\n');
        sb.append("Estado: ");
        sb.append(estadoOrdenAsStr());
        return sb.toString();
    }
}
