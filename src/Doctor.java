public class Doctor extends Staff {

    public Doctor(String name, int age) {
        super(name, age, "Doctor");
    }

    @Override
    public void performDuties() {
        System.out.println(name + " examines patients and makes diagnoses.");
    }

    public void prescribeMedicine(String medicine) {
        System.out.println(name + " prescribes: " + medicine);
    }
}