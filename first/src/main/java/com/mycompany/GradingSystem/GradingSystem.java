package com.mycompany.GradingSystem;

import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("         SIMPLE GRADING SYSTEM\n");

        System.out.println("Grades are calculated based on thee components:");
        System.out.println("1. Exam");
        System.out.println("2. Performance Task");
        System.out.println("3. Other Written Assessments\n");
        System.out.println("Enter your score:");

        System.out.print("Exam Score: ");
        double examScore = input.nextDouble();

        System.out.print("Exam Total Score: ");
        double examTotal = input.nextDouble();

        double examPercent = (examScore / examTotal) * 100;

        System.out.print("\nPerformance Task Score: ");
        double ptScore = input.nextDouble();

        System.out.print("Performance Task Total Score: ");
        double ptTotal = input.nextDouble();

        double ptPercent = (ptScore / ptTotal) * 100;

        System.out.print("\nWritten Assessments Score: ");
        double writtenScore = input.nextDouble();

        System.out.print("Written Assessment Total Score: ");
        double writtenTotal = input.nextDouble();

        double writtenPercent = (writtenScore / writtenTotal) * 100;

        System.out.println("\nWeight Distribution:");
        System.out.println("Exams: 30%");
        System.out.println("Performance Task: 40%");
        System.out.println("Written Assessments: 30%\n");

        double finalGrade =
                (examPercent * 0.30) +
                (ptPercent * 0.40) +
                (writtenPercent * 0.30);

        System.out.println("Computed Percentages:");
        System.out.println("Exam: " + String.format("%.2f", examPercent) + "%");
        System.out.println("Performance Task: " + String.format("%.2f", ptPercent) + "%");
        System.out.println("Written Assessments: " + String.format("%.2f", writtenPercent) + "%\n");

        System.out.println("Final Grade: " + String.format("%.2f", finalGrade) + "%");

        System.out.println("\n----------- RESULT ------------");
        if (finalGrade >= 75) {
            System.out.println("Status: PASSED");
        } else {
            System.out.println("Status: FAILED");
        }
        System.out.println("--------------------------------");

    }
}
