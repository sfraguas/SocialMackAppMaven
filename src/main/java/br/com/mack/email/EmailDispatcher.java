package br.com.mack.email;

import com.sendgrid.*;
import java.io.IOException;

    public class EmailDispatcher {
                

        public static void sendEmail(String email) {
        
                Email from = new Email("yuri.novaes.2013@gmail.com");
                String subject = "Testando SendGrid";
                Email to = new Email(email);
                Content content = new Content("text/plain", "Testando email com Send Grid");
                Mail mail = new Mail(from, subject, to, content);
        
                try {
                    SendGrid sg = new SendGrid("SENDGRID_API_KEY");
                    Request request = new Request();
                    request.method = Method.POST;
                    request.endpoint = "mail/send";
                    request.body = mail.build();
                    Response response = sg.api(request);
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                }
  
        }
    }