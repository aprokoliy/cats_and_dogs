package com.company;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public int getAge() {
        if (age <= 15 && age >= 1) {
            giveVoice();
        } else {
            System.out.println((char) 27 + "[31mWarning! " + name + " " + "has incorrect age!"+ (char)27 + "[0m");
        }
        return age;
    }

    @Override
    public void giveVoice() {
        System.out.println(name + " " + "мяукает" + ", возраст" + " " + age);
    }
}
