package StrategyPattern;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Duck>list=new ArrayList<>();
        MallardDuck mallardDuck=new MallardDuck();

        RedheadDuck redheadDuck=new RedheadDuck();
        DecoyDuck decoyDuck=new DecoyDuck();
        RubberDuck rubberDuck=new RubberDuck();
        list.add(mallardDuck);
        list.add(redheadDuck);
        list.add(decoyDuck);
        list.add(rubberDuck);
        for(Duck duck:list){
            duck.display();
            duck.swim();
        }

        System.out.println("Strategy prac");
        rubberDuck.fly();
        mallardDuck.fly();

    }
}
