package br.com.mack.controller.impl;

import br.com.mack.controller.AbstractController;
import br.com.mack.email.EmailDispatcher;

public class EmailController extends AbstractController{
    
    private EmailDispatcher emailDispatcher;
    
    @Override
    public void execute() {
        String to = getRequest().getParameter("email");
        emailDispatcher.sendEmail(to);
    }

}