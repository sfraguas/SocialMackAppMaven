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
                email.setSmtpPort(465);
                email.addTo(to, "Yuri");
                email.setFrom(FROM_EMAIL, "Renan");
                email.setSubject("Geração de Senha");
                email.setMsg("Senha para consumo externo");
                email.setSSL(true);
                email.setAuthentication(FROM_EMAIL, FROM_PASSWORD);
                email.send();
                //email.setAuthenticator(new DefaultAuthenticator(FROM_EMAIL, FROM_PASSWORD));
                //email.setSSL(true);
                //email.setFrom(FROM_EMAIL);
                //email.setSubject("Senha automatica");
               // email.setMsg("codigo que a gente vai gerar");
                //email.addTo("iuri_novaes.2010@hotmail.com");
                //email.getMailSession().getProperties().put("mail.smtp.auth", "true");
                //email.send();
            } catch (EmailException e) {
                    e.printStackTrace();
                }   
        }
    }