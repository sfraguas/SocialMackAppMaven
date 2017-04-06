/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mack.persistence;

import br.com.mack.persistence.entities.Participante;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Persistence;
import javax.persistence.Query;

//@LocalBean
//@Stateful
public class ParticipanteDAO implements GenericDAO<Participante> {

    @PersistenceContext(unitName = "SocialMackAppPU", type = PersistenceContextType.EXTENDED)
    private EntityManager em ;
    private EntityTransaction et;
    
    public ParticipanteDAO(){
        System.out.print("Antes");
        this.et = em.getTransaction();
        System.out.print("Depois");
        
    }

     @Override
    public void create(Participante participante) throws Exception {
        et.begin();
        em.persist(participante);
        et.commit();
    }
    
    @Override
    public List<Participante> readAll() throws Exception {
    
        Query q = em.createQuery("SELECT p FROM Participante p");
        List<Participante> lista = q.getResultList();
        return lista;
    }
    
    @Override
    public Participante readById(long id) throws Exception {
        return em.find(Participante.class, id); //EAGER
//        return em.getReference(Participante.class, id) //LAZY
    }
    
    @Override
    public void update(Participante participante) throws Exception {
        et.begin();
        em.persist(em.merge(participante));
        et.begin();
    }
    
    @Override
    public void delete(Participante participante) throws Exception {
        et.begin();
        em.remove(em.merge(participante));
        et.begin();
    }
}