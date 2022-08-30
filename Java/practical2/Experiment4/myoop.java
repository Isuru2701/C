class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class OOP {
    public static void main(String[] args) {
        //does not work
        // Student() constructor must be passed a String name argument
        Student student_1 = new Student("Isuru");
        student_1.setName("Amal");
        System.out.println(student_1.getName());
    }
}