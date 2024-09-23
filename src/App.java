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
        System.out.println("Hii, enter your name.");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        return name; 
      
    }

    public void printGreeting (String username) {
        System.out.println("Hello "+ username + " Welcome to Madlibs");
    }

     public void printInstructions() {
       System.out.println("Answer these questions to get a funny story!!");
    
    }
    public void doMadlib() {

    }
    
    // add and implement the other methods you need in this area below!
    
  

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
