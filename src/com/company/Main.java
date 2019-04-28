package com.company;

public class Main {

    public static void main(String[] args) {
        Dog Tuzik = new Dog(2, "Тузик");
        Tuzik.voice();
    }
}
class Dog{
    public Dog(int a, String n){
        age=a;
        name=n;
    }
    int age;
    String name;
    public void voice(){
        for(int i=1; i<=age; i++){
            System.out.println("гав-гав");
        }
    }
}
