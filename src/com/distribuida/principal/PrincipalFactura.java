package com.distribuida.principal;

import java.util.Date;
//import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Cliente;

public class PrincipalFactura {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		FacturaDAO facturaDAO = context.getBean("facturaDAOImpl", FacturaDAO.class);
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);
		
		
		
		Cliente cliente = clienteDAO.findOne(1);
		Factura factura = new Factura(0,"FAC-0099",new Date(), 20.22,2.30,25.23, cliente);
		
		
		//facturaDAO.add(factura);
		
		

		Cliente cliente2 = clienteDAO.findOne(2);
		Factura factura2 = new Factura(86,"FAC-0099",new Date(), 3.3,33.3,35.3, cliente2);
		
		//facturaDAO.up(factura2);
		
		
		//facturaDAO.del(86);
		
		
		
		
		List<Factura> facturas = facturaDAO.findAll();
		
		for (Factura item : facturas) {
			
			System.out.println(item);
			
			
		}
			
			//Factura factura = facturaDAO.findOne(1);
			//System.out.println(factura.toString());
			
			
		
		
		
		context.close();
		
		
		

	}

}
