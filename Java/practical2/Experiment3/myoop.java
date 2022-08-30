class Student {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class OOP {
    public static void main(String[] args) {
        Student student_1 = new Student();
        student_1.setName("Amal");
        System.out.println(student_1.getName());
    }
}