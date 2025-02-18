

import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

/**
 * SortedLinkedList program reads a list of integer numbers from user input
 * and stores them in a LinkedList sorted in ascending order.
 *
 * <p>The program utilizes the Java Collections Framework for sorting and
 * ensures that it runs from the command line without requiring an IDE.</p>
 *
 * <p><b>Code Reuse:</b></p>
 * <ul>
 *   <li> Uses {@code LinkedList<Integer>} from Java Collections Framework to store data instead of creating a custom list implementation. </li>
 *   <li> Uses {@code Collections.sort()} for sorting instead of implementing a sorting algorithm manually. </li>
 *   <li> Uses {@code Scanner} for dynamic user input instead of handling raw input streams. </li>
 * </ul>
 *
 * @author Saravanan Soundappan
 * @version 1.1
 */
public class SortedLinkedList {

    /**
     * Reads integer inputs from the user, stores them in a LinkedList,
     * and sorts them in ascending order.
     *
     * <p><b>Code Reuse:</b></p>
     * <ul>
     *   <li>Scanner class is reused for handling user input.</li>
     *   <li>LinkedList class from Java Collections Framework is used to store numbers dynamically.</li>
     *   <li>Collections.sort() method is used instead of writing a custom sorting algorithm.</li>
     * </ul>
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Reuses Scanner class for user input
        LinkedList<Integer> numbers = new LinkedList<>(); // Reuses LinkedList class for dynamic storage

        System.out.println("Enter integers (type 'done' to finish):");

        // Reusing Scanner to continuously read integers from user input
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt()); // Reusing LinkedList to store input numbers
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break; // Exit input loop when "done" is entered
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
                }
            }
        }

        scanner.close(); // Proper resource management by closing Scanner

        // Code reuse: Using Java Collections Framework's built-in sort instead of custom sorting
        Collections.sort(numbers);

        // Printing the sorted LinkedList
        System.out.println("Sorted Numbers: " + numbers);
    }
}
