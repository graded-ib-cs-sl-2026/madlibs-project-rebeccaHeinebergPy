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
     * Document what this method does here!
     */
    public String getUserName () {

        System.out.println ("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣄⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠖⠚⠛⠓⣦⠀⠀");
        System.out.println ("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣷⣶⣶⣶⣶⣤⡀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⢸⡆⠀");
        System.out.println ("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣾⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⢸⡇⠀");
        System.out.println ("⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠘⡇⠀⠀⠀⠀⢸⡇⠀");
        System.out.println ("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⡇⠀");
        System.out.println ("⠀⠀⠀⢀⣴⣶⣦⣄⠀⠀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⠋⠛⠛⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⣷⠀");
        System.out.println ("⠀⠀⣴⣿⣿⣿⣿⣿⣷⣄⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⢸⡀");
        System.out.println ("⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡧⠀⠀⠀⢰⣶⣶⣤⣼⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢷⣀⣀⣀⣀⣠⡾⠁");
        System.out.println ("⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⣿⣿⣿⣿⣿⡿⠃⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⢬⣉⠉⣉⣀⡀⠀");
        System.out.println ("⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⠀⠀⠙⣿⣿⣿⠟⠁⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠋⠀⠀⠉⠉⠉⠀⠙⡆");
        System.out.println ("⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠉⠁⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡆⠀⠀⠀⠀⠀⢀⣼⠇");
        System.out.println ("⠀⠀⠀⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢦⡀⠀⠀⣠⠞⠁⠀");
        System.out.println ("⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⠛⠿⢿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠋⠁⠀⠀⠀");
        System.out.println ("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println (" ");



        System.out.println("Please enter your name.");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        return name; 
      
    }

    public void printGreeting (String username) {
        System.out.println("Hello "+ username + " Welcome to Madlibs");
    }

     public void printInstructions() {
       System.out.println("Put in the following information to get a funny story!!");
    
    }
    public void doMadlib() {

        Scanner input = new Scanner(System.in);


        System.out.println ("Number:");
        String numberOne = input.nextLine();
        
        System.out.println ("Adjective:");
        String adjectiveOne = input.nextLine();

        System.out.println ("Boy Name:");
        String boyNameOne = input.nextLine();

        System.out.println ("Food:");
        String foodOne = input.nextLine();

        System.out.println ("Adjective:");
        String adjectiveTwo = input.nextLine();

        System.out.println ("Noun:");
        String nounOne = input.nextLine();

        System.out.println ("Adjective:");
        String adjectiveThree = input.nextLine();

        System.out.println ("Animal:");
        String animalOne = input.nextLine();

        System.out.println ("Past tense verb:");
        String pastTenseVerbOne = input.nextLine();

        System.out.println ("Adjective:");
        String adjectiveFour = input.nextLine();

        System.out.println("Once, there was a group of " + numberOne + " teens, and they were so " + adjectiveOne + ". One of them was named " + boyNameOne + ", he liked to eat " + foodOne + ". One " + adjectiveTwo + " morning, the " + numberOne + " teens decided to go explore a haunted " + nounOne + ". But, there night was cut short when they were attacked by a/an" + adjectiveThree + " deadbeb " + animalOne + ". They " + pastTenseVerbOne + " and got away from the ghost. " + boyNameOne + " then went to his " + adjectiveFour + " house and enjoyed a plate of " + foodOne + ".");

    }

    
    
    // add and implement the other methods you need in this area below!
    
  

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
