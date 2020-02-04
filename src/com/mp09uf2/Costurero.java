package com.mp09uf2;

public class Costurero extends  Thread {

    String pieza;
    Cesta cesta;

    public Costurero(Cesta c, String cosido){
        pieza = cosido;
        cesta = c;
    }

    @Override
    public void run(){

        for(;;){
            try {
                if (cesta.items < cesta.capacidadMax){
                    cesta.Llenar();
                    System.out.println("He hecho 1 " + pieza);

                    System.out.println("\n Piezas en la cesta: "+ cesta.items + "\n Capacidad de la cesta: " + cesta.capacidadMax + "\n");

                }
            if (cesta.capacidadMax == 5) {
                Thread.sleep((long) (Math.random() * 1500) + 1500);
            }else if (cesta.capacidadMax == 8){
                Thread.sleep((long) (Math.random() * 1500) + 800);

            }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
