package com.mp09uf2;

public class Taller {

    public static void main(String[] args) {
        Cesta cestaMangas = new Cesta(8);
        Cesta cestaCuerpos = new Cesta(5);

        Costurero costureroMangas = new Costurero(cestaMangas, "Manga");
        Costurero costureroCuerpos = new Costurero(cestaCuerpos, "Cuerpo");

        Ensamblador ensamblador = new Ensamblador(cestaMangas, cestaCuerpos, "Pieza");

        costureroMangas.start();
        costureroCuerpos.start();
        ensamblador.start();

    }
}
