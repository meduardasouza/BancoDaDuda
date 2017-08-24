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
public class Conta {

    /**
     * @return the depositar
     */
    public float getDepositar() {
        return depositar;
    }

    /**
     * @param depositar the depositar to set
     */
    public void setDepositar(float depositar) {
        this.depositar = depositar;
    }

    /**
     * @return the sacar
     */
    public float getSacar() {
        return sacar;
    }

    /**
     * @param sacar the sacar to set
     */
    public void setSacar(float sacar) {
        this.sacar = sacar;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @return the limite
     */
    public float getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(float limite) {
        this.limite = limite;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    private int numero;
    private int agencia;
    private float saldo;
    private float depositar;
    private float sacar;
    private float limite;
   
}
