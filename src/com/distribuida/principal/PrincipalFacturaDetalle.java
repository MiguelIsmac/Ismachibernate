package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Factura;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.dao.FacturaDetalleDAO;
import com.distribuida.entities.Libro;
import com.distribuida.dao.LibroDAO;



public class PrincipalFacturaDetalle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		FacturaDetalleDAO facturadetalleDAO = context.getBean("facturadetalleDAOImpl", FacturaDetalleDAO.class);
			
//		FacturaDetalle facturadetalle2 = new FacturaDetalle(0,"2",30.45,0,0);
//		facturadetalleDAO.add(facturadetalle2);
//		Facturadetalle facturadetalle3 = new Facturadetalle(0,"2",30.45,0,0);;
//		facturadetalleDAO.up(facturadetalle3);
		
//		facturadetalleDAO.del(39);
		
		List<FacturaDetalle> facturadetalles = facturadetalleDAO.findAll();
		
		FacturaDetalle facturadetalle = facturadetalleDAO.findOne(1);
		
		
		for (FacturaDetalle item : facturadetalles) {
			System.out.println(item.toString());
		}
		
//		System.out.println(cliente.toString());
		
		context.close();
				
		
	}

}