public abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Simple intro
    public void introduce() {
        System.out.println("Name: " + name + " | Age: " + age + " years old.");
    }
}