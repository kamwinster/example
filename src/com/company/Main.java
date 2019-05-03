package com.company;

public class Main {

    public static void main(String[] args) {
        Car model1 = new Car("Kio", 1000, 9);
        System.out.println("Марка: " + model1.marka + ", вес: " + model1.weight + ", мощность: " + model1.P);
        model1.setP(11);
        System.out.println("Марка: " + model1.marka + ", вес: " + model1.weight + ", мощность: " + model1.P);
        model1.changeP();
        System.out.println("Марка: " + model1.marka + ", вес: " + model1.weight + ", мощность: " + model1.P);
        Lorry model2 = new Lorry("mAz", 1500, 14, 55);
        System.out.println("Марка: " + model2.marka + ", вес: " + model2.weight + ", мощность: " + model2.P + ", грузоподъемность: " + model2.gruz);
        model2.changeP();
        model2.changegruz();
        model2.setmarka("MaZ");
        System.out.println("Марка: " + model2.marka + ", вес: " + model2.weight + ", мощность: " + model2.P + ", грузоподъемность: " + model2.gruz);
    }
}

class Car{
    String marka; //торговая марка
    int weight; //вес
    int P; //мощность

    public Car(String marka, int weight, int P) {
        this.marka = marka;
        this.weight = weight;
        this.P = P;
    }

    public void setP(int newP){ //метод переназначения мощности
        P = newP;
    }

    public void changeP(){ //метод изменения мощности
    P=P+1;
    }
}
class Lorry extends Car{
    int gruz; //грузоподъемность кузова

    public Lorry(String marka, int weight, int P, int gruz){
        super(marka,weight,P);
        this.gruz = gruz;
    }

    public void setmarka(String newmarka){ //метод переназначения марки
        marka = newmarka;
    }

    public void changegruz(){ //метод изменения грузоподъемности
        gruz=gruz-10;
    }
}


