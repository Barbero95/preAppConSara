package com.example.david.minim2.Classes;


public class Simbolo extends Expressio {
    private String simbolo = null;

    public Simbolo() {
    }
    public Simbolo(String simbolo) {
        this.simbolo=simbolo;
    }

    public boolean isSymbol() {
        return true;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
}
