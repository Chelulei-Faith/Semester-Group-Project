import java.util.ArrayList;
import java.util.Scanner;

public class Results {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        String[] subjects = {"Linear Algebra", "OOP I", "Database Systems", "Networking", "Web Development"};

        System.out.println("STRATHMORE UNIVERSITY EXAMINATION PROCESSING SYSTEM");
        System.out.println("==================================================");

        int numStudents;
        do {
            System.out.print("Enter the number of students (minimum 10): ");
            numStudents = scanner.nextInt();
            scanner.nextLine();

            if (numStudents < 10) {
                System.out.println("Error: You must enter at least 10 students.");
            }
        } while (numStudents < 10);
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEntering details for Student " + (i + 1) + ":");
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student ID number: ");
            String idNumber = scanner.nextLine();

            Student student = new Student(name, idNumber, subjects);

            int[] scores = new int[subjects.length];
            for (int j = 0; j < subjects.length; j++) {
                int score;
                do {
                    System.out.print("Enter score for " + subjects[j] + " (0-100): ");
                    score = scanner.nextInt();

                    if (score < 0 || score > 100) {
                        System.out.println("Error: Score must be between 0 and 100.");
                    }
                } while (score < 0 || score > 100);

                scores[j] = score;
            }

            student.setScores(scores);
            students.add(student);
            scanner.nextLine();
        }

        int choice;
        do {
            System.out.println("\nSTRATHMORE UNIVERSITY EXAMINATION SYSTEM");
            System.out.println("1. View all student reports");
            System.out.println("2. View specific student report");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    for (Student student : students) {
                        student.displayReportCard();
                    }
                    break;

                case 2:
                    System.out.print("Enter student ID number: ");
                    String searchId = scanner.nextLine();
                    boolean found = false;

                    for (Student student : students) {
                        if (student.idNumber.equals(searchId)) {
                            student.displayReportCard();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student with ID " + searchId + " was not found.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting the program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}