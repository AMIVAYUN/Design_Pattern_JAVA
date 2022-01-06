package StrategyPattern;
//TODO 사례1  일반 상속은 결국에 장난감오리가 추가되거나 하면 원하지 않는 FLY 기능이 추가될 수가 있다.
//TODO 사례 인터페이스로 FLYABLE()이나 QUACKABLE을 구현한다면 여러 덕들이 코드를 반복해서 만들어야 되는 경우가 생긴다.
// DUCK 클래스의 Fly와 Quack이 자주 바뀜. 나머지 코드는 변함없음. ex)swim and display.
public class Duck {
    private Quack quack;
    private Fly fly;

    public void swim(){
        System.out.println(this+"is swimming");
    }
    public void display(){
        System.out.println("this is"+this);
    }
    public void setQuack(Quack quack) {
        this.quack = quack;
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }

    public void fly(){
        this.fly.fly();
    }

}

