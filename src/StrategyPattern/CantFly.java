package StrategyPattern;

public class CantFly implements Fly{
    @Override
    public void fly() {
        System.out.println("Can't Fly");
    }
}
