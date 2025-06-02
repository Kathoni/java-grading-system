public class Student {
    String name;
    String id;
    double[] marks;

    public Student(String name, String id, double[] marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.printf("Average Marks: %.2f\n", calculateAverage());
    }
}
