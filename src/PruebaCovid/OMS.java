/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaCovid;

import java.util.List;

/**
 *
 * @author Victor Segura
 */
public abstract class OMS {
    private List<PruebaCovid19> resultadolist;
    public OMS (List<PruebaCovid19> resultadolist){
    this.setResultadolist(resultadolist);
    
    
    }

    public OMS() {
    }
    
    protected abstract boolean isGamHospital();
    
    public abstract Hospital getLugar();
    private final void Imprimir(){}

    public List<PruebaCovid19> getResultadolist() {
        return resultadolist;
    }

    public void setResultadolist(List<PruebaCovid19> resultadolist) {
        this.resultadolist = resultadolist;
    }
    private void diagnosticar(){
    
    }

   
}

