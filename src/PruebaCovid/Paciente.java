/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaCovid;

/**
 *
 * @author Victor Segura
 */
public class Paciente {
    private final String Nombre;
    private final int Edad;
    private final int Temperatura;
    private final boolean Vomito;

    public Paciente() {
        this.Nombre = "";
        this.Edad = 0;
        this.Temperatura = 0;
        this.Vomito = false;
    }
    
    

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public int getTemperatura() {
        return Temperatura;
    }

    public boolean isVomito() {
        return Vomito;
    }
    
    
}
