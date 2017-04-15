package br.com.mack.controller.impl;

import br.com.mack.controller.AbstractController;
import br.com.mack.persistence.PalestraDAO;
import br.com.mack.persistence.ParticipanteDAO;
import br.com.mack.persistence.entities.Palestra;
import br.com.mack.persistence.entities.Participante;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author 41583469
 */
public class RegistrarPalestraController extends AbstractController {

    PalestraDAO palestraDAO = new PalestraDAO();
    @Override
    public void execute() {
        Participante participante = (Participante) getRequest().getSession().getAttribute("participante");
        long id_participante = participante.getId_pessoa();

        long id_palestra = Long.parseLong(getRequest().getParameter("idPalestra"));
        try {
            palestraDAO.registerInPalestra(id_participante,id_palestra);
        } catch (Exception ex) {
            Logger.getLogger(RegistrarPalestraController.class.getName()).log(Level.SEVERE, null, ex);
        }
        setReturnPage("sucesso.jsp");
    }
}