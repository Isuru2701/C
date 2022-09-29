class Ward {
    private int wno, capacity, current;

    public Ward(int wno, int capacity, int current) {
        this.wno = wno;
        this.capacity = capacity;
        this.current = current;
    }

    public int getWno() {
        return wno;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrent() {
        return current;
    }
    public void setCurrent(int current) {
        this.current = current;
    }


}

class Patient {
    private int pno;
    private String name;
    private Ward ward;

    public Patient(int pno, String name) {
        this.pno = pno;
        this.name = name;
    }

    public void admitPatient(Ward ward) {
        this.ward = ward;
        if (ward.getCurrent() < ward.getCapacity()) {
            System.out.println("Patient " + pno + " admitted to ward " + ward.getWno());
            ward.setCurrent(ward.getCurrent() + 1);
        } else {
            System.out.println("Ward " + ward.getWno() + " is full");
        }
    }
}

class MedYard {
    public static void main(String[] args) {

        //dummy data
        Ward w1 = new Ward(1, 10, 9);
        Ward w2 = new Ward(2, 5, 4);
        Patient p1 = new Patient(1, "John");
        Patient p2 = new Patient(2, "Jack");
        Patient p3 = new Patient(3, "Harry");

        p1.admitPatient(w1);
        p2.admitPatient(w1);


    }
}