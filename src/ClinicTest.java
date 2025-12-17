public class ClinicTest {
    public static void main(String[] args) {
        // Create staff
        Doctor doc = new Doctor("Dr. Kowalski", 45);
        Nurse nurse = new Nurse("Anna", 30);
        Receptionist rec = new Receptionist("Tomasz", 28);

        // Create patient
        Patient p1 = new Patient("Konrad", 22, "flu");

        // Introductions
        System.out.println("=== Introductions ===");
        doc.introduce();
        nurse.introduce();
        rec.introduce();
        p1.introduce();

        // Staff duties
        System.out.println("\n=== Staff duties ===");
        doc.performDuties();
        nurse.performDuties();
        rec.performDuties();

        // Patient treatment
        System.out.println("\n=== Treatment ===");
        p1.receiveTreatment();

        // Unique subclass methods
        System.out.println("\n=== Unique methods ===");
        doc.prescribeMedicine("Paracetamol");
        nurse.checkVitals(p1);
    }
}