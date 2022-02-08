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
    public void makeStep(){
        System.out.println("Made step");
    }
    @Override
    public String toString() {
        return "Animal name " +name;
    }
}
