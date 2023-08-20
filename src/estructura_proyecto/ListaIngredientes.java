/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura_proyecto;

import Clases.Ingrediente;

public class ListaIngredientes {
//    private NodoIngrediente cabeza;
//    private int largo;
//    
//    public ListaIngredientes(){
//        this.cabeza = null;
//        this.largo = 0;
//    }
//
//    public void inserta(Ingrediente ingrediente) {
//        if (cabeza == null) {
//            cabeza = new NodoIngrediente(ingrediente);
//        } else if (ingrediente.getId() < cabeza.getDato().getId()) {
//            NodoIngrediente aux = new NodoIngrediente(ingrediente);
//            aux.setNext(cabeza);
//            cabeza = aux;
//        } else if (cabeza.getNext() == null) {
//            cabeza.setNext(new NodoIngrediente(ingrediente));
//        } else {
//            NodoIngrediente aux = cabeza;
//            while (aux.getNext() != null
//                    && aux.getNext().getDato().getId()
//                    < ingrediente.getId()) {
//                aux = aux.getNext();
//            }
//            NodoIngrediente temp = new NodoIngrediente(ingrediente);
//            temp.setNext(aux.getNext());
//            aux.setNext(temp);
//        }
//        largo++;
//    }
//
//    public boolean existe(int id) {
//        boolean esta = false;
//        //Busca en lista, y retorna true si una persona tiene el id
//        //en la lista
//        if (cabeza != null) {
//            //Si hay algo en la lista buscaré
//            NodoIngrediente aux = cabeza;
//            //utilizo aux como indice
//
//            //Mientras no se acabe la lista y el elemento
//            //de la lista sea menor que el buscado
//            while (aux != null && aux.getDato().getId() < id) {
//                aux = aux.getNext();//avanzo en la lista
//            }
//
//            //verdadero si lo encontró
//            esta = (aux != null && aux.getDato().getId() == id);
//        }
//
//        return esta;
//    }
//    
//    public boolean existe(String nombre) {
//        boolean esta = false;
//        if (cabeza != null) {
//            NodoIngrediente aux = cabeza;
//            while (aux != null && !aux.getDato().getNombre().equals(nombre)) {
//                aux = aux.getNext();
//            }
//            
//            esta = (aux != null && aux.getDato().getNombre().equals(nombre));
//        }
//
//        return esta;
//    }
//
//    public void modifica(Ingrediente ficha) {
//        //busca a si existe alguien con el id, y le actualiza el nombre
//        if (cabeza != null) {
//            //Si hay algo en la lista buscaré
//            NodoIngrediente aux = cabeza; //utilizo aux como indice
//            //Mientras no se acabe la lista y el elemento
//            //de la lista sea menor que el buscado
//            while (aux != null && aux.getDato().getId() < ficha.getId()) {
//                aux = aux.getNext(); //avanzo en la lista
//            }
//            // Si lo encuentra hago el cambio
//            if (aux != null && aux.getDato().getId() == ficha.getId()) {
//                //Solo básta cambiar nombre
//                aux.getDato().setNombre(ficha.getNombre());
//            }
//        }
//    }
//
//    public void elimina(Ingrediente ingrediente) {
//        //Si una persona tiene el id, lo elimina
//        if (cabeza != null) { //Si hay algo en la lista buscaré
//            if (cabeza.getDato().getId() == ingrediente.getId()) {
//                cabeza = cabeza.getNext();
//            } else {
//                NodoIngrediente aux = cabeza; //utilizo aux como indice
//                //Mientras no se acabe la lista y el elemento
//                //de la lista sea menor que el buscado
//                while (aux.getNext() != null
//                        && aux.getNext().getDato().getId() < ingrediente.getId()) {
//                    aux = aux.getNext();
//                }
//                //avanzo en la lista
//
//                // si es el de adelante lo borro
//                if (aux.getNext() != null
//                        && aux.getNext().getDato().getId() == ingrediente.getId()) {
//                    aux.setNext(aux.getNext().getNext()); //cambio las referencias
//                }
//            }
//            largo--;
//        }
//    }
//
//    public Ingrediente extrae(int id) {
//        Ingrediente ficha = null;
//        //si una persona tiene el id, lo extrae (eliminando y retornando)
//        if (cabeza != null) { //Si hay algo en la lista buscaré
//            if (cabeza.getDato().getId() == id) {
//                ficha = cabeza.getDato();
//                cabeza = cabeza.getNext();
//            } else {
//                NodoIngrediente aux = cabeza; //utilizo aux como indice
//                //Mientras no se acabe la lista y el elemento
//                //de la lista sea menor que el buscado
//                while (aux.getNext() != null && aux.getNext().getDato().getId()
//                        < id) {
//                    aux = aux.getNext();
//                    //avanzo en la lista
//                }
//                // Si es el de adelante... quardo la persona y lo borro
//                if (aux.getNext() != null && aux.getNext().getDato()
//                        .getId() == id) {
//                    ficha = aux.getNext().getDato();
//                    aux.setNext(aux.getNext().getNext());//cambio las referencias
//                }
//            }wd
//            largo--;
//        }
//        return ficha;
//    }
//    
//    public Ingrediente get(int id) {
//        Ingrediente ingrediente = null;
//        NodoIngrediente nodoActual = cabeza;
//        while (nodoActual != null) {
//            if (nodoActual.getDato().getId() == id) {
//                ingrediente = nodoActual.getDato();
//                return ingrediente;
//            }
//            nodoActual = nodoActual.getNext();
//        }
//        return ingrediente;
//    }
//    
//    public int largo(){
//        return this.largo;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        NodoIngrediente aux = cabeza;
//        while (aux != null) {
//            sb.append(aux.getDato());
//            aux = aux.getNext();
//            if(aux != null) sb.append(',');
//        }
//        return sb.toString();
//    }
}
