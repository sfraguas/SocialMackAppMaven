package br.com.mack.email;

import com.sendgrid.*;
import java.io.IOException;

    public class EmailDispatcher {
                

        public static void sendEmail(String email) {
        
            try {
              SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
              Request request = new Request();
              request.method = Method.POST;
              request.endpoint = "mail/send";
              request.body = "{\"personalizations\":[{\"to\":[{\"email\":\"iuri_novaes.2010@hotmail.com\"}],\"subject\":\"Hello World from Mackenzie!\"}],\"from\":{\"email\":\"yuri.novaes.2013@gmail.com\"},\"content\":[{\"type\":\"text/plain\",\"value\": \"Hello, Email!\"}]}";
              Response response = sg.api(request);
            } catch (IOException ex) {
              ex.printStackTrace();
            }
  
        }
    }