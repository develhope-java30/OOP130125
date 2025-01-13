/*
Implementare una classe Student, definita da identificativo, nome e media dei voti.
 La media è un numero in virgola mobile compreso fra 0 e 5.
 */

package org.example;

public class Studente {
    private String name;
    private double average;
    private int id;

    public Studente(String name,int id,double average){
        this.name=name;
        this.average=average;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }
}


