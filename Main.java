import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        int choice;

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("\n--- Student Grade Management ---");
                System.out.println("1. Add Student");
                System.out.println("2. View All Students");
                System.out.println("3. Exit");
                System.out.print("Enter choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Student Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Student ID: ");
                        String id = scanner.nextLine();
                        double[] marks = new double[3];
                        System.out.println("Enter marks for 3 subjects:");
                        for (int i = 0; i < 3; i++) {
                            System.out.print("Subject " + (i + 1) + ": ");
                            marks[i] = scanner.nextDouble();
                        }
                        Student student = new Student(name, id, marks);
                        studentList.add(student);
                        System.out.println("Student added successfully!");
                    }
                    case 2 -> {
                        System.out.println("\n--- Student Records ---");
                        for (Student s : studentList) {
                            s.displayInfo();
                        }
                    }
                    case 3 -> System.out.println("Exiting program...");
                    default -> System.out.println("Invalid choice. Try again.");
                }
            } while (choice != 3);
        }
    }
}
