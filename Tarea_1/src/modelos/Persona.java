/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *  esta clase guada el modelo persona 
 * @author Gabriel
 */
public class Persona {
    private int edad;//guarda un intiger con el valor de la edad del modelo 
    private String id;//guarda un String con el valor del nombre del modelo
    private String provincia;// guarda un string con el valor de la probincial del modelo
    /**
     * este metodo inicializa un modelo persona
     * @param e
     * @param i
     * @param p 
     */
    public Persona(int e, String i, String p){
        this.edad = e;//guarda la edad del modelo
        this.id = i;//guarda el nombre del modelo
        this.provincia = p;//guarda la provincia del modelo
    }
    /**
     * devuleve la edad del modelo en un intiger
     * @return 
     */
    public int getEdad(){return this.edad;}
    /**
     * este devuelve el nombre en del modelo en un String
     * @return 
     */
    public String getID(){return this.id;}
    /**
     * este devuelve la provincia del modelo en un string
     * @return 
     */
    public String getPr(){return this.provincia;}
}
