package StrategyPattern;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        this.setFly(new FlywithWings());
    }

    @Override
    public void display(){
        System.out.println("this is Redhead Duck");
    }



}
