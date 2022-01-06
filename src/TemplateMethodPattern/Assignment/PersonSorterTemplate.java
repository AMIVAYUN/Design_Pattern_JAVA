package TemplateMethodPattern.Assignment;

public abstract class PersonSorterTemplate {
    public final void bubbleSort(Person[] people){
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1; j++) {
                if (primitiveCompare1(people,j)) {
                    primitiveOperation1(people,j);
                }
            }
        }
    }

    abstract void primitiveOperation1(Person[] people,int Position);

    abstract boolean primitiveCompare1(Person[] people,int Position);
}
