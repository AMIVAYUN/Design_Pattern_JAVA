package StrategyPattern;

interface Fly{
    default void fly(){
        System.out.println("Fly by"+ this);
    }
};

