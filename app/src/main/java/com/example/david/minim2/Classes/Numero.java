package com.example.david.minim2.Classes;


public class Numero extends Expressio {
    private int numero = 0;

    public Numero() {
    }
    public Numero(int numero){
        this.numero=numero;
    }
    public boolean isSymbol(){
        return false;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
