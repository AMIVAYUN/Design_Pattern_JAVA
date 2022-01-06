package StrategyPattern;

interface Quack{
    default void Quack(){
        System.out.println("Quack by"+ this);
    }
};