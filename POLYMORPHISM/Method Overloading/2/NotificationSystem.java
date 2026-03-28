class Notifier {
    // Public
    public void send(String msg) {
        System.out.println("General Alert: " + msg);
    }

    // Protected
    protected void send(String msg, String email) {
        System.out.println("Email sent to " + email + ": " + msg);
    }

    // Default
    void send(String msg, int phone) {
        System.out.println("SMS sent to " + phone + ": " + msg);
    }

    // Private
    private void internalNotification(String msg) {
        System.out.println("Internal System Log: " + msg);
    }

    // Public(access to a private method)
    public void secureSend(String msg) {
        
        internalNotification(msg);
    }
}

class AppNotifier extends Notifier {
    public void displayNotifications() {
		
        
        send("System Update available.");              
        send("Payment pending", "abc@gmail.com");         
        send("OTP: 1234", 987654);              
        
        
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        AppNotifier appnotifier = new AppNotifier();
        
    
        appnotifier.displayNotifications();
        
        
        
        appnotifier.secureSend("Calling Private Method");
    }
}
