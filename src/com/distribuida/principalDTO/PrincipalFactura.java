package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dto.ClienteService;
import com.distribuida.dto.FacturaService;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

public class PrincipalFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		FacturaService facturaService = context.getBean("facturaServiceImpl", FacturaService.class);
		
		//crud
		//findall
		
		
		//for (Cliente item : clientes) {
			
		//	System.out.println(item.toString());
			
		//}
		
		//System.out.println(cliente.toString());
		
		//add agregar nuevo registro a la base de datos
		
		//Cliente cliente2 = new Cliente(0,"17321837123","Juan", "Bustamante", "Quito", "0943242349", "jbustamantel@gmail.com");
		//clienteService.add(cliente2);
		//clienteDAO.add(cliente2);
		
		//up editar un registro existente
		//Cliente cliente3 = new Cliente(42,"17321837123","Juan", "Bustamante", "Quito", "0943242349", "jbustamantel@gmail.com");
		//clienteDAO.up(cliente3);
		//clienteService.up(cliente3);
		
		//del borrar
		
		//Cliente cliente3 = new Cliente(40,"1724321234","Luis","Sanchez","Guayaquil","099999999", "lsanchez@gmail.com");
		//facturaService.del(41);
		
		
		List<Factura> factura = facturaService.findAll();
		
		//findOne
		
		//Cliente cliente = clienteService.findOne(1);
		
		
		
		for (Factura item : factura) {
			
			System.out.println(item.toString());	
			
		}
		
		
		
		
		
		
		
		
		
		context.close();
	}
}
