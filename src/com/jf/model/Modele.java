package com.jf.model;

import java.util.Observable;


public class Modele extends Observable {
    private boolean existe;

    void setExiste(boolean existe) {
	this.existe = existe;
	setChanged();
	notifyObservers();
    } 

    
    boolean getExiste() {
	return existe;
    }   
}