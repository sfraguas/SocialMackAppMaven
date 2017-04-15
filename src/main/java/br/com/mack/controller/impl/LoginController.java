
package br.com.mack.controller.impl;

import br.com.mack.controller.AbstractController;
import br.com.mack.persistence.ParticipanteDAO;
import br.com.mack.persistence.entities.Participante;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginController extends AbstractController {
    
    ParticipanteDAO participanteDAO = new ParticipanteDAO();
    

    @Override
    public void execute() {
        System.out.println("FUNCIONOU");
        
        String email = this.getRequest().getParameter("email");
        String password = this.getRequest().getParameter("password");
        
        try {
            Participante p = participanteDAO.readByEmail(email);
            if((email.equals(p.getEmail()))&&(password.equals(p.getPassword()))){
                getRequest().getSession().setAttribute("participante", participante);
                this.setReturnPage("sucesso.jsp");
            }else{
                this.setReturnPage("erro.jsp");
            }          
            
        } catch (Exception ex) {
            Logger.getLogger(CadastroController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
