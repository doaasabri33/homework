
package newpackage;

class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class Q7 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Alice", 101);
        students[1] = new Student("Bob", 102);
        students[2] = new Student("Charlie", 103);

        for (Student s : students) {
            System.out.println("Name: " + s.name + ", ID: " + s.id);
        }
    }
}
