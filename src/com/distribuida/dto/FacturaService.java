package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.Factura;

public interface FacturaService {
public List<Factura> findAll();
	
	public Factura findOne(int id);
	
	public void add(Factura factura);
	
	public void up(Factura factura);
	
	public void del(int id);
	
	public List<Factura> findAll(String busqueda);

}

