class Student {
    private void show() {
        System.out.println("I am a student");
    }
    public void display() {
        show();
    }
}

class PublicPrivate {
    public static void main(String[] args) {
        Student newStudent = new Student();
        newStudent.display();
        //newStudent.show() does not run because it is a private method
    }
}

