/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartphoneapp;

/**
 *
 * @author Lizy Bustillo
 */

public class Chip {
    private Operador operador;
    public int numero;

    Chip(Operador operador, int numero) {
        this.operador = operador;
        this.numero = numero;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }
}


