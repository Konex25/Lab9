public class Patient extends Person implements Treatable {
    private String condition;

    public Patient(String name, int age, String condition) {
        super(name, age);
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public void receiveTreatment() {
        // Very simple logic
        if (condition.equalsIgnoreCase("flu")) {
            System.out.println(name + " gets rest + fluids treatment.");
        } else if (condition.equalsIgnoreCase("injury")) {
            System.out.println(name + " gets wound care treatment.");
        } else {
            System.out.println(name + " gets general consultation.");
        }
    }
}