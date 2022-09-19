class Farmer{

       private String farmer_ID;
       private String farmer_Name;
       private String address;
       private String type;
       private double income;

       Milk m1;
       Milk m2;
       Milk m3;

       IceCream i1;

       public Farmer(String farmer_ID,String farmer_Name,String address){
            this.farmer_ID = farmer_ID;
            this.farmer_Name = farmer_Name;
            this.address = address;
           

            m1 = new Milk("high");

            i1 = new IceCream(500);
            
       }

       private void getIncome(){

        if(m1.showType() == "high" ){
           income = 250 * 50 + (i1.showPrice());
        }
        else if(m1.showType() == "medium"){
            income = 150 * 30 + (i1.showPrice());
        }
        else if(m1.showType() == "low"){
            income = 80 * 20 + (i1.showPrice());
        }
        
    }

     public void showDetails(){
        getIncome();
        System.out.println("Farmer's ID: "+farmer_ID);
        System.out.println("Farmer's Name: "+farmer_Name);
        System.out.println("Farmer's Address: "+address);
        System.out.println("Total Income: "+income);
        
     }
}

class Milk{

    private String milk_Type;

    public Milk(String milk_Type){
       this.milk_Type = milk_Type;
    }

    public String showType(){
        return milk_Type;
    }

}

class IceCream{
  
    private static int price = 500;

    public IceCream(int price){
        this.price = price;
    }
    
    public int showPrice(){
        return price;
    }
}


class Question5 {
    public static void main(String[] args) {
        
        Farmer f1 = new Farmer("15138L", "Varun", "colombo");

        f1.showDetails();
           
    }
    
}