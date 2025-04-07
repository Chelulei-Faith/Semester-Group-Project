import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private String name;
    public String idNumber;
    private int[] scores;
    private String[] subjects;
    private double averageScore;
    private String grade;
    private String recommendation;

    public Student(String name, String idNumber, String[] subjects) {
        this.name = name;
        this.idNumber = idNumber;
        this.subjects = subjects;
        this.scores = new int[subjects.length];
    }

    public void setScores(int[] scores) {
        this.scores = scores;
        calculateAverage();
        assignGrade();
        assignRecommendation();
    }

    private void calculateAverage() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        this.averageScore = (double) sum / scores.length;
    }

    private void assignGrade() {
        if (averageScore >= 70) {
            this.grade = "A";
        } else if (averageScore >= 60) {
            this.grade = "B";
        } else if (averageScore >= 50) {
            this.grade = "C";
        } else if (averageScore >= 40) {
            this.grade = "D";
        } else {
            this.grade = "E";
        }
    }

    private void assignRecommendation() {
        switch (this.grade) {
            case "A":
                this.recommendation = "Excellent";
                break;
            case "B":
                this.recommendation = "Very Good";
                break;
            case "C":
                this.recommendation = "Good";
                break;
            case "D":
                this.recommendation = "Fair";
                break;
            default:
                this.recommendation = "Poor";
                break;
        }
    }

    public void displayReportCard() {
        System.out.println("\n====================================");
        System.out.println("         STRATHMORE UNIVERSITY       ");
        System.out.println("           STUDENT REPORT CARD       ");
        System.out.println("====================================");
        System.out.println("Name: " + name);
        System.out.println("ID Number: " + idNumber);
        System.out.println("------------------------------------");
        System.out.println("SUBJECT\t\tSCORE");
        System.out.println("------------------------------------");

        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + "\t\t" + scores[i]);
        }

        System.out.println("------------------------------------");
        System.out.println("Average Score: " + String.format("%.2f", averageScore));
        System.out.println("Grade: " + grade);
        System.out.println("Recommendation: " + recommendation);

        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Date: " + today.format(formatter));
        System.out.println("====================================\n");
    }
}