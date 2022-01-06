package TestPrac.TemplateMethodPattern;

public abstract class TemplateMethod {
    Person[] people;

    public TemplateMethod(Person[] people) {
        this.people = people;
    }

    public void templateMethod(Person[] people){
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1; j++) {
                if (primitiveOperation1(j)) {
                    primitiveOperation2(j);
                }
            }
        }
    }
    public abstract boolean primitiveOperation1(int j);
    public abstract void primitiveOperation2(int j);
    void ConcreteOperation(){
        //concreteMethod()
    }
}
