public class Samsung implements Call, SMS, Web, Picture{
    @Override
    public void makeCall(String number){
        System.out.println("Calling: " + number);
    }

    @Override
    public void sendSMS(String number, String message){
        System.out.println("Sending message to: " + number);
        System.out.println("Message: " + message);
    }

    @Override
    public void browseWeb(String url){
        System.out.println("Browsing: " + url);
    }

    @Override
    public void takePicture(){
        System.out.println("Taking picture in 3 2 1...");
    }
    
}