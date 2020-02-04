package com.mp09uf2;

public class Ensamblador extends  Thread {

    Cesta cestaM;
    Cesta cestaC;

    public Ensamblador(Cesta cm, Cesta cc, String cosido){
        super(cosido);
        cestaM = cm;
        cestaC = cc;
    }

    @Override
    public void run(){

        for(;;){
            try {
                if (cestaM.items >= 2){
                    cestaM.Coger();
                    cestaM.setItems(cestaM.items-=2);
                    System.out.println("COJO MANGAS");
                }else{
                    System.out.println("No quedan MANGAS");
                }

                if (cestaC.items >= 1) {
                    cestaC.Coger();
                    cestaC.setItems(cestaC.items-=1);
                    System.out.println("COJO CUERPO");
                }else{
                    System.out.println("No quedan Cuerpos");
                }

                Thread.sleep((long) (Math.random()*1500)+3000);

                System.out.println("-----------------------");
                System.out.println("PIEZA HECHA");
                System.out.println("-----------------------");

            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
