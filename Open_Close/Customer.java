package Open_Close;

public class Customer {
    private String name;
    private double amount;
    private Discount discount;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public Discount getDiscount(){
        return discount;
    }

    public void setDiscount(Discount discount){
        this.discount = discount;
    }
}
