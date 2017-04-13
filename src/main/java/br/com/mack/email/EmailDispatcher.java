package br.com.mack.email;

import com.sendgrid.*;
import java.io.IOException;
    
public class EmailDispatcher {
        
    public static void sendEmail(String to) {
        try {
      SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
      Request request = new Request();
      request.method = Method.POST;
      request.endpoint = "mail/send";
      request.body = "{\"personalizations\":[{\"to\":[{\"email\":\"" + to + "\"}],\"subject\":\"Hello World from the SendGrid Java Library!\"}],\"from\":{\"email\":\"renan.rsg@hotmail.com\"},\"content\":[{\"type\":\"text/plain\",\"value\": \"Hello, Email!\"}]}";
      Response response = sg.api(request);
      System.out.println(response.statusCode);
      System.out.println(response.body);
      System.out.println(response.headers);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    }
}