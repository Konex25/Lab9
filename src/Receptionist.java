public class Receptionist extends Staff {

    public Receptionist(String name, int age) {
        super(name, age, "Receptionist");
    }

    @Override
    public void performDuties() {
        System.out.println(name + " registers patients and schedules visits.");
    }
}