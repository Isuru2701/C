class Student {
    private String name, gender;
    private int age;
    private float weight;

    public void setName(String name) {
        this.name = name;
    }
    public void setgender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setweight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }
}

class StudentMain {
    public static void main(String[] args) {
        Student s1  = new Student();
        s1.setName("Amal");
        s1.setAge(17);
        s1.setgender("Male");
        s1.setweight(70.6f);

        System.out.println("Student: " + s1.getName() +  "\tAge: " + s1.getAge() + "\tGender:" + s1.getGender() + "\tWeight" + s1.getWeight());
    }

}