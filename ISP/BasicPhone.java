public class BasicPhone implements Call, SMS{
    @Override
    public void makeCall(String number){
        System.out.println("Calling: " + number);
    }

    @Override
    public void sendSMS(String number, String message){
        System.out.println("Sending message to: " + number);
        System.out.println("Message: " + message);
    }
}