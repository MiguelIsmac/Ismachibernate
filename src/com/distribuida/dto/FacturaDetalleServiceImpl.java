package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.FacturaDAO;
import com.distribuida.dao.FacturaDetalleDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Libro;



@Service
public class FacturaDetalleServiceImpl implements FacturaDetalleService {

	
	
	@Autowired
	private FacturaDetalleDAO facturaDetalleDAO;
	
	@Autowired
	private FacturaDAO facturaDAO;
	
	@Autowired
	
	private LibroDAO libroDAO;
	


	@Override
	public List<FacturaDetalle> findAll() {
		// TODO Auto-generated method stub
		return facturaDetalleDAO.findAll();
	}

	@Override
	public FacturaDetalle findOne(int id) {
		// TODO Auto-generated method stub
		return facturaDetalleDAO.findOne(id);
	}

	@Override
	public void add(FacturaDetalle facturaDetalle) {
		// TODO Auto-generated method stub
		
		
		Factura factura = facturaDAO.findOne(facturaDetalle.getFactura().getIdFactura());
		
		
		Libro libro = libroDAO.findOne(facturaDetalle.getLibro().getIdLibro());
		
		if (factura  != null && libro != null ) {
			
			facturaDetalleDAO.add(facturaDetalle);
		}
			
		
		
		
		
	}

	@Override
	public void up(FacturaDetalle facturaDetalle) {
		// TODO Auto-generated method stub
		
Factura factura = facturaDAO.findOne(facturaDetalle.getFactura().getIdFactura());
		
		
		Libro libro = libroDAO.findOne(facturaDetalle.getLibro().getIdLibro());
		
		if (factura  != null && libro != null ) {
			
			facturaDetalleDAO.up(facturaDetalle);
		}
		
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		
		facturaDetalleDAO.del(id);
	}

	@Override
	public List<FacturaDetalle> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return facturaDetalleDAO.findAll(busqueda);
	}
	
	
	
	}
