class Student {
    private String name;
    public Student(String name) {
        this.name = nane;
    }

    public String getName() {
        return name;
    }
}

class OOP {
    public static void main(String[] args) {
        //does not work
        // Student() constructor must be passed a String name argument
        Student student_1 = new Student();
        student_1.setName("Amal");
        System.out.println(student_1.getName());
    }
}