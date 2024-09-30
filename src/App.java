import java.util.Scanner;

public class App {

    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     * Do NOT edit this method until after you have fully satisfied the reqs for a 5
     */

    public void start() {
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        doMadlib();
    }

    /**
     * Get username asks the user for their name then greets them by name 
     */
    public String getUserName() {

        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣄⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠖⠚⠛⠓⣦⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣷⣶⣶⣶⣶⣤⡀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⢸⡆⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣾⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⢸⡇⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠘⡇⠀⠀⠀⠀⢸⡇⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⡇⠀");
        System.out.println("⠀⠀⠀⢀⣴⣶⣦⣄⠀⠀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⠋⠛⠛⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⣷⠀");
        System.out.println("⠀⠀⣴⣿⣿⣿⣿⣿⣷⣄⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⢸⡀");
        System.out.println("⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡧⠀⠀⠀⢰⣶⣶⣤⣼⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢷⣀⣀⣀⣀⣠⡾⠁");
        System.out.println("⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⣿⣿⣿⣿⣿⡿⠃⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⢬⣉⠉⣉⣀⡀⠀");
        System.out.println("⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⠀⠀⠙⣿⣿⣿⠟⠁⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠋⠀⠀⠉⠉⠉⠀⠙⡆");
        System.out.println("⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠉⠁⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡆⠀⠀⠀⠀⠀⢀⣼⠇");
        System.out.println("⠀⠀⠀⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢦⡀⠀⠀⣠⠞⠁⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⠛⠿⢿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠋⠁⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println(" ");

        // I added the final blank line so that there would be space between the "HI!"
        // banner and the question asking you to enter your name

        System.out.println("Please enter your name.");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        return name;

    }

    public void printGreeting(String username) {
        System.out.println("Hello " + username + " Welcome to Madlibs");
    }

    public void printInstructions() {
        System.out.println("Put in the following information to get a funny story!!");

        // Print instructions gives the user instructions on what to do to get their Madlib!!

    }

    // doMablib first asks the user to choose a story then prints out a story accordingly.

    public void doMadlib() {

        Scanner input = new Scanner(System.in);

        // here the user can choose one of three Madlibs story to follow

        System.out.println("Choose a story [1] [2] [3]");
        int storyChosen = input.nextInt();
        input.nextLine();

        // input.nextLine(); here makes sure that none of the lines will be skipped
        // input.nextInt considers Enter to be a character and it would result in an
        // empty string.

        if (storyChosen == 1) {
            // I used two = signs because when only one sign is used its asking the code if
            // a statement is true, two signs means youre making two variables equal
            // eachother

            System.out.println("Number:");
            String numberOne = input.nextLine();

            // System.out.println tells the user they should input a Number
            // String numberOne = input.nextLine tells the code to wair for the user to
            // input a value before it can continue with the code

            System.out.println("Adjective:");
            String adjectiveOne = input.nextLine();

            System.out.println("Boy Name:");
            String boyNameOne = input.nextLine();

            System.out.println("Food:");
            String foodOne = input.nextLine();

            System.out.println("Adjective:");
            String adjectiveTwo = input.nextLine();

            System.out.println("Noun:");
            String nounOne = input.nextLine();

            System.out.println("Adjective:");
            String adjectiveThree = input.nextLine();

            System.out.println("Animal:");
            String animalOne = input.nextLine();

            System.out.println("Past tense verb:");
            String pastTenseVerbOne = input.nextLine();

            System.out.println("Adjective:");
            String adjectiveFour = input.nextLine();

            System.out.println("Once, there was a group of " + numberOne + " teens, and they were so " + adjectiveOne
                    + ". One of them was named " + boyNameOne + ", he liked to eat " + foodOne + ". One " + adjectiveTwo
                    + " morning, the " + numberOne + " teens decided to go explore a haunted " + nounOne
                    + ". But, there night was cut short when they were attacked by a/an " + adjectiveThree + " dead "
                    + animalOne + ". They " + pastTenseVerbOne + " and got away from the ghost. " + boyNameOne
                    + " then went to his " + adjectiveFour + " house and enjoyed a plate of " + foodOne + ".");

        } else if (storyChosen == 2) {

            System.out.println("Adjective:");
            String adjectiveOne = input.nextLine();

            System.out.println("Verb ending in ING:");
            String verbOne = input.nextLine();

            System.out.println("Noun:");
            String nounOne = input.nextLine();

            System.out.println("Adjective:");
            String adjectiveTwo = input.nextLine();

            System.out.println("Movement past tense verb:");
            String verbTwo = input.nextLine();

            System.out.println("Number:");
            String numberOne = input.nextLine();

            System.out.println("Adjective:");
            String adjectiveThree = input.nextLine();

            System.out.println("Adjective:");
            String adjectiveFour = input.nextLine();

            System.out.println("Color:");
            String colorOne = input.nextLine();

            System.out.println("Verb:");
            String verbThree = input.nextLine();

            System.out.println("Food:");
            String foodOne = input.nextLine();

            System.out.println("Threat:");
            String threatOne = input.nextLine();

            System.out.println("One " + adjectiveOne + " night I was " + verbOne + " by my " + nounOne
                    + " when I heard a " + adjectiveTwo + " sound coming from my backyard. I " + verbTwo
                    + " into my backyard and saw a group of " + numberOne + " aliens. They were " + adjectiveThree + " "
                    + adjectiveFour + " and " + colorOne + ". They came into my house and one of them tried to "
                    + verbThree + " on my table but it slipped on some " + foodOne
                    + " their leader spoke 'Share all of humanities secrets with us or else " + threatOne + "''!");

        } else if (storyChosen == 3) {

            System.out.println("Place:");
            String placeOne = input.nextLine();

            System.out.println("Adjective:");
            String adjectiveOne = input.nextLine();

            System.out.println("Body part:");
            String bodyPartOne = input.nextLine();

            System.out.println("Object:");
            String objectOne = input.nextLine();

            System.out.println("Past tense Verb:");
            String verbOne = input.nextLine();

            System.out.println("Adjective:");
            String adjectiveTwo = input.nextLine();

            System.out.println("Color:");
            String colorOne = input.nextLine();

            System.out.println("Gibberish Phrase:");
            String gibberishOne = input.nextLine();

            System.out.println("Adjective:");
            String adjectiveThree = input.nextLine();

            System.out.println("Noun:");
            String nounOne = input.nextLine();

            System.out.println("Object:");
            String objectTwo = input.nextLine();

            System.out.println("Emotion:");
            String emotionOne = input.nextLine();

            System.out.println("I was in " + placeOne + " when suddenly I ran into a " + adjectiveOne
                    + " witch. I tried to run away but she grabbed my " + bodyPartOne
                    + ", I pushed her off but tripped on a " + objectOne + ". She " + verbOne + " and let out a "
                    + adjectiveTwo + " laugh. She got a " + colorOne + " wand out of her pocket and said '"
                    + gibberishOne + "'. Suddenly I was transformed into a " + adjectiveThree + " " + nounOne
                    + ", then she got a " + objectTwo + " out of her bag and took a bite out of it. I was so "
                    + emotionOne + ".");

        } else {
            System.out.println("You didn't choose a value between 1 - 3, so you can't play >:))");
            // I need to do this because the code needs to know what to do incase a value
            // between 1-3 isnt chosen

        }
    }

    // add and implement the other methods you need in this area below!

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
