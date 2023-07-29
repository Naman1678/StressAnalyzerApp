public class StressLevelAnalyzer extends UserDetailsAnalyzer {

    public StressLevelAnalyzer(int age, int sleepHours) {
        super(age, sleepHours);
    }

    @Override
    public String analyzeUserDetails() {
        int stressRating; // Declare the stressRating variable here
        String output = "";

        if (sleepHours >= 1 && sleepHours <= 5) {
            // User needs more sleep, provide article and stress rating
            String article = "Article: The Importance of Sufficient Sleep for a Healthy Body, https://www.sleepfoundation.org/how-sleep-works/why-do-we-need-sleep";
            stressRating = 5; // Scale of 5 for high stress

            // Update the text field with the output
            output = "For those who regularly sleep for only 1-6 hours each night, getting 7-8 hours of sleep is crucial. Sleep is essential for both physical and mental health. The body can engage in vital restorative processes with 7-8 hours of sleep, fostering improved immune function, memory consolidation, and cognitive abilities. Additionally, getting enough sleep promotes stress reduction, mood regulation, and cardiovascular health in general. Getting the recommended amount of sleep each night ensures the highest level of performance, productivity, and general well-being.\n" + article + "\nStress Rating: " + stressRating;
            // You can set the output in the txtOutputField using: txtOutputField.setText(output);
            System.out.println(output);
        } else if (sleepHours >= 6 && sleepHours <= 10) {
            // User's sleep schedule is fine, provide helpline numbers and sites
            String helplines = "Helpline Numbers: 1-800-985-5990, \nWebsites: https://988lifeline.org/";

            // Update the text field with the output
            output = "Your sleep schedule is fine. But,for further more clarification, you can contact on the helpine numbers provided.\n" + helplines;
            // You can set the output in the txtOutputField using: txtOutputField.setText(output);
            System.out.println(output);
        } else {
            // User might be sleeping too much, provide articles for productive routines
            String article = "Article: Maximizing Productivity with Optimal Sleep Hours, ";
            stressRating = 3; // Set a default stress rating for this case

            // Update the text field with the output
            output = "It's equally important for people who regularly oversleep, sleeping more than 10 hours each night, to get 7-8 hours of sleep. Even though it may seem counterintuitive, getting too much sleep can have negative effects on your health, including drowsiness, lethargy, and even a higher risk of developing long-term conditions like diabetes and obesity. A consistent sleep schedule of 7-8 hours per night promotes ideal physical, emotional, and cognitive health. It aids in the body's establishment of a regular circadian rhythm, which boosts productivity throughout the day by improving energy and focus.\n" + //
                    ""+ article + "\nStress Rating: " + stressRating;
             // Update the txtOutputField using the controller instance
        }
        return output;
    }
}


