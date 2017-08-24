/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dudsbanco;

/**
 *
 * @author aluno
 */
public class ContaMaster {

    /**
     * @return the saldoinv
     */
    public float getSaldoinv() {
        return saldoinv;
    }

    /**
     * @param saldoinv the saldoinv to set
     */
    public void setSaldoinv(float saldoinv) {
        this.saldoinv = saldoinv;
    }

    /**
     * @return the limiteex
     */
    public float getLimiteex() {
        return limiteex;
    }

    /**
     * @param limiteex the limiteex to set
     */
    public void setLimiteex(float limiteex) {
        this.limiteex = limiteex;
    }
  
    
    private float saldoinv;
    private float limiteex;
    
}
