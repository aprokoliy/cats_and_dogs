package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public abstract class Animal{

public int age;
public String name;

    public Animal(String name, int age) {
         this.age=age;
         this.name=name;
    }
    public abstract void giveVoice();
    public abstract int getAge();
}
