# Semester-Group-Project

### Chelulei Faith Cherop - 163446
### Kimathi Dexter Kimathi - 166889
### Metabel Mumbi - 150472

## Project Overview
This project is a **Student Examination Processing System** developed for Strathmore University. It is designed to manage student data, record examination scores, calculate grades, and generate detailed report cards. 

## Features
- Input and store details for at least ten  students, including their names, ID numbers, and scores for various subjects.
- Automatically calculate average scores, assign grades, and provide performance-based recommendations.
- Generate and display detailed report cards for all students or a specific student.

## File Descriptions

### `Results.java`
This file contains the main entry point of the application. It is responsible for:
- Collecting input for student details, including names, ID numbers, and scores for various subjects.
- Creating instances of the `Student` class to store and process student data.
- Providing options to:
  - View all student report cards.
  - Search for and display a specific student's report card by their ID number.
- Managing the program flow and ensuring proper input validation.

**Key Functionalities:**
- **Menu System:** Allows users to choose between viewing all reports, searching for a specific report, or exiting the program.
- **Input Validation:** Ensures scores are within the range of 0 to 100 and that at least 10 students are entered.
- **Integration with `Student` Class:** Uses methods from the `Student` class to calculate grades, generate recommendations, and display report cards.

### `Student.java`
This file defines the `Student` class, which encapsulates all the data related to individual students. It is responsible for:
- Storing student details such as name, ID number, scores, and subjects.
- Calculating the average score for a student.
- Assigning grades based on the calculated average.
- Providing performance-based recommendations.
- Generating and displaying a detailed report card.

**Key Functionalities:**
- **Data Storage:** Stores student-specific data, including scores for each subject.
- **Grade Calculation:** Assigns grades (`A`, `B`, `C`, `D`, `E`) based on the average score.
- **Recommendations:** Provides feedback such as "Excellent," "Very Good," or "Poor" based on the grade.
- **Report Card Generation:** Displays a formatted report card with all relevant details, including the date of generation.
  
## Subjects Included
The system processes scores for the following subjects:
1. Linear Algebra
2. OOP I
3. Database Systems
4. Networking
5. Web Development

## Example Usage
1. **Input Student Data:**
   - Enter the number of students (minimum 10).
   - Provide each student's name, ID number, and scores for the subjects.
2. **View Reports:**
   - Choose to view all student reports or search for a specific student by their ID number.
3. **Exit the Program:**
   - Select the exit option to terminate the program.
