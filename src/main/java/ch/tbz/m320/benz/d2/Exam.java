package ch.tbz.m320.benz.d2;

class Exam {
    private int points;
    private int totalPoints;

    public Exam(int points, int totalPoints) {
        this.points = points;
        this.totalPoints = totalPoints;
    }

    public float calculateGrade() {
        return (float) points * 5 / totalPoints + 1;
    }
}