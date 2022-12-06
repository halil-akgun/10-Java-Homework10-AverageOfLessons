package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int math, physics, turkish, chemistry, muzic, totalGrade = 0, totalLessons = 0;
        double average;
        Scanner inp = new Scanner(System.in);

        System.out.print("your mathematics grade: ");
        math = inp.nextInt();
        System.out.print("your physics grade: ");
        physics = inp.nextInt();
        System.out.print("your turkish grade: ");
        turkish = inp.nextInt();
        System.out.print("your chemistry grade: ");
        chemistry = inp.nextInt();
        System.out.print("your muzic grade: ");
        muzic = inp.nextInt();

        if (math > 0 && math <= 100) {
            totalGrade += math;
            totalLessons++;
        }
        if (physics > 0 && physics <= 100) {
            totalGrade += physics;
            totalLessons++;
        }
        if (turkish > 0 && turkish <= 100) {
            totalGrade += turkish;
            totalLessons++;
        }
        if (chemistry > 0 && chemistry <= 100) {
            totalGrade += chemistry;
            totalLessons++;
        }
        if (muzic > 0 && muzic <= 100) {
            totalGrade += muzic;
            totalLessons++;
        }

        average = totalGrade / totalLessons;
        if (average > 55) {
            System.out.println("congratulations. you passed the class.");
        } else {
            System.out.println("you failed the class. see you again next year.");
        }
        System.out.print("average: " + average);

    }
}