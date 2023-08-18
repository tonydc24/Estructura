/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura_proyecto;

import Clases.Ingrediente;

/**
 *
 * @author Tony
 */
public class Lista {
    private Nodo cabeza;

    public void inserta(Ingrediente ficha) {
        if (cabeza == null) {
            cabeza = new Nodo(ficha);
        } else if (ficha.getId() < cabeza.getDato().getId()) {
            Nodo aux = new Nodo(ficha);
            aux.setNext(cabeza);
            cabeza = aux;
        } else if (cabeza.getNext() == null) {
            cabeza.setNext(new Nodo(ficha));
        } else {
            Nodo aux = cabeza;
            while (aux.getNext() != null
                    && aux.getNext().getDato().getId()
                    < ficha.getId()) {
                aux = aux.getNext();
            }
            Nodo temp = new Nodo(ficha);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
    }

//    public Ingrediente adivinarElementoFaltante() {
//        Nodo aux = cabeza;
//        int valor = cabeza.getDato().getId();
//        while (aux.getNext() != cabeza && aux.getNext() != null) {
//            if (aux.getNext().getDato().getId() != valor + 1) {
//                int nuevoValor = valor + 1;
//                String valorStr = nuevoValor + "";
//                return new Ingrediente(nuevoValor, valorStr);
//            }
//            valor = aux.getNext().getDato().getId();
//            aux = aux.getNext();
//        }
//        int nuevoValor = valor + 1;
//        String valorStr = nuevoValor + "";
//        return new Ingrediente(nuevoValor, valorStr);
//    }

    public boolean existe(int id) {
        boolean esta = false;
        //Busca en lista, y retorna true si una persona tiene el id
        //en la lista
        if (cabeza != null) {
            //Si hay algo en la lista buscaré
            Nodo aux = cabeza;
            //utilizo aux como indice

            //Mientras no se acabe la lista y el elemento
            //de la lista sea menor que el buscado
            while (aux != null && aux.getDato().getId() < id) {
                aux = aux.getNext();//avanzo en la lista
            }

            //verdadero si lo encontró
            esta = (aux != null && aux.getDato().getId() == id);
        }

        return esta;
    }

    public void modifica(Ingrediente ficha) {
        //busca a si existe alguien con el id, y le actualiza el nombre
        if (cabeza != null) {
            //Si hay algo en la lista buscaré
            Nodo aux = cabeza; //utilizo aux como indice
            //Mientras no se acabe la lista y el elemento
            //de la lista sea menor que el buscado
            while (aux != null && aux.getDato().getId() < ficha.getId()) {
                aux = aux.getNext(); //avanzo en la lista
            }
            // Si lo encuentra hago el cambio
            if (aux != null && aux.getDato().getId() == ficha.getId()) {
                //Solo básta cambiar nombre
                aux.getDato().setNombre(ficha.getNombre());
            }
        }
    }

    public void elimina(Ingrediente ingrediente) {
        //Si una persona tiene el id, lo elimina
        if (cabeza != null) { //Si hay algo en la lista buscaré
            if (cabeza.getDato().getId() == ingrediente.getId()) {
                cabeza = cabeza.getNext();
            } else {
                Nodo aux = cabeza; //utilizo aux como indice
                //Mientras no se acabe la lista y el elemento
                //de la lista sea menor que el buscado
                while (aux.getNext() != null
                        && aux.getNext().getDato().getId() < ingrediente.getId()) {
                    aux = aux.getNext();
                }
                //avanzo en la lista

                // si es el de adelante lo borro
                if (aux.getNext() != null
                        && aux.getNext().getDato().getId() == ingrediente.getId()) {
                    aux.setNext(aux.getNext().getNext()); //cambio las referencias
                }
            }
        }
    }

    public Ingrediente extrae(int id) {
        Ingrediente ficha = null;
        //si una persona tiene el id, lo extrae (eliminando y retornando)
        if (cabeza != null) { //Si hay algo en la lista buscaré
            if (cabeza.getDato().getId() == id) {
                cabeza = cabeza.getNext();
            } else {
                Nodo aux = cabeza; //utilizo aux como indice
                //Mientras no se acabe la lista y el elemento
                //de la lista sea menor que el buscado
                while (aux.getNext() != null && aux.getNext().getDato().getId()
                        < id) {
                    aux = aux.getNext();
                    //avanzo en la lista
                }
                // Si es el de adelante... quardo la persona y lo borro
                if (aux.getNext() != null && aux.getNext().getDato()
                        .getId() == id) {
                    ficha = aux.getNext().getDato();
                    aux.setNext(aux.getNext().getNext());//cambio las referencias
                }
            }
        }
        return ficha;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Nodo aux = cabeza;
        while (aux != null) {
            sb.append(aux.getDato());
            sb.append(',');
            aux = aux.getNext();
        }
        return sb.toString();
    }
}
