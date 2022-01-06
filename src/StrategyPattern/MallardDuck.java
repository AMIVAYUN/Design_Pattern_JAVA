package StrategyPattern;

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.setFly(new FlywithWings());
    }

    @Override
    public void display() {
        System.out.println("this is Mallard Duck");
    }

}
