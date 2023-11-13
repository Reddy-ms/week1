import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name; 
    double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
     }
}

class Grade {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

         while (true) {
            System.out.println("1. Add new student");
             System.out.println("2. View list of students");
             System.out.println("3. Calculate average grade");
             System.out.println("4. Exit");

         int choice = scanner.nextInt();

         switch (choice) {
            case 1:
                     System.out.print("Enter student name: ");
                     String name = scanner.next();
                     System.out.print("Enter grade: ");
                      double grade = scanner.nextDouble();

                      students.add(new Student(name, grade));
                       break;
             case 2:
                     System.out.println("List of students:");
                     for (Student student : students) {
                        System.out.println("Name: " + student.name + ", Grade: " + student.grade);
                     }
                    break;
                     case 3:
                     if (students.isEmpty()) {
                         System.out.println("No students added yet.");
                     } else {
                         double sum = 0;
                         for (Student student : students) {
                            sum += student.grade;
                     }
                         double average = sum / students.size();
                     System.out.println("Average grade: " + average);
                     }
                    break;
                case 4:
                 System.out.println("Exiting program.");
                  System.exit(0);
                   break;
                    default:
               System.out.println("Invalid choice. Please enter a valid option.");
            }
         }
    }
}