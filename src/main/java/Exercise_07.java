import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {

    }

    //第七节第一题
    public static void exerciseOne() {

        Scanner input = new Scanner(System.in);

        int positives = 0;  // Count the number of positive numbers
        int negatives = 0;  // Count the number of negative numbers
        int count = 0;      // Count all numbers
        double total = 0;    // Accumulate a totol

        System.out.print("Please enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();

        if (number == 0) {  // Test for sentinel value
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }

        while (number != 0) {// Test for sentinel value
            if (number > 0) {
                positives++;  // Increase positives
            } else {
                negatives++;  // Increase negatives
            }
            total += number;  // Accumulate total
            count++;        // Increase the count
            number = input.nextInt();
        }

        // Calculate the average
        double average = total / count;

        // Display results
        System.out.println(
                "The number of positive is " + positives +
                        "\nThe number of negatives is " + negatives +
                        "\nThe total is total " + total +
                        "\nThe average is " + average);
    }

    //第七节第二题
    public static void exerciseSecond() {

        final double POUNDS_PER_KILOGRAM = 2.2;  // Create constant

        // Display header for table
        System.out.println("Kilograms      Pounds");

        // Display table
        for (int i = 1; i <= 199; i += 2) {
            System.out.printf(
                    "%-15d%6.1f\n", i, (i * POUNDS_PER_KILOGRAM));
        }
    }

    //第七节第三题
    public static void exerciseThree() {

        // Create a constant number of kilometers in a mile
        final double KILOMETERS_PER_MILE = 1.609;

        // Display table header
        System.out.println(
                "Miles        Kilometers");

        // Create and display table showing conversion from miles to kilometers
        for (int i = 1; i <= 10; i++) {
            System.out.printf(
                    "%-13d%-10.3f\n", i, (i * KILOMETERS_PER_MILE));
        }
    }

    //第七节第四题
    public static void exerciseFour() {

        // Create constant value for number of pounds per kilogram
        final double POUNDS_PER_KILOGRAM = 2.2;

        // Display table header
        System.out.println(
                "Kilograms    Pounds     |     Pounds      Kilograms");
        for (int k = 1, p = 20; k <= 199 && p <= 515; k += 2, p += 5) {
            System.out.printf(
                    "%-12d%7.1f", k, (k * POUNDS_PER_KILOGRAM));
            System.out.print("     |     ");
            System.out.printf(
                    "%-9d%12.2f\n",
                    p, (p / POUNDS_PER_KILOGRAM));
        }
    }

    //第七节第五题
    public static void exerciseFive() {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        int highestScore = 0;      // Holds the hightest student score
        String highestScoreName = ""; // Holds the student name with highest score

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Prompt the user to enter each student's name and score
        System.out.println("Enter each student’s name and score");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print(
                    "Student: " + (i + 1) +
                            "\n   Name: ");
            String name = input.next();
            System.out.print(
                    "   Score: ");
            int score = input.nextInt();

            // Test if score is higher than highest score
            if (score > highestScore) {
                highestScore = score;
                highestScoreName = name;
            }
        }
    }

    //第七节第六题
    public static void exerciseSix() {

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int score,          // Holds students' score
                highest = 0,      // Highest score
                secondHigest = 0;  // Second highest score
        String name = "",    // Holds students' name
                student1 = "",  // Highest scoring student name
                student2 = "";  // Second highest scoring student name

        // Prompt the user to enter each students' name and score
        System.out.println("Enter each students' name and score:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print(
                    "Student: " + (i + 1) + "\n   Name: ");
            name = input.next();
            System.out.print("   Score: ");
            score = input.nextInt();

            if (i == 0) {
                // Make the first student the highest scoring student so far
                highest = score;
                student1 = name;
            } else if (i == 1 && score > highest) {
                // Second student entered scored
                // higher than first student
                secondHigest = highest;
                highest = score;
                student2 = student1;
                student1 = name;
            } else if (i == 1) {
                // Second student entered scored
                // lower than first student
                secondHigest = score;
                student2 = name;
            } else if (i > 1 && score > highest && score > secondHigest) {
                // Last student entered has the highest score
                secondHigest = highest;
                student2 = student1;
                highest = score;
                student1 = name;
            } else if (i > 1 && score > secondHigest) {
                // Last student entered has the second highest score
                student2 = name;
                secondHigest = score;
            }
        }

        // Display the student with the hightest score
        // and the student with the second-hightest score.
        System.out.println(
                "Higest scoring student: " + student1 +
                        "\nSecond Higest scoring student: " + student2);
    }
}
