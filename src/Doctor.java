public class Doctor extends Staff {

    public Doctor(String name, int age) {
        super(name, age, "Doctor");
    }

    @Override
    public void performDuties() {
        // Basic doctor duties
        System.out.println(getName() + " examines patients and makes diagnoses.");
    }

    public void prescribeMedicine(String medicine) {
        // Extra method for Doctor
        System.out.println(getName() + " prescribes: " + medicine);
    }
}