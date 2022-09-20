class Room {
    protected int room_number, number_of_days_booked;
    protected float room_daily_fee;

}

class LuxuryRoom extends Room {

    private float tax_amount, income;

    LuxuryRoom(int room_number, int number_of_days_booked, float room_daily_fee, float tax_amount) {
        this.room_number = room_number;
        this.number_of_days_booked = number_of_days_booked;
        this.room_daily_fee = room_daily_fee;
        this.tax_amount = tax_amount;
    }
    public void calIncome(){
        income = (number_of_days_booked * room_daily_fee) + tax_amount;
        System.out.println("Income for room No."  + room_number);
        System.out.println("LKR "  + income);

    }


}

class hotel {
    public static void main(String[] args) {
        LuxuryRoom r1 = new LuxuryRoom(302, 10, 21000F, 10242.2F);
        r1.calIncome();
    }
}