package br.com.mack.email;

import com.sendgrid.*;
import java.io.IOException;

    public class EmailDispatcher {
                

        public static void sendEmail(String emailTo) {
            Email from = new Email("yuri.novaes.2013@gmail.com");
            
            String subject = "Hello World from Mackenzie Brazil!";
            Email email = new Email(emailTo);
            Content content = new Content("text/plain", "Mackenzie ensina");
            Mail mail = new Mail(from, subject, email, content);
            
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