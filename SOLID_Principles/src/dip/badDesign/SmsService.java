package dip.badDesign;

public class SmsService {
    public void sendSms(String Sms, String message) {
        System.out.println("Sending email to " + Sms);
        System.out.println(message);
    }
}
