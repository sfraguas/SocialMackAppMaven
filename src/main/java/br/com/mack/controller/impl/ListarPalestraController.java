package br.com.mack.controller.impl;

import br.com.mack.controller.AbstractController;
import br.com.mack.persistence.PalestraDAO;
import br.com.mack.persistence.entities.Palestra;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListarPalestraController extends AbstractController {


    PalestraDAO palestraDAO = new PalestraDAO();
    

    @Override
    public void execute() {
        List<Palestra> palestras = null;
        setReturnPage("erro.jsp");
        try {
            palestras = palestraDAO.readAll();
//            for(Palestra palestra:palestras){
//                System.out.println(palestra);
//            }
            setReturnPage("user_area/lista_palestras.jsp");
        } catch (Exception ex) {
            Logger.getLogger(ListarPalestraController.class.getName()).log(Level.SEVERE, null, ex);
        }
        getRequest().getSession().setAttribute("palestras", palestras);
    }
}