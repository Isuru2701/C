class Student {
    private String name;
}

class OOP {
    public static void main(String[] args) {
        Student student_1 = new Student();
        student_1.name = "Amal"; //Does not run because name is a private attribute in the Student class.
        System.out.println(student_1.name);
    }
}