package br.com.mack.email;

import com.sendgrid.*;
import java.io.IOException;
    
public class EmailDispatcher {
        
    public static void sendEmail(String to) {
        Email from = new Email("renan.databyte@gmail.com");
        String subject = "Teste";
        Email toMail = new Email(to);
        Content content = new Content("text/plain", "E-mail de teste");
        Mail mail = new Mail(from, subject, toMail, content);
        
        SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
        Request request = new Request();
        
        try{
            request.method = Method.POST;
            request.endpoint = "main/send";
            request.body = mail.build();
            Response response = sg.api(request);
            System.out.println(response.statusCode);
            System.out.println(response.body);
            System.out.println(response.headers);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}