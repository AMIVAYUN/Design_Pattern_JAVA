package StrategyPattern;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        this.setFly(new CantFly());
    }

    @Override
    public void swim(){
        System.out.println("can't swim");
    }
    @Override
    public void display(){
        System.out.println("Decoy Duck");
    }
}
