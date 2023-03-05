/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_structures;

import modelos.Persona;

/**
 *  esta clase es la que se usa para el modelo de los nodos de la lista doblemente enlasada
 * @author Gabriel
 */
public class N_D_E {
    private N_D_E N_Nodo = null;//este guarda la referencia del nodo que hay adelante en la lista
    private N_D_E P_Nodo = null;//este guarda la referencia del nodo que hay atras en la lista
    private Persona Per;//este guarda el modelo persona 
    /**
     * este inicializa un nodo que aun no pertenese a ninguna lista
     * @param P 
     */
    public N_D_E(Persona P){
        this.Per = P;//guarda el modelo persona en la variable del nodo
    }
    /**
     * este metodo guarda la referencia del nodo siguiente en la lista
     * @param nodo 
     */
    public void setN(N_D_E nodo){
        this.N_Nodo = nodo;
    }
    /**
     * este metodo devuelve el nodo guardado en la referencia de siguiente en la lista
     * @return 
     */
    public N_D_E getN(){
        return this.N_Nodo;
    }
    /**
     * este metodod guarda la referencia del nodo anterior en la lista
     * @param nodo 
     */
    public void setP(N_D_E nodo){
        this.P_Nodo = nodo;
    }
    /**
     * este metodo devuelve la referencia al nodo anterior en la lista
     * @return 
     */
    public N_D_E getP(){
        return this.P_Nodo;
    }
    /**
     * este metodo devuelve el modelo persona del nodo
     * @return 
     */
    public Persona getPer(){
        return this.Per;
    }
}
