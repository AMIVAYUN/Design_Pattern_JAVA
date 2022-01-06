package TestPrac.TemplateMethodPattern;

public class AgeSorter extends TemplateMethod{


    public AgeSorter(Person[] people) {
        super(people);
    }

    @Override
    public boolean primitiveOperation1(int j){
        return people[j].getAge()-people[j+1].getAge()>0;
    }

    @Override
    public void primitiveOperation2(int j) {
        Person temp = people[j];
        people[j] = people[j + 1];
        people[j + 1] = temp;
    }
    /*
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
