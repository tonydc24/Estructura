/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura_proyecto;

import Clases.Orden;

/**
 *
 * @author Usuario
 */
public class ColaOrdenes {
//    private NodoOrdenes frente;
//    private NodoOrdenes fin;
//    private int tamanio;
//
//    public ColaOrdenes() {
//        this.frente = null;
//        this.fin = null;
//        this.tamanio = 0;
//    }
//
//    public void queue(Orden elemento) {
//        NodoOrdenes nuevoNodo = new NodoOrdenes(elemento);
//        if (fin == null) {
//            frente = nuevoNodo;
//            fin = nuevoNodo;
//        } else {
//            fin.atras = nuevoNodo;
//            fin = nuevoNodo;
//        }
//        tamanio++;
//    }
//
//    public Orden dequeue() {
//        if (tamanio > 0) {
//            Orden elementoEliminado = frente.dato;
//            frente = frente.atras;
//            tamanio--;
//            if (frente == null) {
//                fin = null;
//            }
//            elementoEliminado.setEstado(true);
//            return elementoEliminado;
//        }
//        return null;
//    }
//
//    public boolean estaVacia() {
//        return tamanio == 0;
//    }
//    
//    public String imprimir(){
//        String s="";
//        NodoOrdenes aux= frente;
//        while(aux!=null){
//            s+= "------\n";
//            s+=aux.getDato() + "\n";
//            aux=aux.getAtras();
//        }
//        return s;
//    }
}
