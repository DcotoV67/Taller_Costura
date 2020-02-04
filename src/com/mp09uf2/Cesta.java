package com.mp09uf2;

public class Cesta {

    int capacidadMax;
    int items;

    private boolean llena;
    private boolean vacia;

    public Cesta(int cm){
        capacidadMax = cm;
        llena = false;
    }

    public synchronized void setItems(int items) {
        this.items = items;
    }

    public synchronized void Llenar() throws InterruptedException {

        while(items >= capacidadMax) wait();
            items++;
            notifyAll();
    }

    public synchronized void Coger() throws InterruptedException {

        while (items <= 0) wait();
            notifyAll();
    }
}
