package records;

public class Records {
    public void recordsExample() {
        Person matty = new Person("Matty", 19);
        PersonRecord martin = new PersonRecord("Martin", 21);

        System.out.println(matty.getAge());
        System.out.println(martin.age());
    }
}
