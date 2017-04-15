package br.com.mack.controller.impl;
 
 import br.com.mack.controller.AbstractController;
 import br.com.mack.email.EmailDispatcher;
 
 public class EmailController extends AbstractController{
     
     @Override
     public void execute() {
         String email = this.getRequest().getParameter("email");
         EmailDispatcher.sendEmail(email);
     }
 } 