package TemplateMethodPattern.Assignment;

public class AgeSorter extends PersonSorterTemplate {


    @Override
    void primitiveOperation1(Person[] people,int Position) {
        Person temp = people[Position];
        people[Position] = people[Position + 1];
        people[Position + 1] = temp;
    }

    @Override
    boolean primitiveCompare1(Person[] people, int Position) {
        return people[Position].getAge() - people[Position + 1].getAge() > 0;
    }



    /**
	public void bubbleSort(Person[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j].getAge() - data[j + 1].getAge() > 0) {
                	Person temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
     */


}
