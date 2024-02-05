package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.Libro;

public interface LibroService {
	
	public List<Libro> findAll();
	
	public Libro findOne(int id);
	
	public void add(Libro libro);
	
	public void up(Libro libro);
	
	public void del(int id);
	
	//
	
	public List<Libro> findAll(String busqueda);
	

}
