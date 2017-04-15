package br.com.mack.email;

import com.sendgrid.*;
import java.io.IOException;

    public class EmailDispatcher {
                

        public static void sendEmail(String email) {
        
             Email from = new Email("iuri_novaes.2010@hotmail.com");
             
                String subject = "Hello World from Mackenzie!";
                
                Email to = new Email(email);
                
                Content content = new Content("text/plain", "Hello, Email!");
                
                Mail mail = new Mail(from, subject, to, content);
            
                SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
                Request request = new Request();
                try {
                  request.method = Method.POST;
                  request.endpoint = "mail/send";
                  request.body = mail.build();
                  Response response = sg.api(request);
                } catch (IOException ex) {
                  ex.printStackTrace();
                }
  
        }
    }