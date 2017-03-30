package br.com.mack.persistence;

import java.util.List;

public interface GenericDAO<E> {
    public void create(E e)throws Exception;
    
    public List<E> readAll()throws Exception; 
    public E readById(long id)throws Exception; 
    
    public void update(E e)throws Exception;
    
    public void delete(E e)throws Exception;
    
    
}