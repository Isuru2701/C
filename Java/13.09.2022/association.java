/*
ASSOCIATION - how one class interacts with another


HAS-A relationship
Eg: A student has a module
A driver has a vehicle
A seller sells a product
_________           ___________
|Student|  1  has 1 |  Module |
|-------|           |---------|
|-name  |-----------|-duration|
|-------|    >      |---------|
 */

class Student {
    private String name;
    Module module;

    public Student(String name, float duration) {
        this.name = name;
        module = new Module(duration);
    }

    public void showDetails(){
        System.out.println("Student name: " + name + " Module duration: " + module.getDuration());
    }

}

class Module {
    private float duration;

    public Module(float duration) {
        this.duration = duration;
    }

    public float getDuration() {
        return duration;
    }
}

class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Joe", 45);
        st1.showDetails();
    }
}