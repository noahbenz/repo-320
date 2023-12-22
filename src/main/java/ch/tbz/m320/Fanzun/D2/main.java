package ch.tbz.m320.Fanzun.D2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Aufgabe a)
        SchoolClass schoolClass = new SchoolClass();

        Student noah = new Student("noah");
        noah.addTest(new Exam(80, 100));
        noah.addTest(new Exam(90, 100));
        noah.addTest(new Exam(75, 100));

        Student jann = new Student("jann");
        jann.addTest(new Exam(60, 80));
        jann.addTest(new Exam(70, 80));
        jann.addTest(new Exam(80, 80));

        Student marwin = new Student("marwin");
        marwin.addTest(new Exam(65, 90));
        marwin.addTest(new Exam(85, 90));
        marwin.addTest(new Exam(40, 90));

        schoolClass.addStudent(noah);
        schoolClass.addStudent(jann);
        schoolClass.addStudent(marwin);

        // Aufgabe b)
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter student name (or type 'exit' to cancel):");
            String studentName = scanner.nextLine();

            if (studentName.equalsIgnoreCase("exit")) {
                System.out.println("process finished");
                break;
            }

            Student student = new Student(studentName);

            for (int a = 0; a < 3; a++) {
                System.out.println("Enter test points for " + studentName + " (Test " + (a + 1) + "):");
                int testPoints = scanner.nextInt();
                System.out.println("Enter total points for Test " + (a + 1) + ":");
                int totalPoints = scanner.nextInt();

                Exam exam = new Exam(testPoints, totalPoints);
                student.addTest(exam);
            }

            schoolClass.addStudent(student);
            scanner.nextLine();
        }
        System.out.println("Class average: " + schoolClass.getAverage());

        for (Student student : schoolClass.getStudents()) {
            System.out.println(student.getName() + " average: " + student.getNotenSchnitt());
        }

        scanner.close();
    }
}
