import java.util.Scanner;

public class IT26102005Lab8Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];

        // Enter 8 Student IDs
        for (int i = 0; i < 8; i++) {

            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            int id = input.nextInt();

            if (id <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                i--;
            } else {
                studentsArray[i] = id;
            }
        }

        // Search Student ID
        System.out.print("\nEnter a Student ID to Search: ");
        int searchID = input.nextInt();

        boolean found = false;

        for (int i = 0; i < 8; i++) {
            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("\nStudent is Available");
        } else {
            System.out.println("\nStudent is Not Available");
        }
    }
}