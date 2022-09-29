class Ward {
    private int wno, capacity, current;

    public Ward(int wno, int capacity, int current) {
        this.wno = wno;
        this.capacity = capacity;
        this.current = current;
    }

    public void admitPatient(Patient patient) {
        if (current < capacity){
            System.out.println("Patient " + patient.getPno() + " admitted to ward " + wno);
            this.current += 1;
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
        Ward w1 = new Ward(1, 10, 9);
        Ward w2 = new Ward(2, 5, 4);
        Patient p1 = new Patient(1, "John");
        Patient p2 = new Patient(2, "Jack");
        Patient p3 = new Patient(3, "Harry");


        w1.admitPatient(p1);
        w1.admitPatient(p2);
        w1.admitPatient(p3);

        w2.admitPatient(p2);
        w2.admitPatient(p3);

    }
}