public class Nurse extends Staff {

    public Nurse(String name, int age) {
        super(name, age, "Nurse");
    }

    @Override
    public void performDuties() {
        System.out.println(name + " supports doctor and cares for patients.");
    }

    public void checkVitals(Patient patient) {
        // Fake vitals just for demo
        System.out.println(name + " checks vitals of " + patient.name + " (OK).");
    }
}