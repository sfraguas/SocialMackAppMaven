package br.com.mack.controller.impl;

import br.com.mack.controller.AbstractController;
import br.com.mack.persistence.ParticipanteDAO;
import br.com.mack.persistence.entities.Participante;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class CadastroController extends AbstractController {

    ParticipanteDAO participanteDAO = new ParticipanteDAO();

    @Override
    public void execute() {
        System.out.println("FUNCIONOU");
        String name = this.getRequest().getParameter("name");
        String email = this.getRequest().getParameter("email");
        Participante participante = new Participante();
        participante.setNome(name);
        participante.setEmail(email);

        getRequest().getSession().setAttribute("participante", participante);
        try {
            participanteDAO.create(participante);
        } catch (Exception ex) {
            Logger.getLogger(CadastroController.class.getName()).log(Level.SEVERE, null, ex);
        }


        this.setReturnPage("user_area/lista_palestras.jsp");
    }
}