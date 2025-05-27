// class EmailService {
//     void sendEmail(String message, String recipient) { ... }
// }

// public class Notification {
//     EmailService emailService;
    
//     void sendNotification(String message, String recipient) {
//         // What if we don't want to send emails anymore?
//         // What if the email service changes?
//         emailService.sendEmail(message, recipient);
//     }
// }

// Adhering to the Dependency Inversion Principle
interface MessageService {
    void sendMessage(String message, String recipient);
}

class EmailService implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        // Not real code
    }
}

public class Notification {
    MessageService messageService;
    
    void sendNotification(String message, String recipient) {
        // Now we can change the message service whenever we want
        // Depending on an interface is better than depending on a class
        messageService.sendMessage(message, recipient);
    }
}