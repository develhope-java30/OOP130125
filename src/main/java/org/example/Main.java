package org.example;

public class Main {
    public static void main(String[] args) {
        Studente[] studenti = new Studente[4];
        studenti[0] = new Studente("Gino", 1234, 4.2);
        studenti[1] = new Studente("Mario", 1256, 3.6);
        studenti[2] = new Studente("Vincent", 1214, 2.5);
        studenti[3] = new Studente("Lorenzo", 1284, 4.9);

        for ( Studente studente : studenti){
            System.out.println(studente);
        }

        System.out.println(mediaMaggiore(studenti));

    }
    public static Studente mediaMaggiore(Studente[] array){
        Studente risultato = null;
        for (Studente studente : array){
            if (risultato == null || studente.getAverage() > risultato.getAverage()){
                risultato = studente;
            }

        }
        return risultato;
    }
}

// public static int trovaMinimo(int[] array){
//        int minimo = Integer.MAX_VALUE;
//        for (int numero : array){
//            if (numero < minimo){
//                minimo = numero;
//            }
//        }return minimo;
//    }