package br.com.mack.email;


import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;


    public class EmailDispatcher {
                
        private static final String FROM_EMAIL = "renan.databyte@gmail.com";
        private static final String FROM_PASSWORD = "vermelhodb";
        
        public static void sendEmail(String to) {
            SimpleEmail email = new SimpleEmail();
            try {
                email.setDebug(true);
                email.setHostName("smtp.gmail.com");
                //email.setSmtpPort(465);
                email.setAuthenticator(new DefaultAuthenticator(FROM_EMAIL, FROM_PASSWORD));
                //email.setSSLOnConnection(true);
                email.setFrom(FROM_EMAIL);
                email.setSubject("Senha automatica");
                email.setMsg("codigo que a gente vai gerar");
                email.addTo(to);
                //email.getMailSession().getProperties().put("mail.smtp.auth", "true");
                email.send();                
            } catch (EmailException e) {
                e.printStackTrace();
            }
        }
    }