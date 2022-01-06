package StrategyPattern;

public class RubberDuck extends Duck  {
    public RubberDuck() {
        this.setFly(new CantFly());
    }

    @Override
    public void display(){
        System.out.println("Rubber Duck");
    }

}
