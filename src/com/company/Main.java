package com.company;

public class Main {

    public static void main(String[] args) {
        Car model1 = new Car("Kio", 1000, 9);
        model1.CheckP();
        Car model2 = new Car("BMW", 1200, 13);
        model2.CheckP();
        Lorry model3 = new Lorry("mAz", 2000, 15, 500);
        model3.CheckP();
    }
}

class Car {
    String marka; //торговая марка
    int weight; //вес
    int P; //мощность

    public Car(String marka, int weight, int P) {
        this.marka = marka;
        this.weight = weight;
        this.P = P;
    }

    public void CheckP() {
        if(P > 10) {
            System.out.println("Ваша машина " + marka+ " с весом " +weight+ " является мощной");
        } else {
            System.out.println("Ваша машина " + marka+ " с весом " +weight+ " является слабой");
        }
    }
}
class Lorry extends Car{
    int gruz; //грузоподъемность кузова
    public Lorry(String marka, int weight, int P, int gruz) {
        super(marka, weight, P);
        this.gruz = gruz;
    }
    public void CheckP() {
        if(P > 10) {
            System.out.println("Ваша машина " + marka+ " с весом " +weight+ " и грузоподъемностью кузова " +gruz+ " является мощной");
        } else {
            System.out.println("Ваша машина " + marka+ " с весом " +weight+ " и грузоподъемностью кузова " +gruz+ " является слабой");
        }
    }
}
