package br.com.mack.controller.impl;

import br.com.mack.persistence.TesteConnection;

import br.com.mack.controller.AbstractController;
import br.com.mack.persistence.ParticipanteDAO;
import br.com.mack.persistence.entities.Participante;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.lang.Exception;

public class CadastroController extends AbstractController {

    ParticipanteDAO participanteDAO = new ParticipanteDAO();
    

    @Override
    public void execute() {
        System.out.println("FUNCIONOU");
        //TesteConnection connection = new TesteConnection();
        
        String name = this.getRequest().getParameter("name");
        String email = this.getRequest().getParameter("email");
        Participante participante = new Participante();
        participante.setNome(name);
        participante.setEmail(email);
        
        try {
            participanteDAO.create(participante);
            getRequest().getSession().setAttribute("participante", participante);
        } catch (Exception ex) {
            Logger.getLogger(CadastroController.class.getName()).log(Level.SEVERE, null, ex);
            this.setReturnPage("erro.jsp");
        }
        this.setReturnPage("sucesso.jsp");
    }
}