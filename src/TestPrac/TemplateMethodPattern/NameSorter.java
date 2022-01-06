package TestPrac.TemplateMethodPattern;

public class NameSorter extends TemplateMethod{

    public NameSorter(Person[] people) {
        super(people);
    }



    @Override
    public boolean primitiveOperation1(int j) {
        return this.people[j].getName().compareTo(this.people[j+1].getName())>0;
    }

    @Override
    public void primitiveOperation2(int j) {
        Person temp=people[j];
        people[j]=people[j+1];
        people[j+1]=people[j];
    }
    /**
     * public void bubbleSort(Person[] data) {
     *         for (int i = 0; i < data.length - 1; i++) {
     *             for (int j = 0; j < data.length - 1; j++) {
     *                 if (data[j].getName().compareTo(data[j + 1].getName()) > 0) {
     *                 	Person temp = data[j];
     *                     data[j] = data[j + 1];
     *                     data[j + 1] = temp;
     *                 }
     *             }
     *         }
     *     }
     */
}
