package br.com.mack.email;

import com.sendgrid.*;
import java.io.IOException;
    
public class EmailDispatcher {
        
    public static void sendEmail(String to) {
        System.out.println("Arrived e-mail: " + to);
        Email from = new Email("renan.rsg@hotmail.com");
        String subject = "Hello World from the SendGrid Java Library!";
        Email toMail = new Email(to);
        Content content = new Content("text/plain", "Hello, Email!");
        Mail mail = new Mail(from, subject, toMail, content);

        SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
        Request request = new Request();
        try {
            request.method = Method.POST;
            request.endpoint = "mail/send";
            request.body = mail.build();
            Response response = sg.api(request);
            System.out.println(response.statusCode);
            System.out.println(response.body);
            System.out.println(response.headers);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}