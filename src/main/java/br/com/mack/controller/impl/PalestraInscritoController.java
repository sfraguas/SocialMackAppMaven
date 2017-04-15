package br.com.mack.controller.impl;

import br.com.mack.controller.AbstractController;
import br.com.mack.persistence.PalestraDAO;
import br.com.mack.persistence.entities.Palestra;
import br.com.mack.persistence.entities.Participante;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PalestraInscritoController extends AbstractController {

    PalestraDAO palestraDAO = new PalestraDAO();

    @Override
    public void execute() {
        Participante participante = (Participante) getRequest().getSession().getAttribute("participante");
        long id_participante = participante.getId_pessoa();

        try {
            List<Palestra> palestras = palestraDAO.readByIdParticipante(id_participante);
            getRequest().getSession().setAttribute("palestras", palestras);
        } catch (Exception ex) {
            Logger.getLogger(PalestraInscritoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        setReturnPage("palestrascadastradas.jsp");
    }

}
