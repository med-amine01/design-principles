package com.chebbi.tech.service;

import java.util.List;
import com.chebbi.tech.entity.Entity;

//common interface to be implemented by all persistence services. 
public interface PersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);

	// This is bad for interface
	public List<T> findByName(String name);
}