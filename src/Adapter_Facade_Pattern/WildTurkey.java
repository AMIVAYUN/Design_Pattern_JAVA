package Adapter_Facade_Pattern;

public class WildTurkey implements Turkey{
    public void gobble(){
        System.out.println("gobble gobble");
    }
    public void fly(){
        System.out.println("I'm flying short ");
    }
}
