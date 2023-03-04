/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Gabriel
 */
public class Persona {
    private int edad;
    private String id;
    private String provincia;
    
    public Persona(int e, String i, String p){
        this.edad = e;
        this.id = i;
        this.provincia = p;
    }
    
    public int getEdad(){return this.edad;}
    
    public String getID(){return this.id;}
    
    public String getPr(){return this.provincia;}
}
