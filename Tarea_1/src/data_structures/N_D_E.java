/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_structures;

import modelos.Persona;

/**
 *
 * @author Gabriel
 */
public class N_D_E {
    private N_D_E N_Nodo = null;
    private N_D_E P_Nodo = null;
    private Persona Per;
    
    public N_D_E(Persona P){
        this.Per = P;
    }
    
    public void setN(N_D_E nodo){
        this.N_Nodo = nodo;
    }
    
    public N_D_E getN(){
        return this.N_Nodo;
    }
    
    public void setP(N_D_E nodo){
        this.P_Nodo = nodo;
    }
    
    public N_D_E getP(){
        return this.P_Nodo;
    }
    
    public Persona getPer(){
        return this.Per;
    }
}
