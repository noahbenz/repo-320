package ch.tbz.m320.Fanzun.D2;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private List<Exam> exams;

    public Student(String name) {
        this.name = name;
        this.exams = new ArrayList<>();
    }

    public float getNotenSchnitt() {
        if (exams.isEmpty()) {
            return 0.0f;
        }

        float totalPoints = 0;

        for (Exam exam : exams) {
            totalPoints += exam.calculateGrade();
        }

        return totalPoints / exams.size();
    }

    public void addTest(Exam exam) {
        exams.add(exam);
    }

    public String getName() {
        return name;
    }
}