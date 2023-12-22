package ch.tbz.m320.benz.d2;

import java.util.ArrayList;
import java.util.List;

class SchoolClass {
    private List<Student> students;

    public SchoolClass() {
        this.students = new ArrayList<>();
    }

    public float getAverage() {
        if (students.isEmpty()) {
            return 0.0f;
        }

        float classTotalPoints = 0;
        int studentCount = 0;

        for (Student student : students) {
            classTotalPoints += student.getNotenSchnitt();
            studentCount++;
        }

        return classTotalPoints / studentCount;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}
