package br.com.mack.persistence;

import java.util.List;

public interface GenericDAO<E> {
    public void create(E e);
    
    public List<E> readAll(); 
    
    public E readById(long id); 
    
    public void update(E e);
    
    public void delete(E e);
    
    
}