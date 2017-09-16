package com;

import java.util.Scanner;

public class Grade {

	// Method to print the grade for the subjects
	public void printGrade(int marks, String subject) {
		if (marks > 70) {												//	Prints A if marks is greater than 70
			System.out.println("Grade for " + subject + " : A");
		} else if (marks >= 61) {										// Prints B if marks is in-between 61 and 70
			if (marks <= 70) {
				System.out.println("Grade for " + subject + " : B");
			}
		} else {														//	Prints C if marks is less than 61
			System.out.println("Grade for " + subject + " : C");
		}
	}

	// Method to calculate average of PCM and also checks if the entered value is positive and calls print grade of subjects
	public void getGradeAndAvg(int markP, int markC, int markM) {
		Grade grade = new Grade();

		if (markP <= 0 || markC <= 0 || markM <= 0) {		// Check for the positive value of marks and if it is negative program execution is terminated. 
			System.out.println();
			System.out.println("************************Enter positive values to get GRADE***************************");
			System.exit(1);
		}

		// Calls printGrade method
		grade.printGrade(markP, "PHYSICS");			
		grade.printGrade(markC, "CHEMISTRY");
		grade.printGrade(markM, "MATHEMATICS");

		if (markP > 0 && markC > 0 && markM > 0) {		//	Average calculation
			int avg = (markP + markC + markM) / 3;
			System.out.println();
			grade.printGrade(avg, "ALL Subjects ");
		}
	}

	// Main function
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);		//	Gets the user input
		int markP, markC, markM;

		Grade grade = new Grade();

		System.out.println("Enter the marks of PHYSICS");
		markP = n.nextInt();
		System.out.println("Enter the marks of CHEMISTRY");
		markC = n.nextInt();
		System.out.println("Enter the marks of MATHEMATICS");
		markM = n.nextInt();

		grade.getGradeAndAvg(markP, markC, markM);

		n.close();
	}

}
