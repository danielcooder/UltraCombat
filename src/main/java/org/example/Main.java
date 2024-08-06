package org.example;

public class Main {
    public static void main(String[] args) {

        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Juca Caetano", "Brasil", 31, 1.75f, 70.9f, 11, 2, 1);
        l[1] = new Lutador("Cesar Rodriguez", "México", 29, 1.78f, 70.5f, 12, 3, 2);
        l[2] = new Lutador("Hans Miller", "Alemanha", 28, 1.82f, 75.0f, 14, 4, 3);
        l[3] = new Lutador("Ivan Drago", "Rússia", 35, 1.90f, 85.4f, 20, 1, 0);
        l[4] = new Lutador("John Smith", "Estados Unidos", 33, 1.85f, 80.2f, 18, 5, 1);
        l[5] = new Lutador("Takeshi Yamamoto", "Japão", 27, 1.70f, 65.3f, 10, 6, 0);


     Luta UEC01 = new Luta();
     UEC01.marcarLuta(l[0], l[2]);
     UEC01.lutar();

     l[0].status();
     l[1].status();
    }
}
