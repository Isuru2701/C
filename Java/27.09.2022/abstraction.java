abstract class Student {
    abstract public void show();
}

class Junior extends Student {
    public void show(){
        System.out.println("This is a junior student");
    }
}

class abstraction {
    public static void main(String[] args) {
        Junior junior = new Junior();
        junior.show();
    }
}