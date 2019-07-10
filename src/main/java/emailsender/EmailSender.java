package emailsender;

import org.springframework.stereotype.Service;

public interface EmailSender {

    void sendEmail(String to, String subject, String content);
}
