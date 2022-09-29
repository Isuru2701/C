class Ward {
    private int wno, capacity, current;

    public Ward(int wno, int capacity, int current) {
        this.wno = wno;
        this.capacity = capacity;
        this.current = current;
    }

    public void admitPatient(Patient patient) {
        if (current + 1 < capacity){
            System.out.println("Patient " + patient.getPno() + " admitted to ward " + wno);
        }
        else {
            System.out.println("Ward " + wno + " is full");
        }
    }



}

class Patient {
    private int pno;
    private String name;

    public int getPno() {
        return pno;
    }

    public String getName() {
        return name;
    }

    public Patient(int pno, String name) {
        this.pno = pno;
        this.name = name;
    }
}

class MedYard {
    public static void main(String[] args) {
        Ward w1 = new Ward(1, 10, 10);
        Patient p1 = new Patient(1, "John");

        w1.admitPatient(p1);

    }
}