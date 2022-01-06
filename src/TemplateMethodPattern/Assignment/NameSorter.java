package TemplateMethodPattern.Assignment;

import TemplateMethodPattern.Assignment.Person;

public class NameSorter extends PersonSorterTemplate{
/**
	public void bubbleSort(Person[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j].getName().compareTo(data[j + 1].getName()) > 0) {
                	Person temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
 */

    @Override
    void primitiveOperation1(Person[] people, int Position) {
        Person temp = people[Position];
        people[Position] = people[Position + 1];
        people[Position + 1] = temp;
    }

    @Override
    boolean primitiveCompare1(Person[] people, int Position) {
        return people[Position].getName().compareTo(people[Position + 1].getName()) > 0;
    }
}
