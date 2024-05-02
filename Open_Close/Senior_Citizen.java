package Open_Close;

public class Senior_Citizen implements Discount{
    @Override
    public double calculateDiscount(double amount){
        return amount * 0.10;
    }
}
