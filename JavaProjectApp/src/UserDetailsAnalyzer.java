public abstract class UserDetailsAnalyzer {
    protected int age;
    protected int sleepHours;

    public UserDetailsAnalyzer(int age, int sleepHours) {
        this.age = age;
        this.sleepHours = sleepHours;
    }

    // Abstract method to be implemented by the subclass
    public abstract String analyzeUserDetails();

    // Helper method to check if the age is between 1 and 18
    protected boolean isAgeBetween1And18() {
        return age >= 1 && age <= 18;
    }

    // Helper method to check if the sleep hours are between 1 and 6
    protected boolean isSleepHoursBetween1And6() {
        return sleepHours >= 1 && sleepHours <= 6;
    }
}
