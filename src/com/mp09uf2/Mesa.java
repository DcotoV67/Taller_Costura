package com.mp09uf2;

public class Mesa {

    public static void main(String[] args) {

        Cubiertos cubiertos1 = new Cubiertos();
        Cubiertos cubiertos2 = new Cubiertos();
        Cubiertos cubiertos3 = new Cubiertos();
        Cubiertos cubiertos4 = new Cubiertos();


        Filosofo filosofo1 = new Filosofo(cubiertos4, cubiertos1, "Filosofo-1");
        Filosofo filosofo2 = new Filosofo(cubiertos1, cubiertos2, "Filosofo-2");
        Filosofo filosofo3 = new Filosofo(cubiertos2, cubiertos3, "Filosofo-3");
        Filosofo filosofo4 = new Filosofo(cubiertos3, cubiertos4, "Filosofo-4");


        filosofo1.start();
        filosofo2.start();
        filosofo3.start();
        filosofo4.start();

    }
}
