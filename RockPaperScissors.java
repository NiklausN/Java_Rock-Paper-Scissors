/*
 *  - Program Information:
 *    ~ Developer: Niklaus Newport
 *    ~ Website: Https://NiklausNewport.dev/
 *    ~ Contact Me: me@niklausnewport.dev
 *      |Please only contact me for programming/development related inquires. All else WILL be ignored|
 *    ~ Program Name: Rock Paper Scissors
 *    ~ Development Date(s): 14 May 2020
 *    ~ Program Function(s):
 *      1. Generates a Random Number.
 *      2. Determines if the Random Number is for Rock, Paper, or Scissor.
 *      3. Displays a Menu for the User to Select from.
 *      4. Retrieves the Input from the User
 *      5. Determines the Winner
 *      6. Displays the Winner
 */

// Import the Scanner
import java.util.Scanner;

public class RockPaperScissors {

    public static int generateNumber() {

        // Generate a Random Number from 1 to 3
        int result = (int)(1 + Math.random() * 4);

        // Return the Result
        return result;

    } // End of the generateNumber Method

    public static void main(String[] args) {

        // Import the Scanner
        Scanner uInput = new Scanner(System.in);

        // Start an Infinite Do-While Loop
        do {

            // Determine the Computers Move
            int cSel = generateNumber();

            // Prompt the User
            System.out.println("Please Select a Number from the List Below!");
            System.out.println("+-----------------------------------------+");
            System.out.println("|   1 = Rock   2 = Paper   3 = Scissors   |");
            System.out.println("|              4 = Exit                   |");
            System.out.println("+-----------------------------------------+");
            System.out.print("User: ");

            // Retrieve Input from the User
            int uSel = uInput.nextInt();

            // Execute the Input and Display the Result
            switch (uSel) {

                // User Chose Rock
                case 1:

                    // Determine Who Won
                    switch (cSel) {

                        // Computer Chose Rock
                        case 1:

                            // Display Winner
                            System.out.println("You chose Rock and the Computer chose Rock... It's a Draw!");

                            break;

                        // Computer Chose Paper
                        case 2:

                            // Display Winner
                            System.out.println("You chose Rock and the Computer chose Paper... The Computer Won! ");

                            break;

                        // Computer Chose Scissors
                        case 3:

                            // Display Winner
                            System.out.println("You chose Rock and the Computer chose Scissors... You won!");

                            break;

                    } // End of cSel Switch

                    break;

                // User Chose Paper
                case 2:

                    // Determine Who Won
                    switch (cSel) {

                        // Computer Chose Rock
                        case 1:

                            // Display Winner
                            System.out.println("You chose Paper and the Computer chose Rock... You win!");

                            break;

                        // Computer Chose Paper
                        case 2:

                            // Display Winner
                            System.out.println("You chose Paper and the Computer chose Paper... It's a Draw!");

                            break;

                        // Computer Chose Scissors
                        case 3:

                            // Display Winner
                            System.out.println("You chose Paper and the Computer chose Scissors... The Computer Won!");

                            break;

                    } // End of cSel Switch

                    break;

                // User Chose Scissors
                case 3:

                    // Determine Who Won
                    switch (cSel) {

                        // Computer Chose Rock
                        case 1:

                            // Display Winner
                            System.out.println("You chose Scissors and the Computer chose Rock... The Computer Won!");

                            break;

                        // Computer Chose Paper
                        case 2:

                            // Display Winner
                            System.out.println("You chose Scissors and the Computer chose Paper... You Win!");

                            break;

                        // Computer Chose Scissors
                        case 3:

                            // Display Winner
                            System.out.println("You chose Scissors and the Computer chose Scissors... It's a Draw!");

                            break;

                    } // End of cSel Switch

                    break;

                // User Chose to Exit Program
                case 4:

                    // Display a Farewell Message
                    System.out.println("Thank you for playing! Please come again!");

                    // Exit the Program
                    System.exit(0);

                    break;

                // Invalid Selection Made
                default:

                    // Display an Error Message
                    System.out.println("Error: Please select an option from the list displayed...");

            } // End of uSel Switch

        } while (true);

    } // End of the Main Method

} // End of the RockPaperScissors Class
