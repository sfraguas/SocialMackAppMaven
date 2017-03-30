/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mack.persistence;

import br.com.mack.persistence.entities.Palestra;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author 41583469
 */
//@LocalBean
//@Stateful
public class PalestraDAO implements GenericDAO<Palestra> {

    //@PersistenceContext(unitName = "SocialMackAppPU", type = PersistenceContextType.EXTENDED)
    private EntityManager em ;
    private EntityTransaction = et;
    
    public PalestraDAO(){
        this.em = Persistence.createEntidyManagerFactory("SocialMackAppPU").createEntidyManager();
        this.et = entityManager.getTransaction();
    }

    @Override
    public void create(Palestra participante) throws Exception {
        et.begin();
        em.persist(participante);
        et.commit();
    }

    @Override
    public List<Palestra> readAll() throws Exception {
        et.begin();
        Query q = em.createQuery("SELECT p FROM Palestra p");
        List<Palestra> lista = q.getResultList();
        return lista;
        et.commit();
    }

    @Override
    public Palestra readById(long id) throws Exception {
        et.begin();
        Palestra palestra = (Palestra) em.find(Palestra.class, id);
        return palestra;
        et.commit();
    }

    @Override
    public void update(Palestra e) throws Exception {
        et.begin();
        em.persist(em.merge(e));
        et.commit();
    }

    @Override
    public void delete(Palestra e) throws Exception {
        et.begin();
        em.remove(em.merge(e));
        et.commit();
    }

}