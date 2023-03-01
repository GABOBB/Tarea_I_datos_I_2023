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
    
    public int getSize(){return this.size;}

    public void L_D_E(Persona P){
        N_D_E nodo = new N_D_E(P);
        this.head = nodo;
        this.last = nodo;
        this.size++;
    }
   
    public void L_D_E(){ 
    }
     
    
    public void add_N(Persona P){
        N_D_E N_N = new N_D_E(P);
        if(this.size<1){
            this.head = N_N;
            this.last = N_N;
        }else{
            this.last.setN(N_N);
            N_N.setP(this.last);
        }
        this.size++;

    }

}
