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
public class L_D_E {
    private int size = 0;
    private N_D_E head = null;
    private N_D_E last = null;
    
    public void L_D_E(N_D_E nodo){
        this.head = nodo;
        this.size++;
    }
   
    public void L_D_E(){ 
    }
    
    public int getSize(){return this.size;}
    
    public void add_N(Persona P){
        N_D_E N_N = new N_D_E(P);
        
        
    }
}
