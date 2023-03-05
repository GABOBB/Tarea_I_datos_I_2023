/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_structures;

import modelos.Persona;

/**
 *  esta clase es la encargada de administrar las listas doblemente enlazadas
 * @author Gabriel
 */
public class L_D_E {
    private int size = 0;//es utilizada para guardar cuantos elementos hay en la lista
    private N_D_E head = null;//se utiliza para guardar cual es el primer elemento en la lista
    private N_D_E last = null;// se utiliza para guardar cual es el ultimo elemento de la lista
    
    /**
     * este metodo devulve el tama;o de la lista en forma de intiger
     * @return 
     */
    public int getSize(){return this.size;}
    /**
     * este metodo inicializa la lista con un nodo inicial
     * @param P 
     */
    public void L_D_E(Persona P){
        N_D_E nodo = new N_D_E(P);//crea un nodo nuevo
        this.head = nodo;//lo guarda como primer nodo de la lista
        this.last = nodo;//lo guarda como ultimo nodo de la lista
        this.size++;//le aumenta el tama;o en uno
    }
    /**
     * este metodo inicializa la lista basia
     */
    public void L_D_E(){ 
    }
    /**
     * este metodo retorna el primer elemento de la lista
     * @return 
     */
    public N_D_E getHead(){return this.head;}
    /**
     * este metodo a;ade un nodo con un modelo de persona
     * @param P 
     */
    public void add_N(Persona P){
        N_D_E N_N = new N_D_E(P);//crea un nuevo nodo
        if(this.size<1){//verifica que la lista no tenga elementos
            this.head = N_N;//lo guarda como primer nodo de la lista
            this.last = N_N;//lo guarda como ultimo nodo de la lista
        }else{//si la lista tiene al menos un elemento
            this.last.setN(N_N);//hace que el ultimo apunte al nuevo nodo
            N_N.setP(this.last);//hace que el nuvo nodo apunte como anterior al ultimo
            this.last = N_N;//guarda en nuvo nodo como el ultimo
        }
        this.size++;//le aumenta uno al valor de de registro de cantidad de nodos de la lista

    }
    /**
     * este metodo busca un modelo persona por medio del nombre y lo retorna si existe
     * @param id
     * @return 
     */
    public Persona busca_Id(String id){
        if(this.head == null){//verifica que la lista sea nula
            return null;
        }else{//si la lista no es nula
            N_D_E act = this.head;//genera un nodo temporal para recorrer la lista
            while(act != null){//verifica que en cada iteracion el nodo no sea nulo para saber que la lista no ha terminado
                if(act.getPer().getID().equals(id)){return act.getPer();}//si el nombre del modelo es igual al nombre que se buscan retorna el modelo
                act = act.getN();//avansa en una pocicion en la lista
            }
            return null;//en caso que se termine la lista y no haya coincidencia se retorna nulo
        }
    }
}
