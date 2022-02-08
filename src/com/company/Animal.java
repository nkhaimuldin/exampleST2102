package com.company;

public abstract class Animal {
    private String name;
    public Animal(String name){
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void makeSound(); //abstract method without any implementation

    @Override
    public String toString() {
        return "Animal name " +name;
    }
}
