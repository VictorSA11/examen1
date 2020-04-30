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
public enum Hospital {
   
   
	GUANACASTE("Nicoya"),GAM("Mexico");
    
     private String lugar;
     
     private Hospital (String lugar){
         this.lugar = lugar;
         
         
}


    public String getLugar() {
        return lugar;
    }
}