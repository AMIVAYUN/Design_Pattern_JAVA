package TemplateMethodPattern;

public abstract class CaffeineBeverage {
    public final void prepareRecipe() { /** 여기서 final은 클래스의 코드를 고정하는 역할 */
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    public abstract void brew();
    public abstract void addCondiments();
    public void boilWater() {
        System.out.println("물 끓이는 중");
    }
    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}