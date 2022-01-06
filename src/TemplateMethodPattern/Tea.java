package TemplateMethodPattern;

public class Tea {
    void prepareRecipe() {
        boilWater();
        //steepTeaBag();
        pourInCup();
        //addLemon();
    }
    public void boilWater() {
        System.out.println("물 끓이는 중");
    }
    public void brewCoffeeGrinds() {
        System.out.println("차를 우려내는 중");
    }
    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
    public void addSugarAndMilk() {
        System.out.println("레몬을 추가하는 중");
    }
}