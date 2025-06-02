public class Student {
    String name;
    String id;
    double[] marks;
    double average;
    char grade;

    public Student(String name, String id, double[] marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
        calculateAverage();
        assignGrade();
    }

    private void calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        this.average = sum / marks.length;
    }

    private void assignGrade() {
        if (average >= 90) grade = 'A';
        else if (average >= 80) grade = 'B';
        else if (average >= 70) grade = 'C';
        else if (average >= 60) grade = 'D';
        else grade = 'F';
    }

    public void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name);
        System.out.printf("Average: %.2f | Grade: %c\n", average, grade);
    }
}
