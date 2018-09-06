package com.company;

public class House {

    public static void main(String[] args) {

        Cat c1 = new Cat("Murka", 18);
        c1.getAge();
        Cat c2 = new Cat("Васька", 4);
        c2.getAge();
        Cat c3 = new Cat("Петька", 0);
        c3.getAge();
        Dog d1 = new Dog("Лайка",-1);
        d1.getAge();
        Dog d2 = new Dog("Барбос",5);
        d2.getAge();

    }

}
