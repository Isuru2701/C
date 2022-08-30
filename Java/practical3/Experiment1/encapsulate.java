class Account {
    private long acc_no;
    private String name, email;
    private float amount;

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}

class ExampleProgram {
    public static void main(String[] args) {
        Account accObj = new Account();
        accObj.setAcc_no(101);
        accObj.setName("Saman");
        accObj.setAmount(15000);
        accObj.setEmail("saman@gmail.com");

        System.out.println("Account Number - " + accObj.getAcc_no());
        System.out.println("Account Name - " + accObj.getName());
        System.out.println("Account Email - " + accObj.getEmail());
        System.out.println("Account Amount - " + accObj.getAmount());

    }
}