abstract class Person {

    protected int personId;
    protected String name;
    protected String phoneNumber;

    public Person(int personId, String name, String phoneNumber) {
        this.personId = personId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public abstract void displayDetails();
}
