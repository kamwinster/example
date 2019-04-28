package com.company;

public class Main {

    public static void main(String[] args) {
        Dog Tuzik = new Dog(2);
        Tuzik.voice();
        BigDog Sharik = new BigDog(5);
        Sharik.voice();
    }
}

class Dog{
    public Dog(int a){
        age=a;
    }
    int age;
    public void voice(){
        for(int i=1; i<=age; i++){
            System.out.println("гав-гав");
        }
    }
}
class BigDog extends Dog{

    public BigDog(int a) {
        super(a);
    }
    public void voice(){
        for(int i=1; i<=age; i++){
            System.out.println("ГАВ");
        }
    }
}
